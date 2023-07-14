package api.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		//경로 (path)
		//= PC마다 설치된 디스크 환경이 다를 수 있다
		//= D:/와 같은 절대적인 위치는 다른 PC에서 인식하지 못할 수 있다
		//= 다른 운영체제나 환경에서도 작동하는 경로를 설정하고 싶다
		
		//[1] 상대경로
		//- . 은 현재위치(current path)를 의미
		//- .. 은 상위 위치(parent path)를 의미
		//[2] System 클래스 활용
		
//		File a = new File("sample"); //프로젝트 범위에서 경로를 탐색
		//ex) day20 경로에(안에) 디렉터리 생성
		File a = new File("./sample"); //17줄과 같은 코드이다 //보통 더 정확히 보여주기위해 이렇게쓴다
		a.mkdirs(); 
		
		File b = new File("../dummy");
		b.mkdirs(); //ex) day20폴더 처럼 디렉터리 생성
		
		//[2]
		System.out.println(System.getProperty("user.home")); //사용자 홈 폴더
		System.out.println(System.getProperty("user.dir")); //프로그램 실행위치
		
		File c = new File(System.getProperty("user.home"), "dummy");
		c.mkdirs();
	}
}
