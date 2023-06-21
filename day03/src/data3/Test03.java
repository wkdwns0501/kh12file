package data3;

public class Test03 {
	public static void main(String[] args) {
		//어떤 숫자(ex : 17)가 주어졌을 때, 이 숫자가 짝수인지 판정하여 출력하도록 프로그램 구현

		//입력
		int num = 17;
		
		//계산
		//int mode = number % 2;
		//boolean zero = mod == 0; (모드가 0과 같습니까?)
		boolean evenNum = num % 2 == 0;
		
		//출력
		System.out.println(evenNum);
	}
}
