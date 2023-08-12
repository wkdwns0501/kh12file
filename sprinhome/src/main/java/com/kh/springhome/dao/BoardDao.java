package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	int sequence();
	void insert(BoardDto boardDto);
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	List<BoardDto> selectList();
	BoardDto selectOne(int boardNo);
	boolean upReadcount(int boardReadcount);
}
