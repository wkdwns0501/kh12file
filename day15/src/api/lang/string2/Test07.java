package api.lang.string2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("등급 : ");
		String memberLevel = sc.next();
		System.out.print("포인트 : ");
		String memberPoint = sc.next();
		sc.close();
		
		Member a = new Member(memberId, memberPw, memberName,memberLevel,100);
		
		a.show();
	}
}
