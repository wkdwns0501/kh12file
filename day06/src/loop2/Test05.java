package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//구구단 게임
		//1. 사용자에게 원하는 단을 입력받으면 해당 단의 구구단을 출력
		//2. 정답을 지우고 사용자에게 정답을 입력받아서 정답/오답 판정 후 출력
		//3. 정답과 오답의 개수를 세어 모든 문제 출제 후 출력
		//다 하신 분들은 연속으로 맞출 경우 콤보 카운트를 해보시기 바랍니다
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		System.out.println("<" + dan + "단>");
		int rightAnswer = 0;
		int wrongAnswer = 0;
		int combo = 0;
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.print(dan + " X " + i + " = ");
			int answer = sc.nextInt();
			if(answer == dan * i) {
				rightAnswer++;
				combo++;
				System.out.println("정답! " + combo + "콤보!");
			}
			else {
				wrongAnswer++;
				combo = 0;
				System.out.println("오답!");
			}
		}
		sc.close();
		System.out.println("정답 개수 : " + rightAnswer);
		System.out.println("오답 개수 : " + wrongAnswer);
	}
}