package api.lang.string2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		//정규표현식 (REGular EXression) - 문장을 검사하기 위한 식
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String number = sc.next();
		sc.close();
//		^01[016789][0-9]{3,4}[0-9]{4}$
//		^01[016789]-?[0-9]{3,4}-?[0-9]{4}$
//		^(010|011|016|017|018|019)[0-9]{3,4}[0-9]{4}$
		
//		^01[016789][1-9][0-9]{2,3}[0-9]{4}$  // 정확한 식
		String regex = "^01[016789][0-9]{3,4}[0-9]{4}$";
//		boolean isValid = Pattern.matches(regex,number);
		boolean isValid = number.matches(regex);
		if(isValid) {
			System.out.println("유효한 전화번호 입니다");
		}
		else {
			System.out.println("잘못된 전화번호 입니다");
		}
		
	}
}
