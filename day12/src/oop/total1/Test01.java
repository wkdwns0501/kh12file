package oop.total1;

import oop.keyword3.Calculator;

public class Test01 {
	public static void main(String[] args) {
		Time a = new Time(3, 30, 40);
		a.show();
		Time b = new Time(1, 70, 100);
		b.show();
		Time c = new Time(50, 20);
		Time d = new Time(30000);
		
		c.show();
		d.show();
		
		Time t3 = new Time(a,b);
	}
}
