package oop.modifier3;

public class Student {
	private String name;
	private int score;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	//아무것도 안하는 생성자 = 기본생성자
	public Student() {}
}
