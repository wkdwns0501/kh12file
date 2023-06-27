package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//업다운 게임
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = r.nextInt(1000) + 1;
		//System.out.println(answer);
		System.out.println("컴퓨터가 1부터 1000사이의 숫자 중 하나를 컴퓨터가 골랐습니다!");
		int count = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			count++;
			if (answer > num) {
				System.out.println("업!");
			}
			else if (answer < num ) {
				System.out.println("다운!");
			}
			else {
				System.out.println("정답! ");
				break;
			}
		}
		sc.close();
		
		System.out.println("총 입력한 횟수는 " + count + "번 입니다!");
	}
}