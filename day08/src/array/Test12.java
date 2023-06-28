package array;

public class Test12 {
	public static void main(String[] args) {
		//30, 50, 20, 10, 40 이라는 데이터가 저장된 배열이 있을 때 
		//이 배열의 데이터 위치를 완전히 반대로 뒤집어보세요
		//뒤집은 다음 데이터를 출력
		//몇칸이든 통하는 방법
		//= 바꾸는 횟수는 데이터 개수의 절반과 같다
		int []data = new int[] {30,50,20,10,40};
		
		for(int i = 0 ; i <data.length/2 ; i++) { //왼쪽 위치 + 오른쪽 위치 = n-1
			int left = i;//왼쪽 위치							// 오른쪽 위치 = n - 1 - 왼쪽 위치
			int right = data.length-1-left;//오른쪽 위치
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
		}
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);
		}
	}
}