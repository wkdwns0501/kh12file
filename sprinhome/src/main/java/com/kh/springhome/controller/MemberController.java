package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.dao.MemberDao;

//회원 관련 기능을 처리하는 컨트롤러
@Controller
@RequestMapping("/member")
public class MemberController {
	//Autowired는 지정한 클래스 및 자식 클래스 중에서 등록된 것을 찾아 주입한다
	@Autowired
	private MemberDao memberDao;
}
