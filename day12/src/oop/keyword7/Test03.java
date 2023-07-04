package oop.keyword7;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		//실제 자바 라이브러리에서 상수를 사용하는 코드
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		
		int day1 = Calendar.getInstance().get(Calendar.DATE);
		int day2 = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		System.out.println(day1);
		System.out.println(day2);
	}
}
