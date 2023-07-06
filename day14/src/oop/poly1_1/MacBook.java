package oop.poly1_1;

public class MacBook extends NoteBook {

	@Override
	public void power() {
		System.out.println("맥북 전원 기능 테스트");
	}

	@Override
	public void video() {
		System.out.println("맥북 동영상 재생 기능 테스트");
	}

	@Override
	public void typing() {
		System.out.println("맥북 타이핑 기능 테스트");
	}

}
