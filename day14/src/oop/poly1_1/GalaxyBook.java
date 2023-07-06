package oop.poly1_1;

public class GalaxyBook extends NoteBook {

	@Override
	public void power() {
		System.out.println("갤럭시북전원기능테스트");
	}

	@Override
	public void video() {
		System.out.println("갤럭시북영상재생기능테스트");
	}

	@Override
	public void typing() {
		System.out.println("갤럭시북타이핑기능테스트");
	}

}
