package com.kh.spring21.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayApproveRequestVO;
import com.kh.spring21.vo.KakaoPayApproveResponseVO;
import com.kh.spring21.vo.KakaoPayDetailRequestVO;
import com.kh.spring21.vo.KakaoPayDetailResponseVO;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;

import lombok.extern.slf4j.Slf4j;
import request.KakaoPayReadyResponseVO;
@Slf4j
@Service
public class KakaoPayServiceImpl implements KakaoPayService{
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private HttpHeaders headers;

	@Override
	public KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO request) throws URISyntaxException {
		 //주소 설정
	     URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
	     
	   //바디 설정
	      MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
	      body.add("cid", kakaoPayProperties.getCid());
	      body.add("partner_order_id", request.getPartnerOrderId());//시리얼 랜덤번호 생성
	      body.add("partner_user_id", request.getPartnerUserId());
	      body.add("item_name", request.getItemName());
	      body.add("quantity","1");
	      body.add("total_amount",String.valueOf(request.getItemPrice()));//100만원이 최대(개발자)
	      body.add("tax_free_amount","0");//비과세
	      
	      String path = ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString();
	      
	      body.add("approval_url", path + "/success");
	      body.add("cancel_url",path + "/cancel");
	      body.add("fail_url",path + "/fail");
	      
	    //요청 발송 (헤더와 바디를 합쳐 요청 객체를 만든다)
	       HttpEntity entity = new HttpEntity(body,headers);
	       KakaoPayReadyResponseVO response = 
	     		  template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
	       
		return response;
	}
	
	@Override
	public KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", request.getTid());
		body.add("partner_order_id", request.getPartnerOrderId());
		body.add("partner_user_id", request.getPartnerUserId());
		body.add("pg_token", request.getPgToken());
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		KakaoPayApproveResponseVO response = 
				template.postForObject(uri, entity, KakaoPayApproveResponseVO.class);
		
		log.debug("결제 승인 완료 = {}", response.getTid());
		
		return response;
	}

	@Override
	public KakaoPayDetailResponseVO detail(KakaoPayDetailRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/order");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", "T53877f02b8b1abb0e72");
		
		HttpEntity entitiy = new HttpEntity(body, headers);
		KakaoPayDetailResponseVO response = template.postForObject(uri, entitiy, KakaoPayDetailResponseVO.class);
		return response;
	}
}
