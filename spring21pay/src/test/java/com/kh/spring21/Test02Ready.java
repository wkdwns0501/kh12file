package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02Ready {
   
   @Test
   public void test() throws URISyntaxException {
      //변하는 정보화 중요한 정보들을 분리하여 모듈로 개발
	   
	   //결제시마다 변하는 정보 - 상품명, 상품가격, 주문번호, 구매자ID
	   String partnerOrderId = UUID.randomUUID().toString();
	   String partnerUserId = "testuser1";
	   String itemName = "슈퍼 울트라 노트북";
	   int itemPrice = 999990;
	   
      //전송 도구 생성
      RestTemplate template = new RestTemplate();
      
      //주소 설정
      URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
      
      //헤더 설정
      HttpHeaders headers = new HttpHeaders();
      headers.add("Authorization", "KakaoAK a9bceb76b6206c7db74490cf50f0b1d2");
      headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
      
      //바디 설정
      MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
      body.add("cid","TC0ONETIME");
      body.add("partner_order_id",partnerOrderId);//시리얼 랜덤번호 생성
      body.add("partner_user_id", partnerUserId);
      body.add("item_name", itemName);
      body.add("quantity","1");
      body.add("total_amount",String.valueOf(itemPrice));//100만원이 최대(개발자)
      body.add("tax_free_amount","0");//비과세
      body.add("approval_url","http://localhost:8080/pay/success");
      body.add("cancel_url","http://localhost:8080/pay/cancel");
      body.add("fail_url","http://localhost:8080/pay/fail");
      
      //요청 발송 (헤더와 바디를 합쳐 요청 객체를 만든다)
//      HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity(body,headers);//요청 객체
      HttpEntity entity = new HttpEntity(body,headers);//요청 객체
      
      Map response = template.postForObject(uri, entity, Map.class);
//      log.debug("response = {}", response);
      log.debug("url = {}", response.get("next_redirect_pc_url"));
      
      
   }

}