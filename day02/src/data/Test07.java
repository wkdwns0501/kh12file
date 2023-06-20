package data;

public class Test07 {
	public static void main(String[] args) {
		//버스 요금 계산 문제 , 성인 2명과 어린이 1명의 요금을 구하여 출력하세요
		
		//입력
		int adultPrice = 1200 , adultCount = 2;
		int youthPrice = 1000 , youthCount = 0;
		int childPrice = 500 , childCount = 1;
		
		//계산
		int adultTotal = adultPrice * adultCount;
		int youthTotal = youthPrice * youthCount;
		int childTotal = childPrice * childCount;
		
		int totalPrice = adultTotal + youthTotal + childTotal;
		
		//출력
		System.out.println(totalPrice);
	}
}