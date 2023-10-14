package com.kh.spring17.vo;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVO {
	private String memberId;
	private String memberNickname;
	private String memberEmail;
	private String memberContact;
	private String memberBirthBegin, memberBirthEnd;
	private Integer memberPointMax, memberPointMin;
	private Date memberJoinBegin, memberJoinEnd;
	private List<String> memberLevelList;
	private List<String> orderList;
	private Integer begin;
	private Integer end;
}
