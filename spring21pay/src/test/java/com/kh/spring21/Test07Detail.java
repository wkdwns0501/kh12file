package com.kh.spring21;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07Detail {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private HttpHeaders headers;
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	@Test
	public void test() throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/order");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", "T53877f02b8b1abb0e72");
		
		HttpEntity entitiy = new HttpEntity(body, headers);
		Map response =template.postForObject(uri, entitiy, Map.class);
		log.debug("response = {}", response);
	}
}
