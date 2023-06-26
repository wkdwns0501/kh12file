package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int odd = 0;
		int even = 0;
		int total = 0;
		for (int i = 1 ; i <=10 ; i++) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if (num % 2 != 0) {
				odd++;
			}
			else {
				even++;
			}
			total += num;
		}
		double avg = (double)total / 10;
		sc.close();
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);
		System.out.println("전체합계 : " + total);
		System.out.println("전체평균 : " + avg);
	}
}
