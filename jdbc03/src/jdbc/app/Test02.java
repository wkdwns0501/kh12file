package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {
	public static void main(String[] args) {
		//게시글 작성 프로그램
//		String boardTitle = "테스1트";
//		String boardContent = "테스1트내용";
//		String boardWriter = "Testuser123";
		BoardDto dto = new BoardDto();
		dto.setBoardTitle("테2스트");
		dto.setBoardContent("테2스트내용");
		dto.setBoardWriter("Test2user34");
		
		BoardDao dao = new BoardDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
