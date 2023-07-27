package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {
	@Autowired
	private BoardDao dao;
	@RequestMapping("/insert")
	public String insert(
			@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시글 등록 완료!";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		
		if(dao.update(dto)) {
			return "게시글 변경 완료!";
		}
		else {
			return "존재하지 않는 게시글 번호";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		if(dao.delete(boardNo)) {
			return "게시글 삭제 완료!";
		}
		else {
			return "존재하지 않는 게시글 번호";
		}
	}
}
