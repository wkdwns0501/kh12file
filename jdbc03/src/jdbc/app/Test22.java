package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {
	public static void main(String[] args) {
		String memberId = "abcdefg123";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if(dto == null) {
			System.out.println("허용되지 않은 접근방법");
		}
		else {
			System.out.println("[회원정보]");
			System.out.println("아이디 : " + dto.getMemberId());
			System.out.println("닉네임 : " + dto.getMemberNickname());
			System.out.println("등급 : " + dto.getMemberLevel());
			System.out.println("포인트 : " + dto.getMemberPoint());
		}
	}
}

