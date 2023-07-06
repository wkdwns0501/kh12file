package oop.multi1;

//핵심 상속 (클래스 상속)은 extends 키워드로 구현
//부가 상속 (인터페이스 상속)은 implements (여러개를 콤마로 구분)
//상속 규칙
//1. 자식클래스가 부모클래스를 선택한다
//2. 하나의 부모클래스만 선택 가능하다
//3. 상속시 모두 물려받는다
//클래스는 하나만 상속 가능 - 메인 상속
//인터페이스는 여러 개 상속 가능 - 서브 상속
public class Person implements Singer, Programmer{

	@Override
	public void sing() {
		
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		
	}

}
