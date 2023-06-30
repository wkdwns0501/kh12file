package oop.method6_1;

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
	//(문제점) show에서 너무 많은 일을 하고 있다
	//(해결책) 계산을 메소드가 할 수 있도록 추가 메소드 생성
	
	//[1] 총점을 구해주는 메소드
	//(참고) return 키워드는 "반환" 과 "종료"의 의미를 가지는 키워드
	// 			불러서 가져가라
	//(참고) void 키워드는 "결과물이 없음"이란 의미를 가지는 키워드
	int getTotal() {
		return this.korean + this.english + this.math;
	}
	
	//[2] 평균을 구해주는 메소드
	float getAvg() {
		return this.getTotal() / 3f;
	}
	
	//[3] 합격/불합격을 판정하는 메소드
	boolean getPass() {
		return this.korean >= 40 && this.english >= 40 && this.math >= 40 && this.getAvg() >= 60;
	}
	void show() {
		System.out.println("<학생 성적 정보>");
		System.out.println(this.level + "학년 " + this.ban + "반 " + this.name);
		System.out.print("국어 : " + this.korean + "점 / ");
		System.out.print("영어 : " + this.english + "점 / ");
		System.out.println("수학 : " + this.math + "점");
		System.out.print("총점 : " + this.getTotal() + "점 / ");
		System.out.println("평균 : " + this.getAvg() + "점");
		if(getPass()) {
			System.out.println("판정 결과 : 통과");
		}
		else {
			System.out.println("판정 결과 : 재평가");
		}
	}
}
