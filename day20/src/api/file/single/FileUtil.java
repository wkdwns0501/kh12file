package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	//파일 복사 메소드
	public static void copy(File readTarget, File writeTarget) throws IOException {
		FileInputStream stream1 = new FileInputStream(readTarget);
		
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
