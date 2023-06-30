package oop.method4;

public class Menu {
	String name, type;
	int price;
	boolean event;
	
	//setup을 두 종류로 구현 (메소드 오버로딩, method overloading)
	//[1] 3개의 데이터가 들어오면 이벤트는 안하는 걸로 생각하여 처리
	//[2] 4개의 데이터가 들어오면 이벤트 정보도 설정하는걸로 처리
	//필수 데이터를 제외한 선택 데이터만
	void setup(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = false; //boolean은 기본이 false기 때문에 (= false)를 안써도 된다
	}
	void setup(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	void show() {
		System.out.println("<커피숍 메뉴 정보>");
		System.out.print("이름 : " + this.name);
		if(this.event) {//행사중이면
			System.out.print(" (행사중)");
		}
		System.out.println();
		System.out.println("분류 : " + this.type);
		if(this.event) {//행사중이면
			int rate = 20;
			int dis = this.price * rate / 100;
			int disPrice = this.price - dis;
			System.out.print("판매가 : " + disPrice + "원");
			System.out.print(" (원가 : " + this.price + "원)");
			System.out.println();
		}	
		else {
			System.out.println("가격 : " + this.price + "원");
		}
	}
}
