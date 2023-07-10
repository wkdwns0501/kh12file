package api.exception;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//만나이 계산기
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월 입력 (YYYY-MM) : ");
		String birth = sc.next();
		sc.close();
		String a = birth.substring(0, 4);
		String b = birth.substring(5, 7);
		
		int year = Integer.parseInt(a);
		if(year < 1900) {
			throw new Exception("년도는 1900미만일 수 없습니다");
		}
		int month = Integer.parseInt(b);
		if(!(month >=1 && month <=12)) {
			throw new Exception("월은 1~12만 입력 가능합니다");
		}
		int thisYear = 2023;
		int age = 2023 - year + 1;
		int newAge =0;
		if (month <= 7) {
			newAge = thisYear - year ;
		}
		else {
			newAge = thisYear - year - 1;
		}
		System.out.println("한국 나이 : " + age + "살");
		System.out.println("만 나이 : " + newAge + "살");
		}
		catch(Exception e){
			System.err.println("오류 발생");
		}
		
	}
}
