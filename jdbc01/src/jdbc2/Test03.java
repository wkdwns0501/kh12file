package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int boardNo = sc.nextInt();
		System.out.print("제목 : ");
		String boardTitle =sc.next();
		System.out.print("내용 : ");
		String boardContent =sc.next();
		System.out.print("작성자 : ");
		String boardWriter = sc.next();
		sc.close();
		
		String sql = "update board set board_title=?, board_content=?, board_writer=?"
						+ " where board_no=?";
		Object[] data = {boardTitle, boardContent, boardWriter, boardNo};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:xe"); 
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
