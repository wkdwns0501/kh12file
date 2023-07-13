package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Map<String, String> login = new HashMap<>();
		login.put("admin","admin1234");
		login.put("teacher","teacher1234");
		login.put("student","student1234");
		login.put("manager","manager1234");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		sc.close();
		
		if(login.containsKey(id) && pw.equals(login.get(id))) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
	}
}
