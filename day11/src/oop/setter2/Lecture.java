package oop.setter2;

public class Lecture {
	String name, type; //강좌명, 구분
	int time, fee; //강의시간, 수강료
	
	
	void setName(String name) {
		this.name = name;
	}
	
	void setTime(int time) {
		if(time % 30 == 0 && time > 0) {
			this.time = time;
		}
	}
	
	void setFee(int fee) {
		if(fee >= 0) {
			this.fee = fee;
		}
	}
	
//	void setFee(int fee) { //위의 코드와 같은 의미이다, 조건이 많을때 사용 (괄호가 많을때)
//		if(fee < 0) {
//			return; //반환은 없지만 중지하세요!
//		}
//		this.price = price;
//	}
	
	void setType(String type) { // 아닐때는 하지않아도 된다
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	void setup(String name, int time, int fee, String type) {
		this.setName(name);
		this.setTime(time);
		this.setFee(fee);
		this.setType(type);
	}
	
	void show() {
		System.out.println("<학원 강의 요금표>");
		System.out.println("강좌명 : " + this.name);
		System.out.println("강좌 시간 : " + this.time + "시간");
		System.out.println("강좌 요금 : " + this.fee + "원");
		System.out.println("구분 : " + this.type);
	}
}
