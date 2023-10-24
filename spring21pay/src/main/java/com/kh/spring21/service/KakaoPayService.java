package com.kh.spring21.service;

import java.net.URISyntaxException;

import com.kh.spring21.vo.KakaoPayReadyRequestVO;

import request.KakaoPayReadyResponseVO;

public interface KakaoPayService {
	KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO request) throws URISyntaxException;
}
