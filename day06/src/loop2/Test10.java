package loop2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일수 입력 : ");
		int day = sc.nextInt();
		int totalTime = 0;
		for (int i = 1 ;i <= day ; i++) {
		System.out.print("시간 : ");
		int hour = sc.nextInt();
		System.out.print("분 : ");
		int min = sc.nextInt();
		int time = hour * 60 + min;
		totalTime += time;
		}
		sc.close();
		
		int totalHour = totalTime / 60;
		int totalMin = totalTime % 60;
		double avgTime = totalTime / day; // int avgTime + totalTime / day;
		int avgHour = (int)avgTime / 60; // int avgHour = avgTime / 60;
		int avgMin = (int)avgTime % 60; // int avgMin = avgTime % 60;
		
		System.out.println("총 공부한 시간 : " + totalHour + "시간 " + totalMin + "분");
		System.out.println("일 평균 약 " + avgHour + "시간 " + avgMin + "분");
	}
}
