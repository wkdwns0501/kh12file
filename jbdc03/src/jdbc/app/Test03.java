package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {
	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		dto.setBookTitle("테스2트제목");
		dto.setBookAuthor("테스2트작가");
		dto.setBookPublicationDate("2010-01-22");
		dto.setBookPrice(17.55f);
		dto.setBookPublisher("테스2트출판사");
		dto.setBookPageCount(150);
		dto.setBookGenre("자기개발");
		
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
