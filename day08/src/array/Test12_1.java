package array;

public class Test12_1 {
	public static void main(String[] args) {
		//30, 50, 20, 10, 40 이라는 데이터가 저장된 배열이 있을 때 
		//이 배열의 데이터 위치를 완전히 반대로 뒤집어보세요
		//뒤집은 다음 데이터를 출력
		//다섯 칸일 때만 통하는 방법
		
		int []data = new int[] {30,50,20,10,40};
		
		int backup1 = data[0];
		data[0] = data[4];
		data[4] = backup1;
		
		int backup2 = data[1];
		data[1] = data[3];
		data[3] = backup2;
		
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);
		}
	}
}