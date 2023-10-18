package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05_update {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int count = sqlSession.update("customer.edit",CustomerDto.builder()
				.customerId("testcusid124")
				.customerContact("010-1234-1235")
				.customerJoin("2002-05-19")
				.customerPurchase("2002-06-21")
				.customerMileage(1234)
				.customerLevel("VIP")
				.customerNo(5)
				.build());
		
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
