package com.kh.spring18.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.kh.spring18.dto.SecureMemberDto;

@Repository
public class SecureMemberDaoImpl implements SecureMemberDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public void insert(SecureMemberDto dto) { //이 dto 안에는 암호화 되지 않은 사용자가 입력한  아이디, 비밀번호가 있다
		//dto에 들어있는 비밀번호를 암호화 처리한 뒤 등록
		String origin = dto.getMemberPw();
		String encrypt = encoder.encode(origin);
		dto.setMemberPw(encrypt);
		
		sqlSession.insert("secureMember.join", dto);
	}
}
