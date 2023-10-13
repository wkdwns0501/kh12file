package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

@SpringBootTest
public class Test01_insert {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		CustomerDto dto = CustomerDto.builder()
				.customerId("testcusid944")
				.customerContact("010-1289-1884")
				.customerJoin("2002-08-19")
				.customerPurchase("2002-09-21")
				.customerMileage(2356)
				.customerLevel("VIP")
				.build();
		
		sqlSession.insert("customer.add", dto);
	}
}
