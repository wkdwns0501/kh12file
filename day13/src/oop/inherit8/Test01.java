package oop.inherit8;

public class Test01 {
	public static void main(String[] args) {
		//플레이어는 생성 불가 (추상클래스라서)
		//Player p = new Player("포세이돈");
		Warrior a = new Warrior("전사123");
		Magician b = new Magician("마법사123");
		Archer c = new Archer("궁수123");
		
		a.show();
		a.attack();
		a.move();
		a.store();
		
		b.show();
		b.attack();
		b.move();
		b.store();
		
		c.show();
		c.attack();
		c.move();
		c.store();
	}
}
