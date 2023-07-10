package api.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//Test04에서 자바가 감지하지 못하는 예외를 개발자가 수동으로 처리
		//-->강제 예외 처리
		try {//플랜A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액 : ");
			int money = sc.nextInt();
			if(money < 0) {//자바가 인지하지 못하는 문제 상황
				Exception ex = new Exception("금액이 음수일 수 없습니다");
				throw ex; //throw를 이용하면 실행을 중지하고 catch블록으로 이동한다
			}
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			if(people < 0) {//자바가 인지하지 못하는 문제 상황
				throw new Exception("인원수는 음수일 수 없습니다"); //15,16 행이랑 같은 코드이다 
			}																				//보통 이 코드를 쓴다
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
			//System.err.println("에러!");
			
			//합쳐놓고 보니 자세한 정보가 그립더라 (예외 객체 활용)
			//System.out.println(e);
			//System.out.println(e instanceof ArithmeticException);
			
			//예외 객체에 설정된 메세지가 있다면 출력할 수 있다
			if(e.getMessage() == null) {
				System.err.println("오류 발생");
			}
			else {
				System.err.println(e.getMessage());
			}
		}
		//Error는 실행자체가 안되는것 - 개발자 잘못 , 에러를 고치면 안된다
		//Exception는 실행은 되지만 오류가 나는것 - 실행자 잘못, 에러를 고쳐야 한다
		//Exception 예외의 아버지(필살기 클래스) - 내가짠 코드를 실행할때
		 //Throwable 예외의 할아버지 - 남이짠 코드를 실행할때
	}
}
