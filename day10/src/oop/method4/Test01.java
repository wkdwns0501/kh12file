package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		//이벤트의 경우는 설정하지 않으면 안하는 걸로 할 수 있겠는가?
		//= setup의 처리방식을 2가지로 분리할 수 있는가?
		a.setup("아메리카노", "음료", 2500, true);
		b.setup("모카라떼", "음료", 3500);
		c.setup("치즈케이크", "디저트", 5000, true);
		d.setup("마카롱", "디저트", 3000);
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
