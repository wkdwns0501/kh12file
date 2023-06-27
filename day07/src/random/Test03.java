package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
//		윷놀이 게임
//		윷놀이는 빽도/도/개/걸/윷/모 중 하나가 랜덤으로 나옵니다.
		Random r = new Random();
//		1.랜덤을 이용하여 윷놀이 1턴의 결과를 출력하도록 구현하세요.
		int yut = r.nextInt(6);
		if(yut == 0) {
			System.out.println("빽도!");
		}
		else if (yut == 1) {
			System.out.println("도!");
		}
		else if (yut == 2) {
			System.out.println("개!");
		}
		else if (yut == 3) {
			System.out.println("걸!");
		}
		else if (yut == 4) {
			System.out.println("윷!");
		}
		else {
			System.out.println("모!");
		}
		
//		2.실제 윷놀이는 개가 가장 많이 나옵니다. 이것을 고려하여 코드를 변경하세요.
		// 0 = 안뒤집어진거 , 1 = 뒤집어진거
		// 빽도 = 0, 도 = 1,2,3 , 개 = 4,5,6,7,8,9 , 걸 = 10, 11, 12, 13 , 윷 = 14, 모 = 15
		int yut1 = r.nextInt(16); //빽도
		
		switch(yut1) {
		case 0: 
			System.out.println("빽도");
			break;
		case 1,2,3: 
			System.out.println("도");
			break;
		case 4,5,6,7,8,9: 
			System.out.println("개");
			break;
		case 10, 11, 12, 13: 
			System.out.println("걸");
			break;
		case 14: 
			System.out.println("윷");
			break;
		case 15: 
			System.out.println("모");
			break;
		}
	}
}
