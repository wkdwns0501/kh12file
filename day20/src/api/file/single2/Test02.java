package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//byte를 뭉탱이로 읽는 예제
		//= 크기를 얼마로 할 것인가? 일단 5개씩 읽어봅시다
		
		//<예상 시나리오>
		//1회차 = 5/27
		//2회차 = 10/27
		//3회차 = 15/27
		//4회차 = 20/27
		//5회차 = 25/27
		//6회차 = 27/27
		
		//읽을 수 있는 배열 준비
		byte[] buffer = new byte[5];
		
		//파일과 스트림을 준비
		File target = new File("./sample/single2.kh");
		FileInputStream stream = new FileInputStream(target);
		
		//읽기
		int size = stream.read(buffer);//1회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//2회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//3회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//4회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//5회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//6회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
		
		size = stream.read(buffer);//7회차
		System.out.print(size);
		System.out.print("\t");
		System.out.println(Arrays.toString(buffer));
	}
}
