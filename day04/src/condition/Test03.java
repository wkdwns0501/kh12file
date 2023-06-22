package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//KH국밥집에서는 65세 이상 어르신들만 30% 할인된 가격에 국밥을 판매합니다.
		//국밥 한 그릇에 7500원일 때, 출생년도 4자리와 그릇 수를 입력받아 
		//상황에 맞는 결제 금액을 계산하여 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 (4자리) : ");
		int birth = sc.nextInt();
		
		System.out.print("그릇 수 : ");
		int count = sc.nextInt();
		
		sc.close();
		
		int year = 2023;
		int price = 7500;
		int age = year - birth + 1;
		int total = price * count;
		
		//int dis = 0 또는 30%금액;
		int dis;
		//if-else 절 안에 있는 조건은 밖에서 쓰지못한다.
		if (age >= 65) {
			dis = total * 30 / 100;
		}
		else {
			dis = 0;
		}
		
		int totalPay = total - dis;
		
		System.out.println("나이 : " + age + "세");
		System.out.println("금액 : " + totalPay + "원");
	}
}
