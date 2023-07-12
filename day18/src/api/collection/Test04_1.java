package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		//로또 번호 추첨기
		
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		lotto.sort(null);
		System.out.println(lotto);
	}
}
