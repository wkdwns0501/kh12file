package api.file;

import java.io.File;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String path = sc.next();
		sc.close();
		//분석을 하려면 파일 객체를 생성해야함
		File a = new File(path);
		
		if(a.isFile()) {
			System.out.println("파일명 : " + a.getName());
			//확장자는 파일의 마지막 . 뒤에 있는 값을 말하며 없을 수 있다
			//ex) abc.def.ghi 면 확장자는 .ghi이다 
			// 확장자가 없을수도 있다 (없다면 Index = -1)
			int index = a.getName().lastIndexOf(".");
			String extension;
			if(index == -1) {
				extension = "없음";
			}
			else {
				extension = a.getName().substring(index+1);
			}
			System.out.println("확장자 : " + extension);
			System.out.println("크기 : " + a.length() +"byte");
		}
		else if(a.isDirectory()) {
			File[] files = a.listFiles();
			for(File file : files) {
				System.out.print(file.getName());
				if(a.isFile()) { //파일이면
					System.out.println(" [폴더]");
				}
				else if(a.isDirectory()) { //그냥 else 해도 된다 //폴더면
					System.out.println(" [디렉터리]");
				}
			}
		}
		else { //if(a.exists() == false) //없다면
			System.out.println("존재하지 않는 파일 또는 폴더");
		}
	}
}
