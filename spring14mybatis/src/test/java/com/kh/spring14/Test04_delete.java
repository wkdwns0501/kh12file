package com.kh.spring14;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04_delete {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int no =27;
		int count = sqlSession.delete("pocketmon.del", no);
		boolean result = count > 0;
		log.debug("result = {}" , result);
	}
}
