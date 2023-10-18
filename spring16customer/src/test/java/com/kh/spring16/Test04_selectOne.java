package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04_selectOne {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int customerNo = 4;
		CustomerDto customerDto = sqlSession.selectOne("customer.find", customerNo);
		log.debug("customerDto = {}", customerDto);
	}
}
