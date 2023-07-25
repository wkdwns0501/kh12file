package jdbc.app;

import java.util.List;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test15 {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		List<BookDto> list = dao.selectList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다");
		}
		else {
			System.out.println("조회 결과 수 : " + list.size());
			for(BookDto dto : list) {
				System.out.println(dto.getBookTitle()+"($"+dto.getBookPrice()+")");
			}
		}
	}
}
