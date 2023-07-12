package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//로또 번호 추첨기
		
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		
					//i < lotto.size 쓰면 안된다
		for(int i = 0; i < 6; i++) {
//			System.out.println("i = " + i); //확인용
			int num = r.nextInt(45) + 1;
			if(lotto.contains(num)) {
				i--;
			}
			else lotto.add(num);
		}
		System.out.println(lotto);
		
	}
}
