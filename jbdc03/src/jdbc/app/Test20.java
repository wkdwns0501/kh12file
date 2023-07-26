package jdbc.app;


import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {
	public static void main(String[] args) {
		//도서 상세 정보 조회
		int bookId = 24;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		if(dto == null) {
			System.out.println("도서정보가 존재하지 않습니다");
		}
		else { //Dto에 show() 만들어서 찍어도 된다
			System.out.println("<도서 정보>");
			System.out.println("도서아이디 : " + dto.getBookId());
			System.out.println("도서제목 : " + dto.getBookTitle());
			System.out.println("도서저자 : " + dto.getBookAuthor());
		}
	}
}
