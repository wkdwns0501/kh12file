package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		
		//생성
		Soccer a = new Soccer();
		Soccer b = new Soccer();
		Soccer c = new Soccer();
		Soccer d = new Soccer();
		
		//초기화
		a.setup(1, "킬리안 음바페", "프랑스", 8);
		b.setup(2, "리오넬 메시", "아르헨티나", 7);
		c.setup(3, "올리비에 지루", "프랑스", 4);
		d.setup(4, "훌리안 알바레스", "아르헨티나", 4);
		
		//출력
		a.show(); // a를 주인공으로 해서 show에 있는 코드를 실행
		b.show();
		c.show();
		d.show();
	    //a.show = 100; //에러
	}
}