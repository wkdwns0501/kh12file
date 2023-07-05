package oop.inherit2;

//슈퍼 클래스 (상위 클래스, 부모 클래스)
//- 객체 생성이 목적이 아님
//- 비슷한 클래스들의 공통적인 부분들을 모아두는 클래스
//- 시리즈로 만들어야 할때 사용
//- 80%~90% 똑같은게 있을때 사용
//- IPhone 클래스가 this, 각각의 시리즈 클래스가 super
//- 먼저 this에서 확인후 없으면 super로 넘어간다

public class IPhone {
	//필드 - 공통적으로 필요한 필드를 작성
	private String number;
	private String color;
	private int price;
	
	//메소드 - 공통적인 메소드만 작성
	public void call() {
		System.out.println("전화걸기");
	}
	public void camera() {
		System.out.println("사진찍기");
	}

}
