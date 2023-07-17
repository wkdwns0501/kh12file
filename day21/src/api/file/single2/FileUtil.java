package api.file.single2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	//파일&디렉터리 복사 메소드
	//- 파일일 경우는 버퍼를 이용하여 대량 복사를 진행한다 (배운대로)
	//- 디렉터리일 경우는 다음과 같은 절차를 거친다
	//		1. 대상 위치 안에 원본 디렉터리 이름과 같은 디렉터리를 생성
	//		2. 원본 디렉터리 안에 있는 파일/디렉터리를 1번에서 만든 위치로 복사
	public static void copy(File origin, File target) throws IOException {
		if(origin.isFile()) {
			//읽기 위한 스트림 생성 및 조합
			FileInputStream readStream = new FileInputStream(origin);
			BufferedInputStream readBuffer = new BufferedInputStream(readStream);
			
			//쓰기 위한 스트림 생성 및 조합
			FileOutputStream writeStream = new FileOutputStream(origin);
			BufferedOutputStream writeBuffer = new BufferedOutputStream(writeStream);
			
			//원래 반복문 부분이다    //2GB까지 밖에 못함
			byte[] data = readBuffer.readAllBytes();
			writeBuffer.write(data);
			
			//정리
			writeBuffer.close();
			readBuffer.close();
		}
		else if(origin.isDirectory()) {
			//target이 없으면 생성
			if(!target.exists()) {
				target.mkdirs(); //D:/test
			}
			
			//같은 이름으로 target 아래에 생성
			File dir = new File(target, origin.getName());
			dir.mkdirs();
			
			//origin의 내용물을 dir 내부에 복사
			File[] list = origin.listFiles();
			for(File file : list) {
				//파일이면 대상폴더에 같은 이름으로 복사
				if(file.isFile()) {
					copy(file, new File(dir, file.getName())); //재귀호출
				}
				//디렉터리면 대상 폴더에 하위이름으로 생성
				else if (file.isDirectory()) {
					copy(file,dir); //재귀호출
				}
			}
		}
	}
	
	//파일&디렉터리 삭제 메소드
	//- 파일일 경우는 그냥 삭제하면 된다
	//- 디렉터리일 경우는 내부에 있는 모든 요소를 삭제한 뒤 삭제해야 한다
	// 		- 내부에 있는 요소는 파일인지 디렉터리 인지 알 수 없다
	//		- 다시 검사해서 삭제하도록 요청해야 한다 (재귀, recursive)
	public static void delete(File target) {
		if(target.isFile()){
			target.delete();
		}
		else if(target.isDirectory()) {
			File[] list = target.listFiles();
			for(File file : list) {
				delete(file); //재귀 호출 (같은 기능을 재호출)
			}
			target.delete();
		}
	}
}
