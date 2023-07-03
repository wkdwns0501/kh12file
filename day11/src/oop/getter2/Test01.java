package oop.getter2;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		a.setup("마리오", 1 ,90, 80, 70);
		b.setup("루이지", 1 ,85, 85, 83);
		c.setup("쿠파", 3 ,70, 60, 55);
		
		a.show();
		b.show();
		c.show();
	}
}
