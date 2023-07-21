package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		//신규 도서 등록 프로그램 ex) 도서관, 책방, ...)
		
		//데이터 - book_id는 준비하지 않는다 (시퀸스 활용)
		
		Scanner sc = new Scanner(System.in);
		int bookId = 0;
		System.out.print("제목 : ");
		String bookTitle  = sc.next();
		System.out.print("작가 : ");
		String bookAuthor = sc.next();
		System.out.print("출간일 : ");
		String bookPublicationDate = sc.next();
		System.out.print("가격 : ");
		float bookPrice = sc.nextFloat();
		System.out.print("출판사 : ");
		String bookPublisher  = sc.next();
		System.out.print("페이지수 : ");
		int bookPageCount = sc.nextInt();
		System.out.print("장르 : ");
		String bookGenre = sc.next();
		sc.close();
		
		String sql = "insert into book(book_id, book_title, book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, book_genre) "
				+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {bookTitle, bookAuthor, bookPublicationDate, 
							bookPrice, bookPublisher, bookPageCount, bookGenre};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH"); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		System.out.println("도서 등록 완료!");

	}
}
