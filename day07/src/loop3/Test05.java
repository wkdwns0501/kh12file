package loop3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//숫자 모래성 땅따먹기 //31게임이랑 똑같다
		//최초에 100이라는 값을 정해두고 사용자에게 한 자리 숫자(1~9)를 입력받아 차감을 합니다.
		//차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메세지를 출력
		//몇 번만에 게임오버가 되었는지 측정하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<숫자 모래성 땅따먹기 게임!>");
		int std = 100;
		int count = 0;
		while (true) {
			System.out.print("1~9 입력: ");
			int num = sc.nextInt();
			//[방법1] 원하는 상황일 경우만 코드를 실행하도록 구현 -> 원하는 상황이면 if문 안에 계산 넣기
			//[방법2] 원치 않는 상황이면 SKIP 하도록 처리 // 밑에가 방법2로 풀이한 것 
			//if(num >= 1 && num <= 9) // 1미만 또는 9초과인 경우
			if(!(num >= 1 && num <= 9)) { // 1이상 9이하인 경우
				System.out.println("1~9만 입력 가능합니다.");
				continue; // 처음으로 이동
			}	
				count++;
				std -= num;
					if (std <= 0) {
						break;
					}
					else {
						System.out.println("1~9만 입력하세요.");
					}
		}
		sc.close();
		System.out.println("게임오버! 총" + count + "번 입력했습니다.");
	}
}