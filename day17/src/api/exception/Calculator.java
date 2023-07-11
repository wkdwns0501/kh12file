package api.exception;

//객체지향 프로그래밍에서의 예외처리
//- 서로 호출하는 상황에서 예외가 발생하면 어떻게 처리할 것인가?
public class Calculator {
	
	//나누기 메소드 (불완전한 메소드, 위험한 메소드)
	//- throws 뒤에 예외 클래스 이름을 적어서 예외가 발생할 수 있음을 알림
	//- 이 메소드를 부르는 대상은 반드시 플랜B를 준비해야 한다
	public static int div(int left, int right) throws Exception {
			return left / right;
	}
}
