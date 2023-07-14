package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//Test01에서 저장한 파일 내용을 불러오도록 구현
		
		//준비물
		//1. 대상 파일 객체
		//2. 입력용 스트림
		
		File target = new File("sample", "single.kh");
		FileInputStream stream = new FileInputStream(target);
		
		//[프로그램] <--- [입력통로(stream)] <--- [파일객체(target)] <--- [실제파일]
		
		while(true) {
			int a = stream.read();
			if(a == -1) break; //EOF(End OF File) 처리
			System.out.println("a = " + a);
		}
		stream.close();
	}
}
