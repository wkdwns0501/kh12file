package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test21 {
	public static void main(String[] args) {
		int boardNo = 22;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if(dto == null) {
			System.out.println("게시글 없음");
		}
		else {
			System.out.println("번호 : " + dto.getBoardNo());
			System.out.println("제목 : " +dto.getBoardTitle());
			System.out.println("작성자 : " +dto.getBoardWriter());
		}
	}
}
