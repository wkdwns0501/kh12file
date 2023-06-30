package oop.method3;

public class Tariff {
	//멤버 필드
	String company, name; // 멤버 변수
	int pay, data, call, message;
	
	//멤버 메소드
	void setup(String company, String name, int pay, int data, int call, int message) { //매개 변수
		this.company = company;
		this.name = name;
		this.pay = pay;
		this.data = data;
		this.call = call;
		this.message = message;
		//지역 변수
	}
	void show() {
		System.out.println("<통신사 요금제 정보>");
		System.out.println("통신사 : " + this.company);
		System.out.println("상품명 : " + this.name);
		System.out.println("월정액 : " + this.pay + "원");
		System.out.println("데이터 : " + this.data + "GB");
		System.out.println("통화 : " + this.call + "분");
		System.out.println("문자 : " + this.message + "건");
		
	}
}
