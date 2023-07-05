package oop.inherit4;

public class File {	//1KB = 1024B, 1Mb = , 
	
	private String fileName;
	private long fileSize;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		if(fileSize < 0L) return;
		this.fileSize = fileSize;
	}
	
	public void execute() {
		System.out.println("실행");
	}
}
