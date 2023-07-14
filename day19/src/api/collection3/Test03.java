package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Map<String, Integer> vote = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			if(name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(vote.containsKey(name)) {
				int count = vote.get(name);
				vote.put(name,count+1);
				System.out.println("[" + name + "] 현재 " +(count+1)+ "표 획득!");
			}
			else {
				vote.put(name, 1);
				System.out.println("[" + name + "] 현재 " +1+ "표 획득");
			}
		}
		sc.close();
		System.out.println(vote);
	}
}