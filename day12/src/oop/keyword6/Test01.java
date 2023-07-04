package oop.keyword6;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Member a = new Member("adminuser","admin1234","관리자");
//		Member b = new Member("student","student1234","수강생");
//		Member c = new Member("manager","manager1234","매니저");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String passWord = sc.next();
		System.out.print("닉네임 : ");
		String nickName = sc.next();
		sc.close();
		
		Member a = new Member(id, passWord, nickName);
		a.show();
//		b.show();
//		c.show();
	}
}