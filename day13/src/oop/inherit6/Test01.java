package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy23s a = new Galaxy23s("010-1111-1111","실버");
		a.show();
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		GalaxyFold4 b = new GalaxyFold4("010-2222-2222","블랙");
		b.show();
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		IPhone13 c = new IPhone13("010-3333-3333","골드");
		c.show();
		c.call();
		c.sms();
		c.siri();
		c.itunes();
		
		IPhone14 d = new IPhone14("010-4444-4444","화이트");
		d.show();
		d.call();
		d.sms();
		d.siri();
		d.facetime();
	}
}
