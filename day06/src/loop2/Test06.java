package loop2;

public class Test06 {
	public static void main(String[] args) {
		//누적합계구하기
		//(Q1) 10을 10번 더하면 얼마에요?
		
		int num = 0;
		for(int i = 0 ; i < 10 ; i++) {
			num += 10;
		}
		System.out.println(num);
		
		//(Q2) 1부터 10까지 더하면 얼마에요?
		
		int total = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
