package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Map<String, Integer> vote = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		int count = 0;
		while(true) {
			vote.put(name,count);
		}
	}
}
