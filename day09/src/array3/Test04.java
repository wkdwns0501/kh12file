package array3;

public class Test04 {
	public static void main(String[] args) {
		
//		String[][] data = new String[2][3];
//		
//		data[0][0] = "자바";
//		data[0][1] = "스프링";
//		data[0][2] = "안드로이드";
//		data[1][0] = "파이썬";
//		data[1][1] = "판다스";
//		data[1][2] = "장고";
		
		String[][] data = new String[][] { //보통 이렇게 많이쓴다
			{"자바", "스프링", "안드로이드"},
			{"파이썬", "판다스", "장고"}
		};
		
		for (int i = 0 ; i < data.length ; i++) {
			for (int k = 0 ; k < data[i].length ; k++) {
				System.out.print(data[i][k] + " ");
			}
			System.out.println();
		}
	}
}