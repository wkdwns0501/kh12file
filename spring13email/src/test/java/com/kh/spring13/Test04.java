package com.kh.spring13;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() throws MessagingException {
		//단문메일(SimpleMailMessage)가 아니라 마임메세지(MimeMessage) 전송
		
		//[1] 메세지 객체 생성 - sender에게 템플릿을 가져오도록 지시
		MimeMessage message = sender.createMimeMessage();
		
		//[2] 메세지 설정 도우미 객체 생성 -메일의 내용을 쉽게 설정하도록 만드는 도구
		MimeMessageHelper helper = new MimeMessageHelper(message, false, "UTF-8");
		
		//[3] 헬퍼에 정보 설정
		helper.setTo(new String[] {"britain0501@naver.com"});
		helper.setSubject("제목");
//		helper.setText("<h1>Hello</h1>", false);
//		helper.setText("<h1>Hello</h1>", true);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div>"); //style 추가도 가능하다
		buffer.append("<h1>제목 테스트</h1>");
		buffer.append("<p>내용 테스트</p>");
		buffer.append("</div>");
		helper.setText(buffer.toString(), true);
		
		//[4] 전송
		sender.send(message);
	}
}
