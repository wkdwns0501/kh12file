package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

@SpringBootTest
public class Test01_insert {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		BookDto dto = new BookDto();
//		dto.setBookTitle("테스트제6목");
//		dto.setBookAuthor("테스트작6가");
//		dto.setBookPublicationDate("2002-01-19");
//		dto.setBookPrice(99.99f);
//		dto.setBookPublisher("테스트7출판사");
//		dto.setBookPageCount(180);
//		dto.setBookGenre("공포");
		
		BookDto dto = BookDto.builder()
				.bookTitle("테스트서적")
				.bookAuthor("테스트작24가")
				.bookPublicationDate("2002-03-19")
				.bookPrice(99.99f)
				.bookPublisher("테스트2출판사")
				.bookPageCount(136)
				.bookGenre("스릴러")
				.build();
		
		sqlSession.insert("book.add", dto);
	}
}
