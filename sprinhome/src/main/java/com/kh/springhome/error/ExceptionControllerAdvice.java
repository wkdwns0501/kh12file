package com.kh.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 컨트롤러를 간섭하여 예외 상황을 다르게 처리하도록 하는 객체
 * - 등록 시 @ControllerAdvice 라고 등록
 * - @RestController를 간섭할 경우는 @RestControllerAdvice를 사용
 * - 적용 대상을 옵션으로 지정
 */
//@ControllerAdvice(basePackages = {"com.kh.springhome.controller"})
@ControllerAdvice(annotations = {Controller.class})//대상명시(등록)//try 구문
//ControllerAdvice의 주석처리로 ON/OFF가 가능하다
public class ExceptionControllerAdvice {
	/**
	 * 예외는 @ExceptionHandler 메소드로 처리 가능
	 * - 처리할 예외의 종류 지정 가능
	 * - 메소드의 형태는 컨트롤러와 같음
	 * - try 구문의 catch 블록과 같은 역할 수행
	 * - 이 메소드에는ㄴ 컨트롤러처럼 매개변수를 선언하면 사용할 수 있다
	 * 		- Model, HttpSession 등 기본적인 컨트롤러의 도구 사용 가능
	 * 		- catch 처럼 예외 처리 객체를 선언할 수 있다
	 */
	//catch 구문
	@ExceptionHandler(Exception.class) //Exception 오류가 발생하면 여기로 불러옴
	public String error(Exception e) {
		e.printStackTrace(); //catch 구문에 있던 것 //콘솔에 찍힘
		return "/WEB-INF/views/error/500.jsp"; //500 - 실행오류 //사용자 화면에 찍힘
	}
	
	/**
	 * 내가 지정한 예외들을 처리하도록 추가 핸들러(처리기) 설정
	 */
	@ExceptionHandler(NoTargetException.class)
	public String noTarget(NoTargetException e) { //Exception e도 가능
//		e.printStackTrace();
		return "/WEB-INF/views/error/noTarget.jsp";
	}
	
	@ExceptionHandler(AuthorityException.class)
	public String authority(AuthorityException e) {
		e.printStackTrace();
		return "/WEB-INF/views/error/authority.jsp";
	}
	
	
	
	
	
	
}
