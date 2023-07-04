package oop.total1;

public class Test01 {
	public static void main(String[] args) {
		Time t1 = new Time(3, 30, 40);//3시간 30분 40초
		Time t2 = new Time(1, 70, 100);//1시간 70분 100초
		Time t3 = new Time(50, 20);//50분 20초
		Time t4 = new Time(30000);//30000초
		
		t1.show();
		t2.show();
		t3.show();
		t4.show();
	}
}
