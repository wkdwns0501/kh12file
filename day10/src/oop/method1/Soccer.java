package oop.method1;

//클래스
public class Soccer {
	//멤버 필드 (멤버 변수) - 데이터 저장 목적
	int rank;
	String name;
	String country;
	int goal;
	
	//멤버 메소드 - 공통코드
	//void 이름() {코드}
	void show() {//출력용
		//this = 클래스의 멤버를 의미 (내꺼)
		System.out.println("순위 : " + this.rank);
		System.out.println("이름 : " + this.name);
		System.out.println("국가 : " + this.country);
		System.out.println("골 : " + this.goal);
	}
	
	// - 설정될 값을 알 수 없으므로 외부에서 전달 받아서 초기화
	// - 매개변수
	void setup(int rank, String name, String contry, int goal) {//초기화용
		this.rank = rank;
		this.name = name;
		this.country = contry;
		this.goal = goal;
	}
	
}
