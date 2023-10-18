package com.kh.spring16;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02_selectList {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		List<CustomerDto> list = sqlSession.selectList("customer.list");
		log.debug("개수 = {}", list.size());
		
		for(CustomerDto customerDto : list) {
			log.debug("customerDto = {}", customerDto);
		}
	}
}
