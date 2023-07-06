package oop.multi2;

public class Kickboard implements Electronic, Transportation{

	@Override
	public void move() {
		System.out.println("킥보드가 이동합니다");
	}

	@Override
	public void on() {
		System.out.println("킥보드의 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("킥보드의 전원을 킵니다");
	}

}
