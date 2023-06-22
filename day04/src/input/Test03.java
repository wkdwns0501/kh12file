package input;

import java.util.Scanner; // Ctrl + shift + O - 단축키

public class Test03 {
	public static void main(String[] args) {
		//사용자에게 다음 정보를 입력받아 총점(tot)과 평균(avg)을 구하여 출력
		//국어 점수(kor), 영어 점수(eng), 수학 점수(mat)
		
		Scanner sc = new Scanner(System.in); //시작부분에 작성 // 어렵다면 원래하던것처럼 만들고 거꾸로 돌아가라
		
		//System.out.println("국어, 영어, 수학점수를 순서대로 작성하세요"); 
		//System.out.println("국어 점수를 입력하세요");
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		//System.out.println("영어 점수를 입력하세요");
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		//System.out.println("수학 점수를 입력하세요");
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		sc.close();
		
		int tot = kor + eng + mat;
		//float avg = tot / 3f;
		float avg = (float)tot / 3;
		
		System.out.println("\n총점 : " + tot + "\n평균 : " + avg);
	}
}
