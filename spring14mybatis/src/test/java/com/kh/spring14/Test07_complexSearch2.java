package com.kh.spring14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07_complexSearch2 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
		//param 의 값들 주석에 따라 sql 구문이 모두 다르다 (2단계)
//		param.put("no", 28);
//		param.put("name", "이상");
//		param.put("type", "풀");
//		List<PocketmonDto> list = sqlSession.selectList("pocketmon.complex2", param);
		List<PocketmonDto> list = sqlSession.selectList("pocketmon.complex3", param);
		
		log.debug("결과 = {}", list.size());
		for(PocketmonDto pocketmonDto : list) {
			log.debug("pocketmonDto = {}", pocketmonDto);
		}
	}
}
