package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boardNo = 0;
		System.out.print("게시글 제목 : ");
		String boardTitle  = sc.nextLine();
		System.out.print("게시글 내용 : ");
		String boardContent  = sc.nextLine();
		System.out.print("게시글 작성자 : ");
		String boardWriter  = sc.nextLine();
		sc.close();
		
		String sql = "insert into board(board_no, board_title, board_content, "
				+ "board_writer, board_readcount) "
				+ "values (board_seq.nextval, ?, ?, ? ,0)";
		Object[] data = {boardTitle, boardContent, boardWriter};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH"); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		System.out.println("게시물이 등록되었습니다!");
	}
}
