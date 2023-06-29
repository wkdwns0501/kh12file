package array3;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		//빙고판 만들기
		//- 빙고판은 5x5 사이즈가 기본입니다.
		//- 빙고판은 정사각형이며 홀수 크기만 가능합니다
		//- 빙고판에는 숫자가 1부터 랜덤한 위치에 배치됩니다
		//- 한칸에는 한번의 숫자만 배치 가능합니다
		//- 빙고판을 제작한뒤 출력하세요
		//- 크기도 변경 가능하도록 업그레이드 하세요
		//= 랜덤한 위치에 1부터 숫자를 배치하는 형태
		
		Random r = new Random();
		
		//배열 생성
		int size = 5;
		
		int[][] bingo = new int[size][size];
		//
		for(int i = 1 ; i <= size * size ; i++) {
				int x = r.nextInt(size);
				int y = r.nextInt(size);
				if(bingo[x][y] == 0) { //처음 넣는 자리라면
					bingo[x][y] = i;
				}
				else {
					i--;
				}
		}
		
		//출력
		for(int i = 0 ; i < bingo.length ; i++) { // 크기가 정해져 있다면 bingo.length 를 size로 바꿔도 된다
			for(int k = 0 ; k <bingo[i].length ; k++) {  // 크기가 정해져 있다면 bingo[i].length 를 size로 바꿔도 된다
				
				System.out.print(bingo[i][k] + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
