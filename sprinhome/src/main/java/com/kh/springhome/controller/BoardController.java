package com.kh.springhome.controller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;
import com.kh.springhome.error.NoTargetException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, HttpSession session) {
		int boardNo = boardDao.sequence(); //보드no를 시퀀스로 지정
		boardDto.setBoardNo(boardNo);
		
		String memberId = (String) session.getAttribute("storage");
		boardDto.setBoardWriter(memberId);
		
		//이 사용자의 마지막 글번호를 조회
		Integer lastNo = boardDao.selectMax(memberId);
		
		//글을 등록하고
		boardDao.insert(boardDto);
		
		//포인트 계산 작업
		//- lastNo가 null이라는 것은 처음 글을 작성했다는 의미
		//- lastNo가 null이 아니면 조회한 다음 시간차를 비교
		if(lastNo == null) {//처음이라면
			memberDao.increaseMemberPoint(memberId, 10);//10점 부여
		}
		else {//처음이 아니라면 시간 차이를 계산
			BoardDto lastDto = boardDao.selectOne(lastNo);
			Timestamp stamp = new Timestamp(lastDto.getBoardCtime().getTime());
			LocalDateTime lastTime = stamp.toLocalDateTime();
			LocalDateTime currentTime = LocalDateTime.now();
			
			Duration duration = Duration.between(lastTime, currentTime);
			long seconds = duration.getSeconds();
			if(seconds > 300) {//시간차가 300초보다 크다면(5분 초과)
				memberDao.increaseMemberPoint(memberId, 10);//10점 부여
			}
		}	
		return "redirect:detail?boardNo=" + boardNo;
	}
	
	//목록+검색
	//- 검색일 경우에는 type과 keyword라는 파라미터가 존재
	//- 목록일 경우에는 type과 keyword라는 파라미터가 없음
	//- 만약 불완전한 상태(type이나 keyword만 있는 경우)라면 목록으로 처리
	@RequestMapping("/list")
	public String list(Model model,
			@RequestParam(required = false) String type,
			@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
		if(isSearch) {//검색일 경우
			List<BoardListDto> list = boardDao.selectList(type, keyword);
			model.addAttribute("list",list);
			model.addAttribute("isSearch",true);
		}
		else {//목록일 경우
//			List<BoardListDto> list = boardDao.selectList();
//			model.addAttribute("list", list);
			model.addAttribute("list", boardDao.selectList());
			model.addAttribute("isSearch", false);
		}
		return "/WEB-INF/views/board/list.jsp";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model, HttpSession session) {
		
		//조회수 중복 방지를 위한 마스터플랜
		//1. 세션에 history라는 이름의 저장소가 있는지 확인
		//2. 없으면 생성, 있으면 추출
		//3. 지금 읽는 글 번호가 history에 존재하는지 확인
		//4. 없으면 추가하고 다시 세션에 저장
		
//		Set<Integer> history;
//		if(session.getAttribute("history") != null) { //있으면 (1)
//			history = (Set<Integer>) session.getAttribute("history");//(2)
//		}
//		else {//없으면 (1)
//			history = new HashSet<>();//(2)
//		}
//		
//		boolean isRead = history.contains(boardNo); //(3)
//		
//		if(isRead == false) { //읽은 적이 없으면 (4)
//			history.add(boardNo); //글번호를 추가하고
//			session.setAttribute("history", history); //session갱신
//		}
////		log.debug("history = {}",history);
//		if(isRead == false) {
//			boardDao.updateBoardReadcount(boardNo);
//		}
//		String writer = (String) session.getAttribute("storage");
		BoardDto boardDto = boardDao.selectOne(boardNo);
//		if(isRead == false) {
//			if(boardDto.getBoardWriter() == null) {
//				boardDao.updateBoardReadcount(boardNo);
//			}
//			else {
//				if(boardDto.getBoardWriter().equals(writer) == false) {
//					boardDao.updateBoardReadcount(boardNo); //조회수 증가
//				}
//			}
//		}
		model.addAttribute("boardDto", boardDto);
		
		//작성자의 회원정보 추가
		String boardWriter = boardDto.getBoardWriter();
		if(boardWriter != null) {
			MemberDto memberDto = memberDao.selectOne(boardWriter);
			model.addAttribute("writerDto", memberDto);
		}
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		if(boardDao.update(boardDto)) {
			return "redirect:detail?boardNo=" + boardDto.getBoardNo();
		}
//		else return "redirect:에러페이지 주소";
		else throw new NoTargetException("존재하지 않는 게시글 번호");
	}
	
	//삭제
	//- 만약 소유자 검사를 추가한다면
	//- 현재 로그인 한 사용자와 게시글 작성자가 같다면 소유자로 판정
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo , HttpSession session) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		String boardWriter = boardDto.getBoardWriter();
		String memberId = (String) session.getAttribute("storage");
		if(memberId.equals(boardWriter)) {
			boardDao.delete(boardNo);
			return "redirect:list";
		}
		else {
			//return "redirect:에러페이지";
			throw new AuthorityException("글 작성자가 아닙니다");
		}
	}
	
//	@RequestMapping("/delete")
//	public String delete(@RequestParam int boardNo) {
//		if(boardDao.delete(boardNo)) return "redirect:list";
////		else return "redirect:에러페이지";
//		else throw new NoTargetException("존재하지 않는 게시글 번호");
//	}
	
}
