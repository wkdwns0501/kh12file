package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		
		int type = 1;
		int action = 1;
		
		if(type == 1) {
			MacBook a = new MacBook();
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
		else {
			GalaxyBook a = new GalaxyBook();
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
}
