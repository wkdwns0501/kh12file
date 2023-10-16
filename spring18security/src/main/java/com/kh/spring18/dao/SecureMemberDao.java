package com.kh.spring18.dao;

import com.kh.spring18.dto.SecureMemberDto;

//추상화 구조 - 결합도를 낮추기 위해서
public interface SecureMemberDao {
	void insert(SecureMemberDto dto);
}
