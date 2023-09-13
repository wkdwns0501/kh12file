package com.kh.spring12.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
	
	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
		log.info("name = {}", attach.getName()); //전송된이름(파일명x)
		log.info("origin = {}", attach.getOriginalFilename()); //파일명
		log.info("size = {}", attach.getSize()); //파일크기(byte)
		log.info("contentType = {}", attach.getContentType()); //파일유형
		
		//절대규칙 - 파일은 하드디스크에, 정보는 DB에!
		String home = System.getProperty("user.home");
		File dir = new File(home, "upload"); //저장할 디렉터리
		dir.mkdirs(); //디렉터리 생성
		
		File target = new File(dir, attach.getOriginalFilename()); //저장할 파일 (객체)
		attach.transferTo(target); //저장
		
		return "페이지정보";
	}
	
}
