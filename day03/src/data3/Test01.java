package data3;

public class Test01 {
	public static void main(String[] args) {
		//논리 (Logical Data)
		//- 수치를 기반으로 Yes/No를 판정하기 위한 데이터 형태
		//- Yes 대신 true, No 대신 false 라는 값을 사용
		//- 형태는 boolean 한개 뿐이다
		
		boolean a = true;
		boolean b = false;
		
		//(Q) 주머니에 2만원이 있다. 피자가 18000원 일때 주문이 가능한가?
		int money = 20000;
		int pizza = 18000;
		
		boolean order = money >= pizza;
		System.out.println(order);
	}
}