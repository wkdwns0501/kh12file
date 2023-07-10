package api.lang.string2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//회원가입 + 정규표현식 검사
		Scanner sc = new Scanner(System.in);
		String memberId = sc.next();
		String memberPw = sc.next();
		String memberName = sc.next();
		sc.close();
		
		Member a = new Member(memberId,memberPw,memberName);
		a.show();
		
		
	}
}
