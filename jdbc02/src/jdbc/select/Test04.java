package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		//도서 테이블(Book) 정보 조회 후 출력
		//- 준비물 : BookDto, BookMapper
		String sql = "select * from book order by book_id asc";
		
		BookMapper mapper = new BookMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BookDto> list = jdbcTemplate.query(sql, mapper);
		
		System.out.println("조회 결과 수 : " + list.size());
		if(list.isEmpty()){
			System.out.println("등록된 책이 없습니다");
		}
		else {
			for(BookDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}
