package api.lang.test1;

public class Test01 {
	public static void main(String[] args) {
		//StringBuffer 클래스를 문서만 보고 써보기
		
		//객체 생성
		StringBuffer a = new StringBuffer(10); //10자리(용량) 생성
		StringBuffer b = new StringBuffer("hello");
		
		//메소드 활용
		a.append("KH정보교육원"); // 추가하기
		System.out.println(a.toString()); //요약
		System.out.println(b.toString());
		System.out.println(a.capacity()); //용량 길이
		System.out.println(b.capacity());
		System.out.println(a.length());//문자 길이
		System.out.println(b.length());
		b.reverse();//뒤집기
		System.out.println(b);
	}
}
