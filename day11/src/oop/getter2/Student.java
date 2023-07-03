package oop.getter2;

public class Student {
	//멤버 필드
	String name;
	int level, korean, english, math;
	
	//멤버 메소드
	void setName(String name) {
		this.name = name;
	}
	void setLevel(int level) {
		this.level = level;
	}
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
//	void setEnglish(int english) {
//		if(english >= 0 && english <= 100) {
//			this.english = english;
//		}
//	}
	void setEnglish(int english) {
		if(english < 0 || english > 100)  return;
		this.english = english;
	}
	void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
	}
	String getName() {
		return this.name;
	}
	int getLevel() {
		return this.level;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	int getTotal() {
		//return this.korean + this.english + this.math; //이걸로 써도 상관없다
		return this.getKorean() + this.getEnglish() + this.getMath(); //이게 더좋지만
	}
	float getAvg() {
		return this.getTotal() / 3f;
	}
	String getRank() {
		if(getAvg() >=90) {
			return "A";
		}
		else if(getAvg() >= 80) {
			return "B";
		}
		else if(getAvg() >= 70) {
			return "C";
		}
		else { //여기는 else 가 꼭 있어야한다
			return "F";
		}
	}
	void setup(String name, int level, int korean, int english, int math) {
		this.setName(name);
		this.setLevel(level);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	void show() {
		System.out.println("<학생 성적 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.level);
		System.out.println("국어 : " + this.korean + "점");
		System.out.println("영어 : " + this.english+ "점");
		System.out.println("수학 : " + this.math+ "점");
		System.out.println("총점 : " + getTotal()+ "점");
		System.out.println("평균 : " + getAvg()+ "점");
		System.out.println("등급 : " + getRank());
	}
}
