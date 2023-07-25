package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {
	public static void main(String[] args) {
		//도서 가격 수정 프로그램
		BookDto dto = new BookDto();
		dto.setBookId(43);
		dto.setBookPrice(21.45f);
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookPrice(dto);
		
		if(result) {
			System.out.println("수정 완료!");
		}
		else {
			System.out.println("존재하지 않는 도서정보!");
		}
	}
}
