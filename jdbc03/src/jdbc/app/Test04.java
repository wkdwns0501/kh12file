package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setMemberId("zxcvasdf12");
		dto.setMemberPw("T2estpassword!");
		dto.setMemberNickname("테에데");
		dto.setMemberBirth("2013-03-03");
		dto.setMemberEmail("qwerasd@naver.com");
		dto.setMemberContact("01099998888");
		
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
