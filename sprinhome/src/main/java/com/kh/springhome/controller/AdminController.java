package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/home")
	public String home() {
		return "/WEB-INF/views/admin/home.jsp";
	}
	
	@RequestMapping("/member/list")
	public String memberList(@ModelAttribute(name="vo") PaginationVO vo, Model model) {
		int count = memberDao.countList(vo);
		vo.setCount(count);
//		model.addAttribute("vo", vo);
		
		List<MemberDto> list = memberDao.selectListByPage(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/admin/member/list.jsp";
	}
	
	@RequestMapping("/statistics/board")
	public String statisticsBoard() {
		return "/WEB-INF/views/admin/statistics/board.jsp";
	}
	
	@RequestMapping("/statistics/member")
	public String statisticsMember() {
		return "/WEB-INF/views/admin/statistics/member.jsp";
	}
	
	@RequestMapping("/member/detail")
	public String memberDetail() {
		return "/WEB-INF/views/admin/member/detail.jsp";
	}
	
	@GetMapping("/member/edit")
	public String memberEdit() {
		return "/WEB-INF/views/admin/member/edit.jsp";
	}
	
	@PostMapping("/member/edit")
	public String memberEdit(Model model) {
		return"redirect:/";
	}
}
