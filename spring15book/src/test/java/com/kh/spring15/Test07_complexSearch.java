package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07_complexSearch {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
//		param.put("bookId", 3);
//		param.put("bookTitle", "테스트");
//		param.put("bookAuthor", "테스트");
//		param.put("bookPublisher", "테스트");
//		param.put("bookPriceMin", 10f);
//		param.put("bookPriceMax", 1000f);
//		param.put("bookPublicationBegin", "2002-01-01");
//		param.put("bookPublicationEnd", "2002-02-17");
//		param.put("bookPageMin", 120);
//		param.put("bookPageMax", 135);
//		param.put("bookGenre", "스릴러"); //장르가 한개였다면 (X)
//		param.put("bookGenreList", List.of()); //장르가 여러개라면(O)
//		param.put("bookGenreList", List.of("공포")); //장르가 여러개라면(O)
//		param.put("bookGenreList", List.of("공포", "코미디")); //장르가 여러개라면(O)
//		param.put("bookGenreList", List.of("공포", "스릴러", "코미디")); //장르가 여러개라면(O)
//		param.put("orderList", List.of("book_id asc")); //번호순
//		param.put("orderList", List.of("book_publication_date desc", "book_id asc")); //최근 출간순(같으면 번호순)
//		param.put("begin", 1);
//		param.put("end", 10);
		
		List<BookDto> list = sqlSession.selectList("book.complexSearch", param);
		log.debug("검색 결과 = {}개", list.size());
		for(BookDto bookDto : list) {
			log.debug("bookDto = {}", bookDto);
		}
	}
}
