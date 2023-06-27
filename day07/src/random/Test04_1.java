package random;

import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		////만약 더블일 경우 한 턴을 더 던지게 처리하려면?
		//= 반복 횟수를 증가시키려면? 
		//= 재추첨
		Random r = new Random();
		
		int count = 0;
		int size = 100;
		int real = 0;
		for(int i = 1 ; i <=size ; i++) {
			real++;
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;
			if (dice1 == dice2) {
				count++;
				//추첨 코드가 아니라 반복분을 1회 증가시키는 코드를 추가
				i--; // 더블이 나오면 i가 늘어나지 않는다
			}
		}
		double douChance = (double)count / size * 100;
		System.out.println("더블 횟수 : " + count);
		System.out.println("더블이 나올 확률 : " + douChance  + "%");
		System.out.println("실제로 던진 횟수 : " + real);
	}
}
