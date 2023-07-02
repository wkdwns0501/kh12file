package array3;

import java.util.Random;

public class advance {
	public static void main(String[] args) {
		//5X5인경우 폭탄 검사?
//		[1][1] > [0][0] , [0][1] , [0][2] , [1][0] , [1][2] , [2][0] , [2][1] , [2][2]
//		[1][2] > [0][1] , [0][2] , [0][3] , [1][1] , [1][3] , [2][1] , [2][2] , [2][3]
//		[1][3] > [0][2] , [0][3] , [0][4] , [1][2] , [1][4] , [2][2] , [2][3] , [2][4]
//		[2][1] > [1][0] , [1][1] , [1][2] , [2][0] , [2][2] , [3][0] , [3][1] , [3][2]
//		[2][2] > [1][1] , [1][2] , [1][3] , [2][1] , [2][3] , [3][1] , [3][2] , [3][3]
//		[2][3] > [1][2] , [1][3] , [1][4] , [2][2] , [2][4] , [3][2] , [3][3] , [3][4]
//		[3][1] > [2][0] , [1][1] , [1][2] , [2][0] , [2][2] , [3][0] , [3][1] , [3][2]
//		[3][2] > [2][1] , [1][2] , [1][3] , [2][1] , [2][3] , [3][1] , [3][2] , [3][3]
//		[3][3] > [2][2] , [1][3] , [1][4] , [2][2] , [2][4] , [3][2] , [3][3] , [3][4]
		
		//입력
		int row = 9, col = 9;
		int bomb = 10;
		int[][] data = new int[row][col];
		
		Random r = new Random();
		
		for (int i = 0 ; i < bomb ; i++) {
			int x = r.nextInt(row);
			int y = r.nextInt(col);
			if(data[x][y] == 0) {
				data[x][y] = 9;
			}
			else {
				i--;
			}
		}
		
		for(int i = 0 ; i < row ; i++) {
			for(int k = 0 ; k <col ; k++) {
				if(data[i][k] == 9) continue;
				
				int xmin = i-1;
				int xmax = i+1;
				int ymin = k-1;
				int ymax = k+1;
				
				if(xmin<0) xmin = 0;
				if(xmax>row-1) xmax = row-1;
				if(ymin<0) ymin = 0;
				if(ymax>col-1) ymax = col-1;
				
				int count = 0;
				for(int p = xmin ; p <= xmax ; p++) {
					for(int q = ymin ; q <=ymax ; q++) {
						if(data[p][q] == 9) {
							count++;
						}
					}
				}
				data[i][k] = count;
			}
		}
		
		
		//출력
		for(int i = 0 ; i < row ; i++) {
			for(int k = 0 ; k < col ; k++) {
				if(data[i][k] == 0) System.out.print("　");
				else if(data[i][k] == 9) System.out.print("◈");
				else System.out.print(data[i][k]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
