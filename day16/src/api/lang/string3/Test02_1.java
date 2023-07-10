package api.lang.string3;

public class Test02_1 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		long start = System.currentTimeMillis(); //이때 시간을 재준다 // 측정시작
		
		StringBuffer buffer = new StringBuffer(); //StringBuffer는 가변이다
		for(int i = 0 ; i < 10 ; i++) { // 10 - 0밀리초 // 100 - 0밀리초 // 1000 - 1밀리초 
			buffer.append("*");		// 10000 - 2밀리초 // 100000 - 5밀리초 // 1000000 - 22밀리초 ...
		}										
		String star = buffer.toString();
		
		long finish = System.currentTimeMillis(); // 측정완료
		
		long time = finish - start;
		System.out.println(time);
	}
}
