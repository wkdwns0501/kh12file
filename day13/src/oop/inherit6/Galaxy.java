package oop.inherit6;

public class Galaxy extends Phone{ //생성자 불러오기
	
	public Galaxy(String number, String color) {
		super(number, color);
	}

	//갤럭시 공통기능
	public void samsungPay() {
		System.out.println("삼성페이 기능 실행");
	}
	
}
