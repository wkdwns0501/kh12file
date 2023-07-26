package com.kh.spring03.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//파라미터 관련 문제
	
	//(추가) 스프링은 역할을 명시하는 것을 선호한다
	//- @RequestParam을 변수 앞에 붙여 파라미터임을 표시
	@RequestMapping("/square")
	public String square(@RequestParam int num) {
		return "제곱 = " + Math.pow(num,2);
	}
//	@RequestMapping("/square")
//	public String square(int num) {
//		return "제곱 = " + num * num;
//	}
	
	//(추가) 연도가 주어지지 않으면 실행을 안할건가?
	//- 파라미터가 없어도 실행되어야 하는 상황 (ex : 기본값)
	//- 만약 birth가 제공되지 않는다면 성인요금을 부여
	//- @RequestParam 에 required = false옵션을 주면 없어도 됨
	//- @RequestParam 에 defaultValue르 설정하여 기본값을 지정(문자열)_
	@RequestMapping("/subway")
	public String subway(@RequestParam(required = false, defaultValue = "2000") int birth) {
		int currentYear = LocalDate.now().getYear();
		int age = currentYear - birth + 1;
		int price;
		if(age >= 65 || age < 8) 	price = 0;
		else if(age >= 20) 			price = 1250;
		else if(age >= 14) 			price = 720;
		else 								price = 450;
		return "지하철 요금 : " + price + "원"; 
	}
	
	@RequestMapping("/leap")
	public String leap(@RequestParam int year) {
		boolean c1 = year % 4 == 0;
		boolean c2 = year % 100 != 0;
		boolean c3 = year % 400 == 0;
		boolean leapYear = c3 || c1 && c2;
		if(leapYear) {
			return year + "년은 윤년입니다";
		}
		else {
			return year + "년은 윤년이 아닙니다";
		}
		
	}
	
	@RequestMapping("/circle")
	public String circle(@RequestParam int radius) {
		return "원넓이 : " + radius * radius * Math.PI;
	}
}
