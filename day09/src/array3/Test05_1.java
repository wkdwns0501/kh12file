package array3;

import java.util.Random;

public class Test05_1 {
	public static void main(String[] args) {
		//주사위를 5번씩 6회 던진 결과를 저장한 뒤 
		//(1) 회차별 주사위 던진 결과를 출력하시고 
		//(2) 모든 주사위 값의 평균을 출력하세요
		int[][] diceList = new int[6][5]; //[회차][번]
		Random r = new Random();
		
		for (int i = 0 ; i< diceList.length ; i++) {
			for(int k = 0; k<diceList[i].length ; k++) {
				diceList[i][k] = r.nextInt(6) + 1;
			}
		}
		
		//합계와 개수를 구하면 평균을 구할 수 있다
		int total = 0;
		int count = 0;
		for (int i = 0 ; i< diceList.length ; i++) {
			for(int k = 0; k<diceList[i].length ; k++) {
				total += diceList[i][k];
				count++;
			}
		}
		System.out.println("total = " + total);
		System.out.println("count = " + count);
		float avg = (float)total / count;
		System.out.println("전체 평균  : " + avg);
		
		for (int i = 0 ; i< diceList.length ; i++) {
			for(int k = 0; k<diceList[i].length ; k++) {
				System.out.print(diceList[i][k] + "\t");
			}
			System.out.println();
		}
		
	}
}