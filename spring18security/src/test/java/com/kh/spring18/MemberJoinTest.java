package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest //이걸적어야 autowired가능
public class MemberJoinTest {
	
	@Autowired
	private SecureMemberDao dao;
	
	@Test
	public void test() {
		dao.insert(SecureMemberDto.builder()
					.memberId("hello1234")
					.memberPw("password1234")
				.build());
	}
}
