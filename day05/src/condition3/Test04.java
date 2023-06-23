package condition3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("년도 : ");
		int year = sc.nextInt();
		sc.close();
		
		
		int result;
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 : // java11이하 버전이면 case 1: case 3: case 5: .....이런식으로 다 써야한다
			result = 31;				  // 보통 위와 같이 쓰는 경우가 제일 많다
			break;
		case 4, 6, 9, 11 :
			result = 30;
			break;
		default :
			boolean alpha = year % 4 == 0;
			boolean beta = year % 100 != 0;
			boolean gamma = year % 400 == 0;
			boolean leapYear =  alpha && beta || gamma;
			if (leapYear) {
				result = 29;
			}
			else {
				result = 28;
			}
			break;
		}
		System.out.println(result + "일까지 존재");
	}
}
