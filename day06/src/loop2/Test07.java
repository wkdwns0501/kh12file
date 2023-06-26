package loop2;

public class Test07 {
	public static void main(String[] args) {
		//여름을 맞이하여 다이어트 계획을 다음과 같이 세웠습니다.
		//1. 30일동안 매일 하루에 20개씩 푸시업을 한다
		//2. 30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 푸시업을 한다
		//1번과 2번에 대한 각각의 푸시업 개수 합계를 구하여 출력하세요
		
		//1.
		int pushUp1 = 0;
		for (int i = 1 ; i <= 30 ; i++) {
			//System.out.println(i + "일차 : 20개");
			pushUp1 += 20;
		}
		System.out.println("합계 : " + pushUp1);
		
		//2.
		int pushUp2 = 10;
		int result = 0;
		for (int i = 1 ; i <= 30 ; i++) {
			System.out.println(i + "일차 : "+ pushUp2 +"개");
			result += pushUp2;
			pushUp2 += 3; //pushUp2 = i * 3 + 7 (비추천) // pushUp2 = 10 + ( i - 1) * 3; (비추천, 복잡)
		}
		System.out.println("총 푸시업 개수 = " + result);
		
	}
}
