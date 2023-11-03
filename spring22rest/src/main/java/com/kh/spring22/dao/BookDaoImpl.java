package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;

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
		sqlSession.insert("book.add", bookDto);
	}

	@Override
	public boolean delete(int bookId) {
		return sqlSession.delete("book.del", bookId) > 0;
	}

	@Override
	public BookDto selectOne(int bookId) {
		return sqlSession.selectOne("book.find", bookId);
	}
	
	@Override
	public List<BookDto> selectListByBookTitle(String bookTitle) {
		return sqlSession.selectList("book.titleSearch", bookTitle);
	}

	@Override
	public boolean edit(int bookId, BookDto bookDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("bookId", bookId);
		params.put("bookDto", bookDto);
		return sqlSession.update("book.edit", params) > 0;
	}

	@Override
	public boolean editUnit(int bookId, BookDto bookDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("bookId", bookId);
		params.put("bookDto", bookDto);
		return sqlSession.update("book.editUnit", params) > 0;
	}

}
