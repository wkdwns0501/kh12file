package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<끝말잇기 게임>");
		String[] list = new String[] {
			"강아지", "가로수", "각설탕", "나팔꽃", "눈송이", "도너츠"
		};
		Random r = new Random();
		int index = r.nextInt(list.length);
		
		String word = list[index];
		
		//판정 1. 3글자인지, 2.이어지는지
		while(true) {
			System.out.println("제시어 : " + word);
			System.out.print("입력 : ");
			String input = sc.next();
			System.out.println();
			if (input.length() == 3 && word.charAt(2) == input.charAt(0)) {
				word = input;
			}
			else {
				System.out.println("게임 오버!");
				break;
			}
		}
		sc.close();
	}
}
