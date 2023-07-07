package api.lang.string;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		String[] data = new String[] {
				"수박씨", "신발끈", "개나리", "십장생", "시베리아", 
				"주옥", "조카", "게불", "10원"
		};
		String star = "*";
//		String[] star = new String[] {    //repeat가 없으면 이렇게 직접 만들어야한다
//				"",
//				"*",
//				"**",
//				"***",
//				"****",
//				"*****",
//				"******"
//			};
		
		for (int i = 0 ; i < data.length ; i++) {
				int count  = data[i].length();
//				if(count > 6) {
//					count = 6;
//				}
				line = line.replace(data[i], star.repeat(count));
		}
		System.out.println(line);
	}
}
