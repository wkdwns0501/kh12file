package com.kh.spring10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.ShirtDto;

@SpringBootTest
public class ShirtInsertTest {
	
	@Autowired
	private ShirtDao dao;
	
	@Test
	public void test() {
		ShirtDto dto = new ShirtDto();
		dto.setShirtName("테스트셔츠");
		dto.setShirtColor("블랙");
		dto.setShirtPrice(10000);
		dto.setShirtKind("라운드");
		dto.setShirtType("민소매");
		dto.setShirtMaterial("린넨");
		dto.setShirtStock(100);
		
		int shirtNo = dao.sequence();
		dto.setShirtNo(shirtNo);
		
		dao.insert(dto);
	}
}
