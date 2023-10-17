package com.kh.spring18.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService{
	
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendCelebration(String email) throws MessagingException, IOException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, false, "UTF-8");
		helper.setTo(email);
		helper.setSubject("[KH정보교육원] 가입을 축하합니다!");
		
		ClassPathResource resource = new ClassPathResource("templates/celebration.html");
		File target = resource.getFile();
		Scanner sc = new Scanner(target);
		StringBuffer buffer = new StringBuffer();
		while(sc.hasNextLine()) {
			buffer.append(sc.nextLine());
		}
		sc.close();
		
		helper.setText(buffer.toString(), true);
		
		sender.send(message);
	}
}
