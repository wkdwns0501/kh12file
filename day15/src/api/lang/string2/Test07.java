package api.lang.string2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//회원가입 + 정규표현식 검사
		Scanner sc = new Scanner(System.in);
		String memberId = sc.next();
		String memberPw = sc.next();
		String memberName = sc.next();
<<<<<<< HEAD
		System.out.print("등급 : ");
		String memberLevel = sc.next();
		System.out.print("포인트 : ");
		String memberPoint = sc.next();
		sc.close();
=======
		sc.close();
		
		Member a = new Member(memberId,memberPw,memberName);
		a.show();
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
		
		Member a = new Member(memberId, memberPw, memberName,memberLevel,100);
		
		a.show();
	}
}
