package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;
import com.kh.spring22.error.NoTargetException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BookDto> selectList() {
		return sqlSession.selectList("book.list");
	}

	@Override 
	public void insert(BookDto bookDto) {
		sqlSession.insert("book.save", bookDto);
	}

	@Override
	public void delete(int bookId) {
		int result = sqlSession.delete("book.del", bookId);
		if(result == 0) throw new NoTargetException();
	}

	@Override
	public BookDto selectOne(int bookId) {
		BookDto bookDto = sqlSession.selectOne("book.findByBookId", bookId);
		if(bookDto == null) throw new NoTargetException();
		return bookDto;
	}
	
	@Override
	public List<BookDto> selectListByBookTitle(String bookTitle) {
		return sqlSession.selectList("book.findByBookTitle", bookTitle);
	}

//	@Override //내 방법
//	public boolean edit(int bookId, BookDto bookDto) {
//		Map<String, Object> params = new HashMap<>();
//		params.put("bookId", bookId);
//		params.put("bookDto", bookDto);
//		return sqlSession.update("book.edit", params) > 0;
//	}
	
	@Override //강사님 방법
	public void edit(int bookId, BookDto bookDto) {
		Map<String, Object> param = Map.of("bookId", bookId, "bookDto", bookDto);
		int result = sqlSession.update("book.edit", param);
		if(result == 0) throw new NoTargetException();
	}

	@Override
	public boolean editUnit(int bookId, BookDto bookDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("bookId", bookId);
		params.put("bookDto", bookDto);
		return sqlSession.update("book.editUnit", params) > 0;
	}
	
	@Override
	public List<BookDto> selectListByPage(int page, int size) {
		int end = page * size;
		int begin = end - (size-1);
		Map params = Map.of("begin", begin, "end", end);
		return sqlSession.selectList("book.selectListByPage", params);
	}
}
