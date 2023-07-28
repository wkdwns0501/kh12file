package com.kh.spring06.controller;

import java.util.List;

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
	@RequestMapping("/list")
	public String list() {
		List<BoardDto> list = dao.selectList();
		//홈페이지는 동시에 많은 사람이 사용하기 때문에 안전한게 좋다
		StringBuffer buffer = new StringBuffer();//safe -> 그래서 버퍼 사용
//		StringBuilder builder = new StringBuilder();//non-safe
		for(BoardDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo) {
		BoardDto dto = dao.selectOne(boardNo);
		if(dto == null) {
			return "게시글이 존재하지 않습니다";
		}
		else {
			//return dto.toString();
			StringBuffer buffer = new StringBuffer();
			buffer.append("[제목]" + dto.getBoardTitle());
			buffer.append("(" + dto.getBoardWriter() + ")");
			buffer.append("<br>");
			buffer.append(dto.getBoardContent());
			buffer.append("<br>");
			return buffer.toString();
		}
	}
}
