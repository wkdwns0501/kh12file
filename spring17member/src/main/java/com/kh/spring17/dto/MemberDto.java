package com.kh.spring17.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String memberEmail;
	private String memberContact;
	private String memberBirth;
	private String memberPost;
	private String memberAddr1;
	private String memberAddr2;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin;
	private Date memberLogin;
	private Date memberChange;
}
