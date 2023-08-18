package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;

public interface BoardDao {
	int sequence();
	void insert(BoardDto boardDto);
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	BoardDto selectOne(int boardNo);
	
	boolean updateBoardReadcount(int boardNo);
	Integer selectMax(String boardWriter);
	
	List<BoardListDto> selectList();
	List<BoardListDto> selectList(String type, String keyword);
	
	List<BoardListDto> selectListByPage(int page);
	List<BoardListDto> selectListByPage(String type, String keyword, int page);
	
	int countList();
	int countList(String type, String keyword);
}
