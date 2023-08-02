package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
