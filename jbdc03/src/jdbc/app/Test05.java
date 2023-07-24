package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	public static void main(String[] args) {
		//상품 등록 프로그램
		
		//데이터 준비
		ProductDto dto = new ProductDto();
		dto.setName("테스트바");
		dto.setType("아이스크림");
		dto.setPrice(1500);
		dto.setMade(Date.valueOf("2000-03-21")); //문자열 -> Date
		dto.setExpire(Date.valueOf("2005-07-11")); //문자열 -> Date
		//날짜 입력할때 : Date.valueOf("문자열")
		
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
