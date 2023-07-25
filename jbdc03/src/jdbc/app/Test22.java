package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {
	public static void main(String[] args) {
		String memberId = "abcdefg123";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if(dto == null) {
			System.out.println("찾으시는 아이디의 회원이 없어요");
		}
		else {
			System.out.println(dto.getMemberId());
			System.out.println(dto.getMemberNickname());
		}
	}
}
