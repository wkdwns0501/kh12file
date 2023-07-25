package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
//		System.out.print("비밀번호 입력 : ");
//		String password = sc.next();
//		System.out.print("비밀번호 확인 : ");
//		String passwordre = sc.next();
		System.out.print("닉네임 입력 : ");
		String nickname = sc.next();
		System.out.print("전화번호 입력 : ");
		String contact = sc.next();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		System.out.print("생년월일 입력 : ");
		String birth = sc.next();
		sc.close();
		
//		비밀번호 DB검사 및 비밀번호 일치 검사 등을 추가할 수 있다
		MemberDto dto = new MemberDto();
		dto.setMemberId(id);
		dto.setMemberNickname(nickname);
		dto.setMemberContact(contact);
		dto.setMemberEmail(email);
		dto.setMemberBirth(birth);
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result) {
			System.out.println("회원정보 변경 완료!");
		}
		else {
			System.out.println("존재하지 않는 회원정보!");
		}
		
	}
}
