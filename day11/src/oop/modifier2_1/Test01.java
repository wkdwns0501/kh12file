package oop.modifier2_1;

public class Test01 {
	public static void main(String[] args) {
		
		Savings a = new Savings("유재석", 3, 1000000, 15, 15000000);
		Savings b = new Savings("강호동", 2, 500000, 5, 2500000);
		Savings c = new Savings("신동엽", 2, 800000, 8, 10000000);
		
		a.show();
		
		a.next();
		a.next();
		
		a.show();
//		b.show();
//		c.show();
	}
}
