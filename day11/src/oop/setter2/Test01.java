package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		Lecture a = new Lecture();
		Lecture b = new Lecture();
		Lecture c = new Lecture();
		
		a.setup("자바 마스터과정", 90, 1000000,"온라인");   	// 조건에 맞지않으면 차단
		b.setup("파이썬 기초", 60, 600000, "온라인");				//변수형의 기본값으로 출력된다
		c.setup("웹 개발자 단기완성", 120, 1200000, "오프라인");// 0 , null 등
		
		a.show();
		b.show();
		c.show();
	}
}