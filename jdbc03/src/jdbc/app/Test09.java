package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {
	public static void main(String[] args) {
		//도서명, 출판사, 저자 변경 프로그램 (도서 기본정보)
		BookDto dto = new BookDto();
		dto.setBookId(24);
		dto.setBookTitle("수정제목");
		dto.setBookAuthor("수정저자");
		dto.setBookPublisher("수정출판사");
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);
		
		if(result) {
			System.out.println("수정 완료!");
		}
		else {
			System.out.println("존재하지 않는 도서정보!");
		}
	}
}
