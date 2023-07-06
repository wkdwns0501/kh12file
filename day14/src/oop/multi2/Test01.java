package oop.multi2;

public class Test01 {
	public static void main(String[] args) {
		Drone a = new Drone(); // 온전히 다 사용 가능
//		Flyable a = new Drone(); // Flyable 에 있는 a.fly() 만 가능  (업캐스팅)
//		Electronic a = new Drone(); // Electronic 에 있는 a.on(), a.off() 만 가능 (업캐스팅)
//		Transportation a = new Drone(); // Transportation 에 있는 a.move() 만 가능 (업캐스팅)
//		Reserve a = new Drone(); // 상속관계가 아니므로 업캐스팅이 불가능
		a.on();
		a.fly();
		a.move();
		a.off();
		
		Transportation t = a; //업캐스팅
//		---------------------------------------------------------------
		//if(t가 드론일 경우만)
		if(t instanceof Drone) {
//			Drone b = t;//다운캐스팅(에러)
			Drone b = (Drone)t;//다운캐스팅(OK)
//			다운캐스팅은 많이 번거롭다
//			다운캐스팅은 안하게끔 프로그램 하는게 좋다
			b.on();
			b.fly();
			b.move();
			b.off();
		}
		
	}
}
