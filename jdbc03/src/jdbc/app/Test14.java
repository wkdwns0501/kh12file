package jdbc.app;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test14 {
	public static void main(String[] args) {
		//포켓몬스터 번호를 이용하여 상세조회
		
		//데이터
		int no = 1000;
		
		//처리
		PocketmonDao dao = new PocketmonDao();
		PocketmonDto dto = dao.selectOne(no);
		
		//출력
		if(dto == null) {
			System.out.println("찾으시는 번호의 포켓몬이 없어요");
		}
		else {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getType());
		}
	}
}
