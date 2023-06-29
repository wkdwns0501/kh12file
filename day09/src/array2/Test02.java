package array2;

public class Test02 {
	public static void main(String[] args) {
		//버블 정렬 (Bubble sort)
		//- 인접한 두 항목으 비교하여 교체하며 정렬하는 방식
		//- 큰 데이터가 좌측에 있으면 교체, 아니면 통과
		
		int[] data = new int[] {30, 50, 20, 10 ,40};
		
		//버블 정렬 - 1회차 (인접한 두 개의 항목을 비교하여 큰 값을 우측으로 이동)
		//[0] vs [1] / [1] vs [2] / [2] vs [3] / [3] vs [4]
		for (int k = data.length-2  ; k >= 0 ; k-- ) {
			for (int i = 0 ; i <= k ; i++) {
				if(data[i] > data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
		}
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}