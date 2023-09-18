package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {
	
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() {
		
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("wodms0419@naver.com"); //받는 사람
		message.setSubject("네"); //제목
		message.setText("해결해드렸습니다"); //내용
		
		//전송
		sender.send(message);
	}
}
