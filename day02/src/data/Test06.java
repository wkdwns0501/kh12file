package data;

public class Test06 {
	public static void main(String[] args) {
		//영화관 금액 계산 문제
		
		//입력
		int adultPrice = 15000;
		int youthPrice = 12000;
		int childPrice = 5000;
			
		int adultCount = 2;
		int youthCount = 2;
		int childCount = 0;
		
		//계산
		int adultTotal = adultPrice * adultCount;
		int youthTotal = youthPrice * youthCount;
		int childTotal = childPrice * childCount;
		
		int totalPrice = adultTotal + youthTotal + childTotal;
		
		//출력
		System.out.println(totalPrice);
	}
}