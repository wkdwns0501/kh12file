package array;

import java.util.Random;

public class Test08_2 {
	public static void main(String[] args) {
		//주사위를 1000번 던졌을 때 각각 나온 횟수 측정하기
		Random r = new Random();
		int []countList = new int[6]; // = new int[]{0, 0, 0, 0, 0, 0};
		//변수 6개를 묶어서 사용
		for (int i =0 ; i < 1000 ; i++) {
			int dice = r.nextInt(6) + 1;
			countList[dice-1]++;
		}
		for (int i =0 ; i < countList.length ; i++) {
			System.out.println((i+1) + "이 나온 횟수 = " + countList[i]);
			
		}
	}
}