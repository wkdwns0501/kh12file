package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main (String[] args) {
		//지하철 이용요금은 다음과 같습니다
		//구분	  |       기준	                   |   요금
		//어르신  |	     65세 이상	           |  무료
		//성인	  |  20세 이상 65세 미만 |	 1250원
		//청소년  |	14세 이상 20세 미만  |	 720원
		//어린이	  |  8세 이상 14세 미만	   |  450원
		//영유아  |	     8세 미만	           |   무료
		//사용자에게 나이를 입력받아 지하철 요금을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("정류장 수: ");
		int count = sc.nextInt();
		sc.close();
		
		int deposit = 500;
		int pay;
		
		if (age >= 65 || age < 8) {
			pay = 0;
		}
		else if (age >= 20) {
			pay = 1250;
		}
		else if (age >= 14) {
			pay = 720;
		}
		else {
			pay = 450;
		}
	
		int plus = count / 5 * 100;
		int total = deposit + pay + plus;
		
		System.out.println("기본 요금 : " + pay + "원");
		System.out.println("카드 보증금 : " + deposit + "원");
		System.out.println("추가 요금 : " + plus + "원");
		System.out.println("결제 요금 : " + total + "원");
	}
}
