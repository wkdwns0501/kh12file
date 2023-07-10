package api.lang.string3;

public class Test02_2 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정 //A thread-safe ~ : 잠금장치의 유무
		//- 싱글 스레드 환경에서는 StringBuilder가 효율적이다 (잠금장치가 없으니까)
		//- 멀티 스레드 환경에서는 StringBuffer가 효율적이다 (느리지만 안전)
		// 싱글인지 멀티인지 모르는 상황에서는 Buffer를 쓰자
		// 싱글이 확실하면 Builder를 쓰자
		
		long start = System.currentTimeMillis(); //이때 시간을 재준다 // 측정시작
		
		StringBuilder buffer = new StringBuilder(); //제일 빠르다
		for(int i = 0 ; i < 10 ; i++) { // 10 - 0밀리초 // 100 - 0밀리초 // 1000 - 0밀리초 
			buffer.append("*");		// 10000 - 2밀리초 // 100000 - 6밀리초 // 1000000 - 11밀리초 ...
		}										
		String star = buffer.toString();
		
		long finish = System.currentTimeMillis(); // 측정완료
		
		long time = finish - start;
		System.out.println(time);
	}
}
