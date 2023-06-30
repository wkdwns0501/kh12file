package oop.method2;

public class Olympic {
	//멤버 필드 (member field) - 데이터
	String name;
	String event;
	String type;
	int gold, silver, bronze;
	
	//멤버 메소드 (member method) - 코드
	void setup(String name, String event, String type, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.type = type;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	void show() {
		System.out.println("<역대 한국인 올림픽 메달 보유 선수>");
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.event);
		System.out.println("구분 : " + this.type);
		System.out.print("금메달 : " + this.gold + "\t");
		System.out.print("은메달 : " + this.silver + "\t");
		System.out.println("동메달 : " + this.bronze);
	}
}
