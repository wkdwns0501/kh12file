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
		
		//(운영체제가 거부하는 위치인경우)
		String home = System.getProperty("user.home");
//		File readTarget = new File( home,"origin.zip(나머지 경로)");
		File readTarget = new File("D:/assign.txt");
		FileInputStream stream1 = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy2.txt");
		FileOutputStream stream2 = new FileOutputStream(writeTarget);
		
		//[읽을파일] → readTarget → stream1 → 프로그램
		//				→ writeStearm → writeTarget → [내보낼파일]
		
//		long count = 0L; //옮긴 글자수
//		long total = readTarget.length(); //옮길 전체 글자수
//		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		byte[] buffer = new byte[4096]; //버퍼의 최대크기 int와 같다 (약 21억)
		//적당한 버퍼 크기는 1000 ~ 10000사이가 적정
		// -> 이진수로 변경하면 1024, 2048, 4096, 8192(자바표준) 가 적정
		long start = System.currentTimeMillis();

		while(true) { 
			int size = stream1.read(buffer);
			if(size == -1) break;
			stream2.write(buffer, 0, size);
			
//			count += size;
//			double percent = count * 100d / total;
//			System.out.println(count + "/" + total + "("+fmt.format(percent)+"%)");
			
//			System.out.print(size);
//			System.out.print("\t");
//			System.out.println(Arrays.toString(buffer));
		}
		
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("걸린 시간 : " + duration + "(ms)");
		
		stream1.close();
		stream2.close();
	}
}
