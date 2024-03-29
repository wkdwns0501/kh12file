package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04Ready {
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
   
   @Test
   public void test() throws URISyntaxException {
      //변하는 정보화 중요한 정보들을 분리하여 모듈로 개발
	   
	   //결제 준비 요청 정보를 클래스로 모듈화 (KakaoPayReadyRequestVO)
	   KakaoPayReadyRequestVO request = KakaoPayReadyRequestVO.builder()
			   .partnerOrderId(UUID.randomUUID().toString())
			   .partnerUserId("testuser1")
			   .itemName("초코파이 1box")
			   .itemPrice(3500)
			   .build();
	   
      //전송 도구 생성
      RestTemplate template = new RestTemplate();
      
      
      //KakaoPayReadyResponseVO의 
      //@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)를
      //추가하면 이코드가 필요없다
//      //(+추가) SNAKE_CASE를 CAMEL_CASE로 처리하도록 추가 도구를 설정
//      ObjectMapper mapper = new ObjectMapper();
//      mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//      MappingJackson2HttpMessageConverter converter = 
//    		     new MappingJackson2HttpMessageConverter();
//      converter.setObjectMapper(mapper);
//      template.getMessageConverters().add(0, converter);
      
      //주소 설정
      URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
      
      //헤더 설정
      HttpHeaders headers = new HttpHeaders();
      headers.add("Authorization", "KakaoAK "+kakaoPayProperties.getKey());
      headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
      
      //바디 설정
      MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
      body.add("cid", kakaoPayProperties.getCid());
      body.add("partner_order_id", request.getPartnerOrderId());//시리얼 랜덤번호 생성
      body.add("partner_user_id", request.getPartnerUserId());
      body.add("item_name", request.getItemName());
      body.add("quantity","1");
      body.add("total_amount",String.valueOf(request.getItemPrice()));//100만원이 최대(개발자)
      body.add("tax_free_amount","0");//비과세
      body.add("approval_url","http://localhost:8080/pay/success");
      body.add("cancel_url","http://localhost:8080/pay/cancel");
      body.add("fail_url","http://localhost:8080/pay/fail");
      
      //요청 발송 (헤더와 바디를 합쳐 요청 객체를 만든다)
//   HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity(body,headers);//요청 객체
      HttpEntity entity = new HttpEntity(body,headers);//요청 객체
      
      //Map response = template.postForObject(uri, entity, Map.class);
      KakaoPayReadyResponseVO response = 
    		  template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
      log.debug("response = {}", response);
//      log.debug("url = {}", response.getNext_redirect_pc_url());
      log.debug("url = {}", response.getNextRedirectPcUrl());
      
    //다음 테스트를 위해 필요한 값을 출력
	log.debug("결제페이지 = {}", response.getNextRedirectPcUrl());
	log.debug("tid = {}", response.getTid());
	log.debug("partner_order_id = {}", request.getPartnerOrderId());
	log.debug("partner_user_id = {}", request.getPartnerUserId());
      
   }

}