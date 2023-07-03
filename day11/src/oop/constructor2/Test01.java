package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		
		Chart a = new Chart("그그그", "WSG워너비", "WSG워너비 1집", 104250L, 91835);
		Chart b = new Chart("보고싶었어", "WSG워너비", "WSG워너비 1집", 83127L, 90805);
		Chart c = new Chart("LOVE DIVE", "아이브", "LOVE DIVE", 64590L, 174519);
		Chart d = new Chart("POP!", "나연", "IM NAYEON", 58826L, 70313);
		Chart e = new Chart("애국가", null, "애국가", 10000L, 20000);
		
		a.show();
		b.show();
		c.show();
		d.show();
		e.show();
	}
}
