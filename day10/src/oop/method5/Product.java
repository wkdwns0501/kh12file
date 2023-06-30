package oop.method5;

public class Product {
	String name, type;
	int price;
	boolean delivery, event;
	
	void setup(String name, String type, int price, boolean delivery, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.delivery = delivery;
		this.event = event;
	}
	void setup(String name, String type, int price) { //큰거에다가 몰아주기
		this.setup(name, type, price, false, false);
	}
	
	void show() {
		System.out.println("<상품 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		
		if(this.event) {
			System.out.print("가격 행사중 : " + this.price * 90 / 100 + "원");
			System.out.print(" (원래가격 : "+ this.price+"원)");
			System.out.println();
		}
		else {
			System.out.println("가격 : " + this.price+"원");
		}
		
		if(this.delivery) {
			System.out.println("* 새벽배송 가능(+2500원)");
		}
		else {
			System.out.println("* 새벽배송 불가");
		}
	}
}
