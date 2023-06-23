package condition3;

public class Test02 {
	public static void main(String[] args) {
		//switch~case 구문
		// - if 구문은 "순차적"으로 실행되는 특징이 있다
		// - 이게 문제가 되는 상황이 있다
		
		//입력 - 월 정보
		int month = 2;
		
		switch(month) {//month에 있는 값을 토대로 실행 지점을 찾겠다
		case 12:                  //java13전까지는 case를 한줄에 하나씩 적어야함
		case 1:
		case 2://month가 2인 경우 실행할 곳
			System.out.println("겨울");
			break;//그만하고 나가라
		case 3://month가 3인 경우 실행할 곳
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		default: //else
			System.out.println("가을");
			break;
		}
		
	}
}
