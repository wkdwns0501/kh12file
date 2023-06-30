package array3;

import java.util.Random;

public class advance_answer {
	public static void main(String[] args) {
		//입력
		int row = 5, col = 5;
		int bomb = 10;
		
		//계산
		int[][] map = new int[row][col];
		
		Random r = new Random();
		
		//폭탄 배치
		for(int i=0; i < bomb; i++) {
			int x = r.nextInt(row);
			int y = r.nextInt(col);
			if(map[x][y] == 0) {
				map[x][y] = 9;
			}
			else {
				i--;
			}
		}
	
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {//전체 칸을 반복하며
				if(map[i][k] == 9) continue;//폭탄이면 패스
				
				//탐색 범위 설정(왼쪽상단 - 오른쪽하단 위치)
				int xmin = i-1;
				int xmax = i+1;
				int ymin = k-1;
				int ymax = k+1;
				
				//모서리일 경우 추가 계산
				if(xmin < 0) xmin = 0;
				if(xmax > row-1) xmax = row-1;
				if(ymin < 0) ymin = 0;
				if(ymax > col-1) ymax = col-1;
				
				//확인용 멘트
				//System.out.println("("+i+", "+k+") 위치 검사중");
				//System.out.println("--> 범위 : ("+xmin+", "+ymin+") 부터 ("+xmax+", "+ymax+") 까지");
				
				//미리 지정한 범위에서 폭탄 찾기
				int count = 0;
				for(int p = xmin; p <= xmax; p++) {
					for(int q = ymin; q <= ymax; q++) {
						if(map[p][q] == 9) {//폭탄을 발견하면
							count++;
						}
					}
				}
				map[i][k] = count;//개수를 설정
			}
		}
		
		//지도 출력
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				switch(map[i][k]) {
				case 0: System.out.print("　"); break;
				case 9: System.out.print("◈"); break;
				default: System.out.print(map[i][k]); break;
				}
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}