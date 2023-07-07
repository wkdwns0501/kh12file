package api.lang.string2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일 입력 : ");
		String id = sc.next();
		sc.close();
	
//		String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$"; // 기본
		
		//큰달/작은달/2월을 정규표현식으로 구분
//		String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$"; //31일까지
//		String regex = "^(19[0-9]{2}|20[0-9]{2}])-(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)$"; //30일까지
//		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02)-(0[1-9]|1[0-9]|2[0-9])$"; //2월				//(밑에)3개 합친거
		String regex = "^(19[0-9][0-9]|20[0-9][0-9])-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[0-1]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$";
		
		boolean isValid = id.matches(regex);
	
		if(isValid) {
			System.out.println("정상적인 생년월일입니다");
		}
		else {
			System.out.println("비정상적인 생년월일입니다");
		}
	}
}
