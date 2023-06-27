package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사용자에게 랜덤으로 2단부터 9단 사이의 구구단 문제를 10개 출제합니다.
		//사용자가 입력한 값으로 정답/오답을 판정하고 모든 문제 출제가 끝나면 정답과 오답 개수를 출력해주세요.
		//(추가) 3번 틀리면 게임을 종료하도록 구현
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		for(int i = 1 ; i <=10 ; i++) {
		int dan = r.nextInt(8) + 2;
		int num = r.nextInt(9) + 1;
		System.out.print(dan + " X " + num + " = ");
		int answer = sc.nextInt();
			if (answer == dan * num) {
				correct++;
//				System.out.println("정답!");
			}
			else {
				incorrect++;
//				System.out.println("오답!");
				if(incorrect == 3) {
					break; //탈출(가장 가까운 반복/switch/try 탈출)
				}
			}
		}
		sc.close();
		System.out.println("게임 끝!");
		System.out.println("정답 개수 : " + correct);
		System.out.println("오답 개수 : " + incorrect);
	}
}
