package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(3);
		dto.setBoardTitle("수정제목");
		dto.setBoardContent("수1정23내4용5");
		
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("수정 완료!");
		}
		else {
			System.out.println("존재하지 않는 게시글 번호!");
		}
	}
}
