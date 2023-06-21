package data3;

public class Test05 {
	public static void main(String[] args) {
		//건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다
		//올해가 짝수 해라면, 짝수년도 출생자가 대상이고 올해가 홀수 해라면, 홀수년도 출생자가 대상입니다
		//어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고 이 사람이 올해 건강검진 대상인지 아닌지 판정하여 출력
			//결론 = 30세이상 && (짝수해이면서 짝수년생 || 홀수해이면서 홀수년생)
		
		int birth = 1985;
		int year = 2023;
		
		int age = year - birth + 1;
		boolean condition1 = age >= 30;
		//boolean condition2a = year % 2 == 0;
		//boolean condition2a = birth % 2 == 0;
		//boolean condition3a = year % 2 == 1; // year % 2 != 0 도 가능
		//boolean condition3a = birth % 2 == 1 // birth % 2 != 0 도 가능
		boolean condition2 = year % 2 == 0 && birth % 2 == 0;
		//boolean condition2 = 2a && 2b
		boolean condition3 = year % 2 == 1 && birth % 2 == 1;
		//boolean condition3 = 3a && 3b
		boolean medical = condition1 && (condition2 || condition3);
		
		System.out.println(medical);
		
	}
}