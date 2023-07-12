package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나라이름 입력 : ");
			String country = sc.next();
			if (list.contains(country)) {
				break;
			}
			else list.add(country);
		}
		System.out.println("게임오버! 입력된 나라이름 개수 : " + list.size() + "개");
		sc.close();
	}
}
