package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		//도서 정보 수정 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		int bookId = sc.nextInt();
		System.out.print("제목 : ");
		String bookTitle = sc.next();
		System.out.print("가격 : ");
		float bookPrice = sc.nextFloat();
		sc.close();
		
		//DB처리 - 자바는 자동 commit 모드를 사용한다
		String sql = "update book set book_title=?, book_price=? where book_id = ?";
		Object[] data = {bookTitle, bookPrice, bookId};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH"); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int result =jdbcTemplate.update(sql, data);
		System.out.println("result = " + result); 
		
		if(result>0) {
			System.out.println("수정 성공!");
		}
		else {
			System.out.println("수정 실패!");
		}
	}
}
