package condition2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//여행사 프로모션 3
		//KH여행사에서 세 번째 프로모션을 진행합니다.
		//무조건 1인당 1박 10만원을 유지한 채 계절별로 다음과 같이 할인하도록 할 예정입니다.
		//계절	    월	       할인율
		//봄	    3, 4, 5	   20%
		//여름	6, 7, 8	   10%
		//가을	9, 10, 11   30%
		//겨울	12, 1, 2	    5%
		//사용자에게 필요한 정보를 입력받아 예상 경비를 구하여 출력
		Scanner sc  = new Scanner(System.in);
		System.out.print("인원수 : ");
		int count = sc.nextInt();
		System.out.print("일수 : ");
		int day = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		sc.close();
		
		int price = 100000;
		int total = price * day * count;
		int rate;
		if (month == 3 || month == 4 || month == 5) {
			rate = 20;
		}
		else if (month == 6 || month == 7 || month == 8) {
			rate = 10;
		}
		else if (month == 9 || month == 10 || month == 11) {
			rate = 30;
		}
		else {
			rate = 5;
		}
		int dis = total * rate / 100;
	    int result = total - dis; 
		
		System.out.println("정상가 : " + total + "원");
		System.out.println("할인율 : " + rate + "%");
		System.out.println("할인된 금액 : " + dis + "원");
		System.out.println("할인가 : " + result + "원");
	}
}
