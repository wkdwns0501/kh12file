package loop;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//사용자에게 숫자를 5번 입력받는 프로그램을 구현하세요
		//(주의) 도구 생성은 한 번만 한다
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < 5 ; i++) {
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		}
		sc.close();
	}
}
