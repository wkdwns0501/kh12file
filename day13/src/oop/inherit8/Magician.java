package oop.inherit8;

public class Magician extends Player{

	public Magician(String id) {
		super(id);
	}
	
	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}
	@Override
	public void move() {
		System.out.println("마법사가 텔레포트로 이동합니다!");
	}
	@Override
	public void store() {
		System.out.println("마법사가 상점을 개설합니다!");
	}
}