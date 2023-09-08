package com.kh.springhome.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;

@CrossOrigin // 같은 프로젝트라 필요없다
@RestController
@RequestMapping("/rest/member")
public class MemberRestController {
	
	@Autowired
	private MemberDao memberDao;
	
	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto == null) {//아이디가 없으면
			return "Y";
		}
		else {	//아이디가 있으면
			return "N";
		}
	}
	
	@PostMapping("/nicknameCheck")
	public String nickCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = 
				memberDao.selectOneByMemberNickname(memberNickname);
		if(memberDto == null) {
			return "Y";
		}
		else {	
			return "N";
		}
	}

}
