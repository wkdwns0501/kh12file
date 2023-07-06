package oop.inherit8;

public class Test02 {
	public static void main(String[] args) {
		//객체를 업캐스팅하여 생성
		//= 상속 관계에서 특정 클래스로 대충 묶어서 표현하고 싶을때
		
//		Player a = new Warrior("테스터1");
//		Player a = new Magician("테스터1");
		Player a = new Archer("테스터1");
		
//		Player b = new Warrior("테스터2");
		Player b = new Magician("테스터2");  //플레이어로 갔다가 마법사로감
//		Player b = new Archer("테스터2"); 
																
		Interaction.battle(a,b);
		//다형성
		//예) 집 - 황인빈(황인빈)	//집에서 학원 - 업캐스팅			//하는 행동이 다르다
		// 학원 - 황인빈(강사)  												//변하는게 아닌 형태가 달라지는것
		// 집 - 황인빈(황인빈)		//학원에서 집 - 다운캐스팅		//기능이 달라질뿐 객체가 변하는게 아니다
		// 반드시 상속관계만 업캐스팅이 된다							//역할의 기능을 껍데기라도 만들어 놔야 한다
		// 재정의가 되어야한다
	}
}