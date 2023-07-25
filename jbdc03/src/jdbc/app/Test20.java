package jdbc.app;


import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {
	public static void main(String[] args) {
		int bookId = 24;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		if(dto == null) {
			System.out.println("찾으시는 번호의 책이 없어요");
		}
		else {
			System.out.println(dto.getBookId());
			System.out.println(dto.getBookTitle());
			System.out.println(dto.getBookAuthor());
		}
	}
}
