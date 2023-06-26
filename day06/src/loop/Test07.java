package loop;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws InterruptedException {
		//타이머 구현
		//사용자에게 분과 초를 입력받아 해당 시간만큼 메세지 출력하는 타이머 구현
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int min = sc.nextInt();
		System.out.print("초 입력 : ");
		int sec = sc.nextInt();
		sc.close();
		//시간은 무조건 작은 단위로 변환해서 풀기
		int time = min * 60 + sec;
		for (int i = time  ; i >= 0 ; i--) {
			int a = i / 60;
			int b = i % 60;
			System.out.println(a + "분 " + b + "초 후 알람이 울립니다!");
			
			//1초 대기
			if (i > 0) {
			Thread.sleep(1000); // 밀리초 사용 1/1000 
			}
		}
		System.out.println("알람 시작!");
	}
}
