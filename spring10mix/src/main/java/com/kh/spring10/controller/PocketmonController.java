package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
  public class PocketmonController {
	
	@Autowired
	private PocketmonDao dao;
	
	//상세조회
	//- 번호(no)를 받아서 포켓몬스터 정보 (PocketmonDto)를 조회
	//- 화면(JSP)에 전달하도록 모델(Model)에 첨부
	@RequestMapping("/detail")
	public String detail(@RequestParam int no, Model model) {
		PocketmonDto dto = dao.selectOne(no);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/pocketmon/detail.jsp";
	}
	
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<PocketmonDto> list =dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/pocketmon/list.jsp";
	}
	
	//등록
	//등록은 주소를 둘로 나눠서 쓴다
	//- GET(입력), POST(처리)
	//-@GetMapping, @PostMapping 이라는 애노테이션 사용
	
//	@RequestMapping("/insert")
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/pocketmon/insert.jsp";
	}
	
//	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@PostMapping("/insert")
	public String insert(@ModelAttribute PocketmonDto dto) {
		dao.insert(dto);
		//더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
		//반환하는 문자열이 redirect:로 시작하면 스프링이 리다이렉트 처리
		//return "redirect:list"; //상대경로
		return "redirect:/pocketmon/list"; //절대경로
	}
}
