package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//결론 : .next() 계열의 명령 뒤에 .nextLine()을 쓸 경우 비어있는 명령 한개를 추가해야한다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String a = sc.next();
		
		System.out.print("입력 : ");
		sc.nextLine();//엔터가 여기로 들어감 //엔터 처리용 명령 
		String b = sc.nextLine();
		
		sc.close();
		
		System.out.println("a = " +a);
		System.out.println("b = " + b);
	}
}
