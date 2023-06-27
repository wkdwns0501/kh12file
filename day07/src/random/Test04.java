package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int count = 0;
		int size = 100;
		for(int i = 1 ; i <=size ; i++) {
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;
			//System.out.println("주사위 : " + dice1 + ", " + dice2);
			if (dice1 == dice2) {
				count++;
				//System.out.println("더블!");
			}
		}
		double douChance = (double)count / size * 100;
		System.out.println("더블 횟수 : " + count);
		System.out.println("더블이 나올 확률 : " + douChance  + "%");
	}
}
