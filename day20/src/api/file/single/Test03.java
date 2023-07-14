package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		
		//준비물 : 입력용 파일 + 스트림, 출력용 파일 + 스트림
		File readTarget = new File("D:/origin.txt");//절대경로(absolute path)
		FileInputStream stream1 = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy.txt");//상대경로(relative path)
		FileOutputStream stream2 = new FileOutputStream(writeTarget);
		
		while(true) { //순서가 중요하다 //순서가 이상하면 파일크기가 계속 커진다
			int a = stream1.read();
			if(a == -1) break;
			stream2.write(a);
		}
		
		stream1.close();
		stream2.close();
	}
}
