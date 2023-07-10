package api.exception;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//Test02 예제에서 예외를 한 번에 처리하도록 변경
		try {//플랜A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액 : ");
			int money = sc.nextInt();
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			
			sc.close();
			
			int price = money / people; //1인당 정산금액
			int remain = money % people; //자투리 금액
			
			System.out.println("1인당 내야할 금액은  " + price + "원 입니다");
			System.out.println(remain + "원은 저희가 지원해 드려요!");
		}
//		catch (RuntimeException e)		
//		catch (Throwable e)				
//		catch (Object e) //안됨         
		catch (Exception e){ //플랜B. 무언가 문제가 생겼을 때
			System.err.println("에러!");
		}
		//Error는 실행자체가 안되는것 - 개발자 잘못 , 에러를 고치면 안된다
		//Exception는 실행은 되지만 오류가 나는것 - 실행자 잘못, 에러를 고쳐야 한다
		//Exception 예외의 아버지 - 내가짠 코드를 실행할때
		 //Throwable 예외의 할아버지 - 남이짠 코드를 실행할때
	}
}
