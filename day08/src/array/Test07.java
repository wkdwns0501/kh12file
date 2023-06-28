package array;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		for(int i = 0 ; i < score.length ; i++ ) {
			System.out.print("시험 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		sc.close();
		//1. 통과하지 못한 학생의 점수만 출력
		System.out.println("재평가자 점수는 다음과 같습니다");
		for(int i = 0 ; i < score.length ; i++ ) {
			if(score[i] < 60) {
				System.out.println("통과하지 못한 학생의 점수 : " + score[i]);
			}
		}
		//2. 우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
		System.out.println("우수한 성적으로 통과한 학생의 점수는 다음과 같습니다");
		for(int i = 0 ; i < score.length ; i++ ) {
			if (score[i] >= 90) {
				System.out.println("우수한 성적으로 통과한 학생의 점수 : " + score[i]);
			}
		}
		//3. 만약 75점인 학생이 전학을 왔다면 몇 등인지 구해서 출력
		int addscore = 75;
		int count = 0;            //int rank=1; 해서 
		for (int i = 0 ; i <score.length ; i++) {
			if (score[i] > addscore) {
				count++;         //rank++;
			}
		}
		int rank = count + 1; //이걸 안해도된다
		System.out.println("전학온 학생의 등수 : " + rank + "등"); 
	}
}
