package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06_delete {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int customerNo = 4;
		int count = sqlSession.delete("customer.del", customerNo);
		boolean result = count > 0;
		log.debug("result = {}", result);
		
	}
}
