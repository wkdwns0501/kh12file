package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		네이버 사다리 게임 만들기
//		1. 인원수 선택
//		2.이름 및 항목 입력
//		3.당첨 결과 출력
		
		Scanner sc = new Scanner(System.in);
//		List<String> nameList = new ArrayList<>(); // 업캐스팅으로 이 코드도 가능
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> itemList = new ArrayList<>();
		
		System.out.print("인원수 입력 (2~24명) : ");
		int num = sc.nextInt();
		sc.nextLine(); //엔터 제거
		for(int i = 0; i < num; i++) {
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			nameList.add(name);
		}
		for(int i = 0; i < num; i++) {
			System.out.print("항목 입력 : ");
			String item = sc.nextLine();
			itemList.add(item);
		}
		sc.close();
		
		Collections.shuffle(itemList);
		System.out.println("<추첨 결과>");
		for(int i = 0; i < num; i++) {
			System.out.println(nameList.get(i) + " → " + itemList.get(i));
		}
	}
}
