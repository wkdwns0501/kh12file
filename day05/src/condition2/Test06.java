package condition2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//BMI 계산기 개조
		//사용자에게 신장과 체중을 입력받아 BMI 수치를 계산하고 다음 기준에 따라 비만도 판정까지 수행하도록 구현하세요
		//(BMI 계산 공식은 이전 문제를 참조하세요) //BMI = 체중(kg) /  (키²(m²))
		Scanner sc = new Scanner(System.in);
		System.out.print("신장(cm) : ");
		float height = sc.nextFloat();
		System.out.print("체중(Kg) : ");
		float weight = sc.nextFloat();
		sc.close();
		
		float cHeight = height/100;
		float BMI = weight / (cHeight * cHeight);
		//float BMI = weight / cHeight / cHeight;
		String result;
		if (BMI < 18.5f) {
			result = "저제충";
		}
		else if (BMI < 23f) {
			result = "정상";
		}
		else if (BMI < 25f) {
			result = "과체중";
		}
		else if (BMI < 30f) {
			result = "경도 비만";
		}
		else {
			result = "중등도 비만";
		}
		System.out.println("BMI : " + BMI);
		System.out.println("판정 결과 : " + result);
	}
}
