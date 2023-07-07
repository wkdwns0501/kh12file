package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		사용자에게 프로그램 내에서 사용할 닉네임을 입력받도록 구현
//		단, 다음과 같은 상황일 경우 오류 메세지를 출력
//		닉네임이 2글자 이상 10글자 이하가 아닌 경우
//		닉네임에 운영자라는 단어가 포함된 경우
//		모든 검사를 통과했다면 닉네임 설정이 완료되었습니다라는 메세지를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 입력 : ");
		String nick = sc.next();
		sc.close();
		
		if ( nick.length() < 2 || nick.length() > 10 ) { //일을 덜 할 수 있게하는 조건을 위에 쓴다
			System.out.println("글자수는 2글자 이상 10글자 이하만 가능합니다");
		}
		else if ( nick.contains("운영자") ) {
			System.out.println("\'운영자\'라는 단어는 포함할 수 없습니다");
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다");
		}
		//화이트리스트 방식 : 여기에 적힌 사람만 되고 나머진 안됨
		//블랙리스트 방식 : 여기에 적힌사람만 안되고 나머진 됨
		
	}
}
