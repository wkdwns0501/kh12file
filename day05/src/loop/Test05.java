package loop;

public class Test05 {
	public static void main(String[] args) {
		//1부터 99 사이에 369게임에서 박수치는 숫자만 필터링하여 출력
		
		for (int i = 1 ; i <= 99 ; i++) {
			int ten = i / 10;
			int one = i % 10;
			switch (ten) {
			case 3, 6, 9:
				System.out.println(i);
				break;
			}
			switch (one) {
			case 3, 6, 9:
				System.out.println(i);
				break;
			}
		}	
	}
}
