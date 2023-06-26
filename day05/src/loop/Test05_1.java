package loop;

public class Test05_1 {
	public static void main(String[] args) {
		//1부터 99 사이에 369게임에서 박수치는 숫자만 필터링하여 출력
		
		for (int i = 1 ; i <= 99 ; i++) {
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean one = i %10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean clap = ten || one;
			boolean doubleClap = ten && one;
			if (clap) {
				System.out.println("짝");
			}
				if (doubleClap) {
					
				}
			else {
				System.out.println(i);
			}
		}	
	}
}