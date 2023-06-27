package loop2;

public class Test01 {
	public static void main(String[] args) {
		//카운트 측정, 합계 계산
		
		//(기존) 1부터 100사이의 홀수를 출력
		//(변경) 1부터 100사이의 홀수가 몇개인지
		
		//1. 1부터 100사이의 홀수를 출력
		//2. 카운트 측정
		
		int count = 0; //최초 카운트를 0으로 설정 (초기화)
		
		for (int i = 1 ; i <= 100 ; i++) {
			if(i % 2 != 0) {
				//System.out.println(i);
				count++;//원하는 상황에 카운트 증가 코드를 배치
			}
		}
		System.out.println(count); //반복 종류 후 카운트 사용
	}
}
