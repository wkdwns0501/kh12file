package com.kh.spring18.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//메타 프로그래밍
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SecureMemberDto {
	private String memberId, memberPw;
}
