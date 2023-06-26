package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//소수 탐색 프로그램
		//소수는 나누기가 어려운 숫자들을 말합니다.
		//나누기가 어렵다는 것은 1이나 자기자신 빼고 나누어 떨어지는 수가 없다는 뜻
		//- 5는 소수이다 (1, 5 빼고 딱 떨어지는 수가 없음)
		//소수가 아니라는 것은 1과 자기자신을 제외하고도 나누어 떨어지는 수가 있다는 뜻
		//- 6은 소수가 아니다 (1, 6 빼고도 2, 3 등 나누어 떨어지는 수가 있음)
		//사용자가 2 이상의 어떤 숫자를 입력했을 때 소수인지 아닌지 판정하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		for (int i = 1 ; i <= num ; i++) {
			boolean prime = num % i == 0;
			if (prime) {
				count++;
			}
		}
		System.out.println("number = "+ num);
		System.out.println("count = " + count);
		
		if(count == 2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
