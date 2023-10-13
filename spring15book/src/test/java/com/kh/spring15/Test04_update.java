package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04_update {
	
	@Autowired
	private SqlSession sqlSession;
	
//	@Test
//	public void test() {
//		BookDto dto = new BookDto();
//		dto.setBookId(2);
//		dto.setBookTitle("바꿀1제목");
//		dto.setBookAuthor("바꿀2작가");
//		dto.setBookPublicationDate("2002-02-15");
//		dto.setBookPrice(12000);
//		dto.setBookPublisher("바꿀출판사");
//		dto.setBookPageCount(120);
//		dto.setBookGenre("스릴러");
//		
//		int count = sqlSession.update("book.edit", dto);
//		boolean result = count > 0;
//		log.debug("result = {}", result);
//	}
	@Test
	public void test() {
		int count = sqlSession.update("book.edit",BookDto.builder()
				.bookTitle("테바꾼서적")
				.bookAuthor("테바꾼작24가")
				.bookPublicationDate("2002-03-21")
				.bookPrice(99.55f)
				.bookPublisher("테2트2출판사")
				.bookPageCount(122)
				.bookGenre("스릴")
				.bookId(2)
				.build());
		
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
