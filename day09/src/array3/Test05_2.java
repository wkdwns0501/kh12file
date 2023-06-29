package array3;

import java.util.Random;

public class Test05_2 {
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
		
		//회차별 평균 계산
		//= 합계 저장할 변수가 "회차" 개수만큼 있어야 한다
		int[] totalList = new int[diceList.length];
		float[] avgList = new float[diceList.length];
		
		for (int i = 0 ; i< diceList.length ; i++) {
			for(int k = 0; k<diceList[i].length ; k++) {
				totalList[i] += diceList[i][k];
			}
			avgList[i] = (float)totalList[i] / diceList[i].length;
		}
		for (int i = 0 ; i< avgList.length ; i++) {
			System.out.println((i+1) + "회차의 평균 : " + avgList[i]);
		}
		
		
		for (int i = 0 ; i< diceList.length ; i++) {
			for(int k = 0; k<diceList[i].length ; k++) {
				System.out.print(diceList[i][k] + "\t");
			}
			System.out.println();
		}
		
	}
}