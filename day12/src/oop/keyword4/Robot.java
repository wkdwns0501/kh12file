package oop.keyword4;

import java.util.Random;

public class Robot {
	//[1] 제곱 계산 기능
	public static int square(int n) {
		return n * n;
	}
	public static double square(double n) {
		return n * n;
	}
	//[2] 삼각형의 넓이를 구하는 메소드
	public static float triangle(int width, int height) {
		return (float)width * height / 2;
	}
	public static double triangle(double length, double height) {
		return length * height / 2d;
	}
	//[3] 원의 넓이를 구하는 메소드 (넓이 = 반지름 * 반지름 * 원주율
	public static float circle(int radius) {
//		return Robot.square(radius) * 3.14d;
		return square(radius) * 3.14f;
	}
	public static double circle(double radius) {
		return square(radius) * 3.14d;
	}
	//[4] 배열을 선택정렬하는 메소드
	public static void sort1(int[] data) {
		for (int k = 0 ; k < data.length-1 ; k++) {
			int min = k; //(*-1)번 위치의 값이 가장 작다고 생각
			for (int i = k+1 ; i < data.length ; i++) { //뒤에 있는 데이터와 비교하여
				if (data[min] > data[i]) {              //더 작은 값이 있다면
					min = i;									//교체!
				}
			}
			int temp = data[min];
			data[min] = data[k];
			data[k] = temp;
		}
	}
	
	//[5] 배열을 뒤집는 메소드 (reverse)
	public static void sort2(int[] data) {
		int left = 0;
		int right = data.length-1;
		
		for(int i=0; i < data.length/2; i++) {
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left++;
			right--;
		}
	}
	
	//[6] 배열을 무작위로 섞는 메소드 (shuffle)
	public static void sort3(int[] data) {
		Random r = new Random();
		for(int i=0; i < data.length; i++) {
			int index = r.nextInt(data.length);
			if(i == index) {//같은 자리가 나왔다면
				i--;
				continue;
			}
			int backup = data[i];
			data[i] = data[index];
			data[index] = backup;
		}
	}
	
	//[7] 배열을 출력하는 메소드
	public static void print(int[] data) {
		for(int i = 0 ; i <data.length ; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
