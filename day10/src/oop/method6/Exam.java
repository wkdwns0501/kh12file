package oop.method6;

public class Exam {
	int level, ban, korean, english, math;
	String name;
	
	//setup만들기 전 오버로딩 할 변수가 있는지
	void setup(int level, int ban, String name, int korean, int english, int math) {
		this.level = level;
		this.ban = ban;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	void show() {
		System.out.println("<학생 성적 정보>");
		System.out.println(this.level + "학년 " + this.ban + "반 " + this.name);
		System.out.print("국어 : " + this.korean + "점 / ");
		System.out.print("영어 : " + this.english + "점 / ");
		System.out.println("수학 : " + this.math + "점");
		int total = this.korean + this.english + this.math;
		float avg = (float)total / 3;
		System.out.print("총점 : " + total + "점 / ");
		System.out.println("평균 : " + avg + "점");
		if(this.korean >= 40 && this.english >= 40 && this.math >= 40 && avg >= 60) {
			System.out.println("판정 결과 : 통과");
		}
		else {
			System.out.println("판정 결과 : 재평가");
		}
	}
}
