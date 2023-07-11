package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작시간 (HH:mm) : ");
		String start = sc.next();
		System.out.print("종료시간 (HH:mm) : ");
		String finish = sc.next();
		sc.close();
		
		LocalTime a = LocalTime.parse(start);
		LocalTime b = LocalTime.parse(finish);
		Duration duration = Duration.between(a, b);
//		System.out.println(duration);
		long time = duration.getSeconds();
//		System.out.println(time); //이용시간(초)
		time /= 60; //이용시간(분)
		long hour = time / 60;
		long minute = time % 60;
		int pricePerHour = 1000;
		float pricePerMinute = pricePerHour / 60f;
		float totalPrice = pricePerMinute * time;
		
		System.out.println("이용시간 : " + hour + "시간" + minute + "분");
		System.out.println("이용요금 : " + totalPrice + "원");
//		System.out.println("이용요금 : " + (int)totalPrice + "원");     //원하는 걸로
//		System.out.println("이용요금 : " + (int)Math.floor(totalPrice) + "원");
//		System.out.println("이용요금 : " + Math.round(totalPrice) + "원");
//		System.out.println("이용요금 : " + (int)Math.ceil(totalPrice) + "원");
	}
}
