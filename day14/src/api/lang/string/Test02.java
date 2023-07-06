package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		sc.close();
		
//		boolean isLogin = id.equalsIgnoreCase("khacademy") && pw.equals("student1234");
		boolean isLogin = id.toLowerCase().equals("khacademy") && pw.equals("student1234");
		
		if (isLogin) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
	}
}
