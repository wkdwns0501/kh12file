package input;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//KH분식점의 메뉴판은 다음과 같습니다.
		//  이름	 |  가격
		//떡볶이	 | 3000원
		//튀김	 |  500원
		//순대	 | 2000원
		//사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결제금액을 출력
		//(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("떡볶이 (3000원) : ");
		int dduk = sc.nextInt();
		
		System.out.print("튀김 (500원) : ");
		int fried = sc.nextInt();
		
		System.out.print("순대 (2000원) : ");
		int sundae = sc.nextInt();
		
		sc.close();
		
		int rate = 10;
		int ddukPrice = 3000;
		int friedPrice = 500;
		int sundaePrice = 2000;
		int ddukPay = ddukPrice * dduk;
		int friedPay = friedPrice * fried;
		int sundaePay = sundaePrice * sundae;
		int totalPay = ddukPay + friedPay + sundaePay;
		int disPay = totalPay * rate / 100;
		int disTotalPay = totalPay - disPay;
		
		System.out.println("\n<결제 정보>");
		System.out.println("결제 금액 : " + totalPay + "원");
		System.out.println("할인 금액 : " + disPay + "원");
		System.out.println("총 결제금액 : " + disTotalPay + "원");
	}
}
