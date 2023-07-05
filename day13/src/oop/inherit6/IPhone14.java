package oop.inherit6;

public final class IPhone14 extends IPhone{
	
	public IPhone14(String number, String color) {
		super(number, color);
	}
	
	public void facetime() {
		System.out.println("아이폰14 영상통화 기능 실행");
	}
	
	@Override
	public void call() {
		System.out.println("아이폰14 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("아이폰14 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("아이폰14 음성인식 기능 실행");
	}
}
