package array3;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		//주사위를 5번씩 6회 던진 결과를 저장한 뒤 
		//(1) 회차별 주사위 던진 결과를 출력하시고 
		//(2) 모든 주사위 값의 평균을 출력하세요
		
		//회차의 평균이 안나옴...
		
		int[][] diceList = new int[6][5];
		Random r = new Random();
		int count = 0;
		int total = 0;
		int roundTotal = 0;
		for(int i = 0 ; i < diceList.length ; i++) {
			System.out.print(i+1 + "회차 - ");
			for(int k = 0 ; k < diceList[i].length ; k++) {
				diceList[i][k] = r.nextInt(6) + 1;
				System.out.print(k+1 + "번 : " + diceList[i][k] + "\t");
				total += diceList[i][k];
				count++;
			}
			double roundAvg = (double)roundTotal / diceList[i].length;
			System.out.print(i+1 + "회차의 평균 : " + roundAvg);
			System.out.println();
		}
		double avg = (double)total / count;
		System.out.println("모든 주사위값의 평균 : " + avg);
	}
}