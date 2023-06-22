package input;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//강의장 입실시각과 퇴실시각을 입력받아 수업에 참여한 시간을 계산하여 출력
		//입실시각 입력 : 0925
		//퇴실시각 입력 : 1830
		//수업에 참여한 시간은 9시간 5분 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입실시각(hhmm) : ");
		int in = sc.nextInt();
		
		System.out.print("퇴실시각(hhmm) : ");
		int out = sc.nextInt();
		
		sc.close();
		
		int InTime = (in /100) * 60 + (in%100); 
		int OutTime = (out /100) * 60 + (out%100); 
		int Time = OutTime - InTime;
		int hour = Time / 60;
		int min = Time % 60;
		
		System.out.println("수업에 참여한 시간은 " + hour + "시간 " + min + "분 입니다");
	}
}
