package com.kh.springhome.controller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;

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
import com.kh.springhome.error.AuthorityException;
import com.kh.springhome.error.NoTargetException;

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
	
	@RequestMapping("/list")
	public String list(Model model) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
		model.addAttribute("list", boardDao.selectList());
		return "/WEB-INF/views/board/list.jsp";
	}
	
//	@RequestMapping("/list")
//	public String list(Model model
//			, @RequestParam String type
//			, @RequestParam String keyword) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
//		return "/WEB-INF/views/board/list?type=" + type + "&keyword=" + keyword;
//	}
	
//	@GetMapping("/list")
//	public String list(Model model) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
//		return "/WEB-INF/views/board/list.jsp";
//	}
//	
//	@PostMapping("/list")
//	public String list(Model model
//			, @RequestParam String type
//			, @RequestParam String keyword
//			, @RequestParam int boardNo) {
//		BoardDto boardDto = boardDao.selectOne(boardNo);
//		List<BoardDto> list = boardDao.selectList();
//		if(type.equals() {
//			
//		}
//		return "/WEB-INF/views/board/list?type=" + type + "&keyword=" + keyword;
//	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model, HttpSession session) {
		String boardWriter = (String) session.getAttribute("storage");
		BoardDto boardDto = boardDao.selectOne(boardNo);
		if(boardDto.getBoardWriter() == null) {
			boardDao.updateBoardReadcount(boardNo);
		}
		else {
			if(boardDto.getBoardWriter().equals(boardWriter) == false) {
				boardDao.updateBoardReadcount(boardNo); //조회수 증가
			}
		}
		model.addAttribute("boardDto", boardDto);
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
