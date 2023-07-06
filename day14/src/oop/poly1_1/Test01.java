package oop.poly1_1;

public class Test01 {
	public static void main(String[] args) {
		int type = 1;
		int action = 1;
		
		NoteBook a;
		if (type == 1) {
			a = new MacBook(); // MacBook --> NoteBook(업캐스팅)
		}
		else {
			a = new GalaxyBook(); // GalaxyBook --> NoteBook(업캐스팅)
		}
		
		//a에 들어간 객체의 기능을 실행
		if(action == 1) {
			a.power();
		}
		else if (action == 2) {
			a.video();
		}
		else {
			a.typing();
		}
	}
}
