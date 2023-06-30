package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Tariff a = new Tariff();
		Tariff b = new Tariff();
		Tariff c = new Tariff();
		
		//데이터 초기화
		//a.name = "5G언택트 52"; // 바람직하지 않은 방법
		a.setup("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		b.setup("KT", "5G세이브", 45000, 100, 900, 1500);
		c.setup("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		//출력
		a.show();
		b.show();
		c.show();
	}
}