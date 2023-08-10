package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto) {
		int boardNo = boardDao.sequence();
		boardDto.setBoardNo(boardNo);
		boardDao.insert(boardDto);
		return "redirect:detail?boardNo="+ boardNo;
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = boardDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
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
		if(boardDao.update(boardDto)) return "redirect:detail?boardNo=" + boardDto.getBoardNo();
		else return "redirect:에러페이지 주소";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		if(boardDao.delete(boardNo)) return "redirect:list";
		else return "redirect:에러페이지";
	}
}
