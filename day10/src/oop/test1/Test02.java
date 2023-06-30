package oop.test1;

public class Test02 {
	public static void main(String[] args) {
		//시험 성적 정보 1개를 저장
		//이름 = 피카츄, 국어 = 90, 영어 = 80, 수학 = 70
		//이름 = 라이츄, 국어 = 75, 영어 = 85, 수학 = 77

		Grade a = new Grade();
		Grade b = new Grade();
		//a (리모컨 - reference) ---> Grade객체 (이름, 국어, 영어, 수학)
		//b (리모컨 - reference) ---> Grade객체 (이름, 국어, 영어, 수학)
		// a, b 둘다 서로에게 영향이 없다
		
		//데이터의 자료형은 클래스에 있다 // 당연히 자료형이 맞지않으면 오류
		a.name = "피카츄";
		a.korean = 90;
		a.english = 80;
		a.math = 70;
		
		b.name = "라이츄";
		b.korean = 75;
		b.english = 85;
		b.math = 77;
		
		//System.out.println(a); // 의미없는 값
		System.out.println(a.name);
		System.out.println(a.korean);
		System.out.println(a.english);
		System.out.println(a.math);
		
		System.out.println(b.name);
		System.out.println(b.korean);
		System.out.println(b.english);
		System.out.println(b.math);
	}
}
