package condition;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//KH 여행사에서 두 번째 프로모션을 다음과 같이 진행하려고 합니다
		//여름 매출이 저조하여 여름에 여행갈 경우(6,7,8월) 비용에서 25%를 할인합니다
		//여름이 아닌 다른 계절은 할인 행사를 진행하지 않습니다
		//이전과 동일하게 국내 어디든 1인 1박에 10만원이라는 슬로건을 유지할 때 
		//사용자에게 필요한 정보를 입력받아 예상 경비를 출력하도록 구현하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int count = sc.nextInt();
		
		System.out.print("기간(일수) : ");
		int day = sc.nextInt();
		
		System.out.print("예정 월 : ");
		int month = sc.nextInt();
		
		sc.close();
		
		int price = 100000;
		int total = day * price * count;
		//6월 또는 7월 또는 8월입니까?
		//6월 이상 8월 이하입니까?
		//나누기 3 결과가 2입니까?
		boolean disMonth = month == 6 || month == 7 || month == 8;
		int dis;
		if (disMonth == true) { // == true 는 +0, *1 과 같은 쓰나마나한 것이다.
			dis = total * 25 / 100;
		}
		else {
			dis = 0;
		}
		int result = total - dis;
		
		System.out.println("정상가 : " + total);
		System.out.println("할인 금액 : " + dis);
		System.out.println("할인가 : " + result);
	}
}