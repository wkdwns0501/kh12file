package com.kh.springhome.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.springhome.interceptor.AdminInterceptor;
import com.kh.springhome.interceptor.BoardDefenderInterceptor;
import com.kh.springhome.interceptor.BoardOwnerInterceptor;
import com.kh.springhome.interceptor.MemberInterceptor;
import com.kh.springhome.interceptor.TestInterceptor;

/**
 	스프링에서 제공하는 설정파일
 	- application.properties에서 설정할 수 없는 내용들을 설정하는 파일
 	
 	만드는법 
 	1. 등록(@Configuation)
 	2. 필요 시 상속(WebmvcConfigurer)
 	3. 상황에 맞는 메소드 재정의 및 코드 작성
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private TestInterceptor testInterceptor;
	
	@Autowired
	private MemberInterceptor memberInterceptor;
	
	@Autowired
	private BoardOwnerInterceptor boardOwnerInterceptor;
	
	@Autowired
	private BoardDefenderInterceptor boardDefenderInterceptor;
	
	@Autowired
	private AdminInterceptor adminInterceptor;
	//인터셉터를 추가할 수 있는 설정 메소드(registry 저장소에 설정)
	//등록 시 주소의 패턴 설정 방법
	//- *이 한개면 동일한 엔드포인트 내에서만 적용 (/*)
	//- *이 두개면 하위 엔드포인트를 포함하여 적용	(/**)
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//[1] TestInterceptor를 모든 주소 처리과정에 간섭할 수 있도록 설정하겠다
		
		registry.addInterceptor(testInterceptor).addPathPatterns("/**");
		//registry.addInterceptor(인터셉터 객체).addPathPatterns(간섭하고 싶은 주소);
		
		//[2] MemberInterceptor를 회원 전용 페이지 처리과정에 간섭할 수 있도록 설정
		registry.addInterceptor(memberInterceptor)
					.addPathPatterns("/member/**",
												"/board/**", 
												"/rest/reply/**")
					.excludePathPatterns("/member/join"
													, "/member/joinFinish"
													, "/member/login"
													, "/member/find*"
													, "/member/exitFinish"
													, "/board/list"
													, "/board/detail"
													, "/rest/reply/list");
			//		.excludePathPatterns("/member/join*"
									//				, "/member/login"
									//				, "/member/exitFinish");
		
		//[3] 게시글 소유자 외의 접근을 차단하는 인터셉터 등록
		registry.addInterceptor(boardOwnerInterceptor)
					.addPathPatterns("/board/edit", "/board/delete");
		
		//[4] 게시글 조회수 중복방지 인터셉터 등록
		registry.addInterceptor(boardDefenderInterceptor)
					.addPathPatterns("/board/detail");
		
		//[5] 관리자용 인터셉터 등록
		registry.addInterceptor(adminInterceptor)
					.addPathPatterns("/admin/**", "/board/deleteByAdmin");
	}
}
