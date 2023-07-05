package oop.inherit6;

//클래스에 final이 붙으면 이후에 상속이 불가능
public final class Galaxy23s extends Galaxy{
	//고유 필드
	public Galaxy23s(String number, String color) {
		super(number, color);
	}
	//고유 기능
	public void bixby() {
		System.out.println("갤럭시23s 음성인식 기능 실행");
	}
	//마음에 안드는 기능을 재정의 (override)
	@Override
	public void call() {
		System.out.println("갤럭시23s 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시23s 문자 기능 실행");
	}
	@Override
	public void samsungPay() {
		System.out.println("갤럭시23s 삼성페이 기능 실행");
	}
}
