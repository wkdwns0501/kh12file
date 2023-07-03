package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
//		Student a = new Student();
		
//		a.name = "피카츄"; //설정(set)
//		a.score = 50;         // 이걸 안되게 만들거다
//		
//		System.out.println(a.name); //반환(get/return)
//		System.out.println(a.score); // 이걸 안되게 만들거다
		
		//Student 클래스의 멤버필드에 private를 붙인다
		
		Student a = new Student("피카츄", 70);
		a.show();
	}
}
