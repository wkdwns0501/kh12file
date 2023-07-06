package oop.multi2;

public class Drone implements Electronic, Flyable, Transportation{

	@Override
	public void move() {
		System.out.println("드론이 이동합니다");
	}

	@Override
	public void on() {
		System.out.println("드론의 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("드론의 전원을 끕니다");
	}

	@Override
	public void fly() {
		System.out.println("드론이 비행합니다");
	}
	
}
