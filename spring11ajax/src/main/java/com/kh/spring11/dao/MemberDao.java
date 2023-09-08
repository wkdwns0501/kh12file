package com.kh.spring11.dao;

import com.kh.spring11.dto.MemberDto;

//메소드 명세만 작성(책으로치면 목차)
public interface MemberDao {
	MemberDto selectOne(String memberId);
	MemberDto selectOneByMemberNickname(String memberNickname);
}
