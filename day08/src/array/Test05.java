package array;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//사용자에게 실수 5개를 입력받아서 출력하도록 프로그램 구현
		
		double[] data = new double [5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print("실수 입력 : ");
			data[i] = sc.nextDouble();
		}
		sc.close();
		for(int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);
		}
	}
}