package array3;

public class Test03 {
	public static void main(String[] args) {
		//2차원 실수 배열 생성 및 출력 (+length) // 자기가 가지고 있는 직속 데이터만 관리
																   //내 밑에 차원이 몇개냐
//		float[][] data = new float[2][3]; //[줄수][칸수]
//		data[0][0] = 1.5f;
//		data[0][1] = 2.5f;
//		data[0][2] = 3.6f;
//		data[1][0] = 10.2f;
//		data[1][1] = 5.3f;
//		data[1][2] = 6.5f;
		float[][] data = new float[][] { //보통 이렇게 많이쓴다
				{1.5f, 2.5f, 3.6f},
				{10.2f, 5.3f, 6.5f}
		};
		
		System.out.println(data.length); // =2
		System.out.println(data[0].length); // =3
		System.out.println(data[0].length); // =3
		
		for (int k = 0 ; k < data.length ; k++) {
			for (int i = 0 ; i < data[k].length ; i++) {
				System.out.print(data[k][i] + "\t");
			}
			System.out.println();
		}
	}
}