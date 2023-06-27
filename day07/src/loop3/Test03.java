package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//사용자에게 숫자를 입력받아 합계와 평균을 구하여 출력하는 프로그램 구현
		//(단, 사용자가 0을 입력할 경우 프로그램을 종료합니다)
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int total = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			else {
				total += num;
				count++;
			}
		}
		double avg = (double)total / count;
		sc.close();
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}
}