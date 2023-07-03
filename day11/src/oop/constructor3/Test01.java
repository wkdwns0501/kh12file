package oop.constructor3;

public class Test01 {
	public static void main(String[] args) {
		//이 문제는 생성하는 사람이 관리자, 사용자 이다
		Character a = new Character("헤라클래스", "전사", 50);
		Character b = new Character("포세이돈", "마법사", 20);
		Character c = new Character("아프로디테", "마법사");
		
		a.show();
		b.show();
		c.show();
	}
}
