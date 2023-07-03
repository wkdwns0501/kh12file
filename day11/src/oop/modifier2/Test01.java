package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		
		Subscribers a = new Subscribers("유재석", 3, 15, 1000000, 15000000L);
		Subscribers b = new Subscribers("강호동", 2, 5, 500000, 2500000L);
		Subscribers c = new Subscribers("신동엽", 2, 25, 800000, 10000000L);
		
		a.show();
		b.show();
		c.show();
	}
}
