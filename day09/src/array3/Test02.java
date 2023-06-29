package array3;

public class Test02 {
	public static void main(String[] args) {
		//2차원 배열의 생성과 사용 //2차원은 1차원을 묶어논것이다
		
		int[][] score = new int[2][3]; //3개씩 2번 묶여있다
		//score ---> score[0] ---> [0][0][0]
		//			---> score[1] ---> [0][0][0]  //실제로는 가로 일자로 저장됨
		
		//초기화
		score[0][1] = 15;
		score[1][0] = 20;
		score[1][2] = 40;
		//출력
		//System.out.println(score); // 통합리모컨
		//System.out.println(score[0]); // 통합리모컨   // 의미없는 출력값이 나옴
		
		System.out.print(score[0][0] + "\t");
		System.out.print(score[0][1] + "\t");
		System.out.print(score[0][2] + "\t");
		System.out.println();
		//System.out.println(score[0][3]); //에러, 범위초과
		System.out.print(score[1][0] + "\t");
		System.out.print(score[1][1] + "\t");
		System.out.print(score[1][2] + "\t");
	}
}
