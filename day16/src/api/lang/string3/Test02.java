package api.lang.string3;

public class Test02 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		long start = System.currentTimeMillis(); //이때 시간을 재준다 // 측정시작
		
		String star = "";
		for(int i = 0 ; i < 10 ; i++) { // 10 - 0밀리초 // 100 - 1밀리초 // 1000 - 2밀리초 
			star += "*"; 			// 10000 - 50밀리초 // 100000 - 1499밀리초 // 1000000 - 116897밀리초 ...
		}								//이 방법은 성능이 좋지 않다, 절대 안쓴다
		
		long finish = System.currentTimeMillis(); // 측정완료
		
		long time = finish - start;
		System.out.println(time);
	}
}
