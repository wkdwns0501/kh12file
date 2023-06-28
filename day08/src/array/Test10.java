package array;

public class Test10 {
	public static void main(String[] args) {
		//5명의 키 데이터가 다음과 같을 때 가장 키가 작은 사람의 위치와 값을 출력
		//데이터 : 150.8, 180.2, 175.9, 162.7, 170.3
		
		double []height = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		int min = 0; //위치(Index)는 무조건 정수(int)이다 // long 은 안된다
		for(int i = 0 ; i < height.length ; i++) {
			if(height[min] > height[i]) {
				min = i;
			}
		}
		System.out.println("키가 가장 작은 사람의 위치 : " + min);
		System.out.println("키가 가장 작은 사람의 키 : " + height[min]);

	}
}