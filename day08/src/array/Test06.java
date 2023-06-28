package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현
		
		String[] name = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < name.length ; i++) {
			System.out.print("나라이름 입력 : ");
			name[i] = sc.next();
		}
		sc.close();
		for (int i = 0 ; i < name.length ; i++) {
			System.out.println(name[i]);
		}
	}
}