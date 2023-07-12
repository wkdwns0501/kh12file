package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//Scanner 클래스
		//= 문자열 입력 및 분석 클래스
		//= 키보드 입력은 기능 중 일부분일 뿐
		//= 파일 뿐 아니라 홈페이지도 읽어올 수 있다 (웹 크롤링)
		
		String sample = "떳다떳다 비행기\n날아라 날아라\n떳다떳다 비행기\n우리 비행기";
//		System.out.println(sample);
		
		//[1] 단어별로 읽기 	.next()			- 띄어쓰기나 개행 등 공백이 기준 
		//												   할일만 하고 남아있는 글자는 관심이 없음
		//							.hasNext() 		- 읽을 수 있는 단어가 있는지 판정 (T/F)
		//[2] 줄별로 읽기 	.nextLine() 		- 개행 문자 기준, 엔터를 기준으로 해석
		//												   다음 입력을 위해 엔터 전까지를 읽고 엔터를 버림
		//							.hasnextLine()	- 읽을 수 있는 줄이 있는지 판정 (T/F)
		//실제 개수 초과 출력하면 에러가 난다
		
		Scanner sc = new Scanner(sample);
		
		while(true) {//false면 그만해라
			if(sc.hasNext() == false) break;
			System.out.println(sc.next());			 
		}
		
		while(sc.hasNext()) {//true면 계속해라
			System.out.println(sc.next());			 
		}
		
		while(sc.hasNextLine()) {//true면 계속해라
			System.out.println(sc.nextLine());			 
		}
		//(Q) .next()와 .nextLine()을 섞어쓰면 어떻게 되는가?
		//(A) 섞어쓰면 문제가 발생한다 
		//(.next() 다음에 .nextLine()을 쓰면 문제 발생, 반대 경우는 괜찮다)
		System.out.println(sc.next());	
		System.out.println(sc.next());	
		System.out.println(sc.nextLine()); //출력되지 않는다 
													//버리는 명령으로 사용, 엔터를 날려버리는 기능으로 사용
		System.out.println(sc.nextLine());
		sc.close();
	}
}
