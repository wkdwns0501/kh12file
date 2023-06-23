package condition3;

public class Test03 {
	public static void main(String[] args) {
		//switch~case 구문
		// - if 구문은 "순차적"으로 실행되는 특징이 있다
		// - 이게 문제가 되는 상황이 있다
		
		//입력 - 월 정보
		int month = 2;
		
		switch(month) {//month에 있는 값을 토대로 실행 지점을 찾겠다
		case 12, 1 , 2 ://month가 2인 경우 실행할 곳       //java13이상 부터는 이렇게 컴마를 넣어 나열이 가능하다
			System.out.println("겨울");                            //하지만 회사에서 쓸 가능성이 거의 없다
			break;//그만하고 나가라
		case 3, 4, 5://month가 3인 경우 실행할 곳
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		default: //else
			System.out.println("가을");
			break;
		}
		
	}
}
