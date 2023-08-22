package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.vo.PaginationVO;

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
	List<BoardListDto> selectListByPage(PaginationVO vo);
	
	int countList();
	int countList(String type, String keyword);
	//PaginationVO을 사용하면 위의 두개는 필요 없다
	int countList(PaginationVO vo);
	
	//특정 사용자가 작성한 글을 조회하는 메소드
	List<BoardListDto> selectListByBoardWriter(String boardWriter);
}
