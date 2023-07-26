package com.kh.spring03.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //애노테이션(Annotation) - 역할 정의
public class QuizController {
	Random r = new Random();
	
	@RequestMapping("/dice")
	public String dice() {
		int dice = r.nextInt(6) + 1;
		return "주사위 : " + dice;
		//의미없다 (사용자한테 안보임)
//		System.out.println("주사위 : " + dice);
	}
	
	@RequestMapping("/lotto")
	public String lotto() {
		int lotto = r.nextInt(45)+1;
		return "로또번호 : " + lotto;
	}
}
