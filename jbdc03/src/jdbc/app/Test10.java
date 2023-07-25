package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String pwre = sc.next();
		sc.close();
		
		if(pw.equals(pwre)) {
			MemberDto dto = new MemberDto();
			dto.setMemberId(id);
			dto.setMemberPw(pw);
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);
			
			if(result) {
				System.out.println("비밀번호 변경 완료!");
			}
			else {
				System.out.println("존재하지 않는 회원정보!");
			}
		}
		else {
			System.out.println("두 비밀번호가 일치하지 않습니다!");
		}
	}
}
