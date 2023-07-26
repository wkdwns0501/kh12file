package com.kh.spring03.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	
	@RequestMapping("/lotto-list")
	public List<Integer> lottoList() {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i <= 45;i ++) {
			list.add(i);
		}
		Collections.shuffle(list);
		List<Integer> lotto = list.subList(0, 6);
		Collections.sort(lotto);
		return lotto;
	}
}
