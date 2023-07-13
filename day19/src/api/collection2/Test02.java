package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		//List때 만들었던 로또 생성 프로그램 (shuffle은 (순서가 있어야되서) 리스트만 된다)
		Set<Integer> lotto = new TreeSet<>();
		Random r = new Random();
		for(int i = 0; i < 6 ; i++) {
			int num = r.nextInt(45) + 1;
			if (lotto.contains(num)) {
				i--;
			}
			else lotto.add(num);
		}
//		while (lotto.size() < 6) {
//			int num = r.nextInt(45) + 1;
//			lotto.add(num);
//		}
		System.out.println(lotto);
	}
}
