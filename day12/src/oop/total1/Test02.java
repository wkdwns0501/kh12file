package oop.total1;

public class Test02 {
	public static void main(String[] args) {
		//1번 계산
		Time a = new Time(3, 20, 0);
		Time b = new Time(1, 50, 30);
		Time c = TimeCalculator.plus(a, b);
		c.show();
				
		//2번 계산
		Time d = new Time(4000);
		Time e = new Time(1, 10, 0);
		Time f = TimeCalculator.minus(d, e);
		f.show();
			
	}
}
