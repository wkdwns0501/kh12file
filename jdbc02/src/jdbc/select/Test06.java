package jdbc.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class Test06 {
	public static void main(String[] args) {
		//로그인 프로그램
		//= SQL구문1 : select * from member where member_id = ?
		//= SQL구문2 : select * from member where member_id = ? and member_pw = ?
		//= 구문2는 비추천
		//= Primary key 로 항목을 조회하는 것을 '단일조회' 라고 한다
		//= 모든 테이블은 단일 조회가 가능해야한다
		//= 단일 조회는 결과가 없거나 한개이다
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		String sql = "select * from member where member_id =?";
		Object[] data = {memberId};
		
		MemberMapper mapper = new MemberMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto> list = jdbcTemplate.query(sql, mapper);
		//list.size() == 0 or 1
		
//		MemberDto dto;
//		if(list.isEmpty()) {
//			dto = null;
//		}
//		else {
//			dto = list.get(0);
//		}
		
		//3항 연산자(if문 축소) //위의 코드랑 같음
		MemberDto dto = list.isEmpty() ? null : list.get(0);
//		System.out.println(dto);
		
//		boolean isLogin = dto의 비밀번호와 사용자 비밀번호가 
		boolean isLogin = dto != null && dto.getMemberPw().equals(memberPw);
		System.out.println(isLogin);
		
	}
}
