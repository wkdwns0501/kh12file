package loop2;

public class Test08 {
	public static void main(String[] args) {
		//현명한 노인 문제
		int money = 1;
		int result = 0;
		for (int day = 1 ; day <= 30 ; day++) {
			System.out.println(day + "일차 : " + money + "원");
			result += money;
			money *= 2;
		}
		System.out.println("30일간 총 금액 : " + result + "원");
		
		long money2 = 1L;
		long result2 = 0L;
		for (int day2 = 1 ; day2 <= 40 ; day2++) { // day 를 작은 수로 바꿔서 꼭 검증을 해라
			System.out.println(day2 + "일차 : " + money2 + "원"); //순서중요!
			result2 += money2;   //순서중요!				순서가 바뀌면 답이 다르게 나온다
			money2 *= 2L;		   //순서중요!
		}
		System.out.println("40일간 총 금액 : " + result2 + "원");
	}
}
