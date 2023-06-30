package oop.method6_1;

public class Test01 {
	public static void main(String[] args) {
		
		Exam a = new Exam();
		Exam b = new Exam();
		Exam c = new Exam();
		Exam d = new Exam();
		
		a.setup(1, 1, "마리오", 50, 60, 50);
		b.setup(1, 1, "루이지", 60, 90, 50);
		c.setup(1, 2, "쿠파", 70, 70, 80);
		d.setup(1, 2, "요시", 80, 85, 35);
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}