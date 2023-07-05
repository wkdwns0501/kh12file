package oop.inherit7;

public abstract class Galaxy extends Phone{

	public Galaxy(String number, String color) {
		super(number, color);
	}
	
	//public abstract void call(); 	// 숨어
	//public abstract void sms();  // 	있음
	public abstract void samsungPay();
}
