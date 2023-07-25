package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test21 {
	public static void main(String[] args) {
		int boardNo = 22;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if(dto == null) {
			System.out.println("찾으시는 번호의 게시글이 없어요");
		}
		else {
			System.out.println(dto.getBoardNo());
			System.out.println(dto.getBoardTitle());
			System.out.println(dto.getBoardWriter());
		}
	}
}
