package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		
		Savings a = new Savings("유재석", 3, 15, 1000000, 15000000L);
		Savings b = new Savings("강호동", 2, 5, 500000, 2500000L);
		Savings c = new Savings("신동엽", 2, 8, 800000, 10000000L);
		
		a.show();
		b.show();
		c.show();
	}
}
