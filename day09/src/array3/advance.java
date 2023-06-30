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
		int size = 9;
		int[][] data = new int[size][size];
		
		Random r = new Random();
		
		int count = 0;
		for (int i = 1 ; i <=size * size ; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			if(data[x][y] == 0) {
				data[x][y] = size;
				count++;
				if(count >= 10) {
					break;
					}
				}
				else {
					i--;
				}
			}
		
		
		
		//출력
		for(int i = 0 ; i < data.length ; i++) {
			for(int k = 0 ; k< data[i].length ; k++) {
				System.out.print(data[i][k] + "\t");
			}
			System.out.println("\n");
		}
	}
}
