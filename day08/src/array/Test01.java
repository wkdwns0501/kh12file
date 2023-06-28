package array;

public class Test01 {
	public static void main(String[] args) {
		//배열 (array)
		// - 여러 개의 같은 종류 데이터를 저장할 수 있는 공간
		// ex : 숫자 3개를 입력받아서 출력하는 프로그램
		// 정수 여러개 거치공간
		// 변수를 사용하면 반복문 불가, 배열은 반복문 가능
		// 데이터가 많으면 무조건 배열이 좋다
		
		//생성 
		//a(리모컨_ ----> [ 0 ][ 0 ][ 0 ] // 시작지점에서 얼마나 떨어져있나
		int[] a = new int[3];
		
		//a = 10; // error (컴파일에러)
		a [0] = 10;
		a [1] = 20;	
		a [2] = 30;	
		a [3] = 40;	 // 실행하면 error (런타임 에러)
		System.out.println(a);//리모컨 정보 출력
		System.out.println(a[0]); // a가 보는 +0지점 데이터
		System.out.println(a[1]); // a가 보는 +1지점 데이터
		System.out.println(a[2]); // a가 보는 +2지점 데이터
		System.out.println(a[3]); //없음 (error)
	}
}
