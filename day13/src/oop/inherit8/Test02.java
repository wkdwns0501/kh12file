package oop.inherit8;

public class Test02 {
	public static void main(String[] args) {
//		Player a = new Warrior("테스터1");
//		Player a = new Magician("테스터1");
		Player a = new Archer("테스터1");
		
//		Player b = new Warrior("테스터2");
		Player b = new Magician("테스터2");
//		Player b = new Archer("테스터2");
		
		Interaction.battle(a,b);
	}
}