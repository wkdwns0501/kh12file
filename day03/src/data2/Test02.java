package data2;

public class Test02 {
	public static void main(String[] args) {
		//네이버에서 BMI 계산기 , 해당 프로그램에서 성별, 나이를 제거하고 만들 예정입니다
		//키가 180cm, 체중이 80kg인 사람이 있을 때 이 사람의 BMI 지수를 구하여 출력
		//계산공식 = 체중(kg) / 키²(m²)
		
		//입력
		double height = 180d;
		double weight = 80d;
		
		//계산
		//int m = cm / 100;
		//float m = cm / 100f;
		//double m = cm / 100d;
		double changeHeight = height / 100d;
		//double m = (double)cm / 100;
		double BMI = weight / ( changeHeight * changeHeight );
		
		
		//출력
		System.out.println(BMI);
		             
	}
}
