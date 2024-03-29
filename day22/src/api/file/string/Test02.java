package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//문자열 출력
		//= 문자열 출력은 필연적으로 인코딩이 필요
		//= Writer 계열의 클래스를 사용하여 처리
		
		File directory = new File("sample");
		directory.mkdirs();
		
//		File target = new File("sample/string.kh");
		File target = new File(directory, "string.kh");
//		FileOutputStream stream = new FileOutputStream(target);
		FileWriter fw = new FileWriter(target);
//		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//출력 //다차야 나간다
		bw.write("Hello");
		bw.write("\n");
		bw.write("안녕하세요"); 
		bw.write("\n");
		bw.write("자바가 다 끝났어요");
		
		//정리 (둘 중에 하나)
//		bw.flush();
		bw.close();
	}
}
