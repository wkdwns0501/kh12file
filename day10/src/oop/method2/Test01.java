package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Olympic p1 = new Olympic();
		Olympic p2 = new Olympic();
		Olympic p3 = new Olympic();
		
		//초기화
		p1.setup("진종오", "사격", "하계", 4, 2, 0);
		p2.setup("김수녕", "양궁", "하계", 4, 1, 1);
		p3.setup("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		//출력
		p1.show();
		p2.show();
		p3.show();
	}
}