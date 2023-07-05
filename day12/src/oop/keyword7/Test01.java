package oop.keyword7;

import java.util.Random;

public class Test01 {
	//어디서나 객체없이(static) 변하지 않는(final) 값을 만들어서 사용 = 상수
//	static final int scissors = 0;
//	static final int rock = 1;
//	static final int paper = 2;
	
	public static void main(String[] args) {
		//상수(constant)의 필요성
		//ex) 가위바위보 출력
		
		//약속 - 가위(0), 바위(1), 보(2)
		
		Random r = new Random();
		
		int choice = r.nextInt(3);
//		System.out.println(choice);
		
		switch(choice) {
		case RSP.scissors:
			System.out.println("가위");
			break;
		case RSP.rock:
			System.out.println("바위");
			break;
		case RSP.paper:
			System.out.println("보");
			break;
		}
	}
}