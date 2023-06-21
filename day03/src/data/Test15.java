package data;

public class Test15 {
	public static void main(String[] args) {
		//KH 여행사에서는 다음과 같이 프로모션을 진행중입니다.국내 어디든 한 사람당 1박에 10만원!
		//추가로 25% 할인까지 챙겨가세요! 성인 3명이 7일동안 여행갈 때 예상 경비를 출력하세요.
		
		//입력
		int people = 3;
		int period = 7;
		int dayPrice = 100000;
		int rate = 25;
		
		//계산
		int pay = people * period * dayPrice;
		int discount = pay * rate / 100;
		int totalPrice = pay - discount;
		//int result = price * (100-rate) / 100; //비추천 (상대적으로 어려움)
		
		//출력
		System.out.println(pay);
		System.out.println(discount);
		System.out.println(totalPrice);
	}

}
