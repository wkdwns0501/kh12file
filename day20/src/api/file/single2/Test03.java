package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//기존에 만든 파일 복사 프로그램을 byte[]을 이용하여 처리하도록 변경
		//최적의 버퍼 크기를 찾아서 설정
		
		File readTarget = new File("D:/assign.txt");
		FileInputStream stream1 = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy2.txt");
		FileOutputStream stream2 = new FileOutputStream(writeTarget);
		
//		long count = 0L;
//		long total = readTarget.length();
//		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		byte[] buffer = new byte[4096];
		
		long start = System.currentTimeMillis();

		while(true) { 
			int size = stream1.read(buffer);
			if(size == -1) break;
			stream2.write(buffer);
			
//			count++;
//			double percent = count * 100d / total;
//			System.out.println(count + "/" + total + "("+fmt.format(percent)+"%)");
			
//			System.out.print(size);
//			System.out.print("\t");
//			System.out.println(Arrays.toString(buffer));
		}
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (end - start) + "(ms)");
		
		stream1.close();
		stream2.close();
	}
}
