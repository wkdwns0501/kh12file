package oop.constructor1;

public class Student {
	String name;
	int score;
	
	//기본생성자
	//- 생성만하고 아무짓도 안함
	//- 한개도 없으면 자동생성됨
	//- 생성자가 없으면 객체생성불가
//	Student(){}
	
	//- 생성자의 이름은 클래스 이름
	//- 하는 일은 setup메소드와 동일
	//- setup 대신 생성자를 생성함
	//- 생성자도 오버로딩(overloading)이 가능
	Student(String name){
		this.name = name;
		this.score = 0;
	}
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
}
