package oop.setter3;

public class Phone {
	String name, company;
	int pay, contract;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setCompany(String company) {
		switch(company) {
		case "SK":
		case "KT":
		case "LG":
			this.company = company;
		}
	}
	
//	void setPay(int pay) {
//		if(pay >= 0) {
//			this.pay = pay;
//		}
//	}
	
	void setPay(int pay) {
		if(pay < 0) {
			return;
		}
		this.pay = pay;
	}
	
	void setContract(int contract) {
		switch(contract) {
		case 0:
		case 24:
		case 36:
			this.contract = contract;
		}
	}
	//메소드 오버로딩
	void setup(String name, String company, int pay) {
		this.setup(name, company, pay, 0);
	}
	void setup(String name, String company, int pay, int contract) {
		this.setName(name);
		this.setCompany(company);
		this.setPay(pay);
		this.setContract(contract);
	}
	void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.company);
		if(this.contract == 0) {//약정이 없다면
			int dis = this.pay * 5 / 100;
			int result = this.pay - dis;
			System.out.print("판매가 : " + result + "원");
			System.out.println(" (원가 : " + result + "원)");
		}
		else {//약정이 있다면
			int monthPrice = this.pay / this.contract;
			System.out.print("가격 : " + this.pay + "원");
			System.out.println(" (월 : " + monthPrice + "원)");
		}
		if(this.contract == 0) {
			System.out.println("약정 없음");
		}
		else {
			System.out.println("약정 : " + this.contract + "개월");
		}
	}
}
