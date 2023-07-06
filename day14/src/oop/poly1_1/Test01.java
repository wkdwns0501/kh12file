package oop.poly1_1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("노트북을 먼저 선택하세요");
		System.out.print("1.맥북\t2.갤럭시북 : ");
		int type = sc.nextInt();
		System.out.println("테스트할 기능을 선택하세요");
		System.out.print("1.전원\t2.동영상 재생\t3.타이핑 : ");
		int action = sc.nextInt();
		sc.close();
		
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
