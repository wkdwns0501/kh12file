package opp.test3;

public class Test01 {
	public static void main(String[] args) {
		
		//생성
		Soccer a = new Soccer();
		Soccer b = new Soccer();
		Soccer c = new Soccer();
		Soccer d = new Soccer();
		
		//초기화
		a.rank = 1;
		a.name = "킬리안 음바페";
		a.country = "프랑스";
		a.goal = 8;

		b.rank = 2;
		b.name = "리오넬 메시";
		b.country = "아르헨티나";
		b.goal = 7;

		c.rank = 3;
		c.name = "올리비에 지루";
		c.country = "프랑스";
		c.goal = 4;
		
		d.rank = 4;
		d.name = "훌리안 알바레스";
		d.country = "아르헨티나";
		d.goal = 4;
		
		//출력
		System.out.println("순위 : " + a.rank);
		System.out.println("이름 : " + a.name);
		System.out.println("국가 : " + a.country);
		System.out.println("골 : " + a.goal);
		System.out.println();
		
		System.out.println("순위 : " + b.rank);
		System.out.println("이름 : " + b.name);
		System.out.println("국가 : " + b.country);
		System.out.println("골 : " + b.goal);
		System.out.println();
		
		System.out.println("순위 : " + c.rank);
		System.out.println("이름 : " + c.name);
		System.out.println("국가 : " + c.country);
		System.out.println("골 : " + c.goal);
		System.out.println();
		
		System.out.println("순위 : " + d.rank);
		System.out.println("이름 : " + d.name);
		System.out.println("국가 : " + d.country);
		System.out.println("골 : " + d.goal);
		System.out.println();
	}
}