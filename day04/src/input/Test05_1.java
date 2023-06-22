package input;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("떡볶이 (3000원) : ");
		int menu1Count = sc.nextInt();
		
		System.out.print("튀김 (500원) : ");
		int menu2Count = sc.nextInt();
		
		System.out.print("순대 (2000원) : ");
		int menu3Count = sc.nextInt();
		
		sc.close();
		int rate = 10;
		int menu1Price = 3000;
		int menu2Price = 500;
		int menu3Price = 2000;
		int menu1Total = menu1Price * menu1Count;
		int menu2Total = menu2Price * menu2Count;
		int menu3Total = menu3Price * menu3Count;
		
		int total = menu1Total + menu2Total + menu3Total;
		int dis = total * rate / 100;
		int result = total - dis;
		
		System.out.println("<결제 정보>");
		System.out.println("결제 금액 : " + total + "원");
		System.out.println("할인 금액 : " + dis + "원");
		System.out.println("최종 금액 : " + result + "원");

	}

}
