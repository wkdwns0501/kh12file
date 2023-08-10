package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String boardWriter, boardTitle, boardContent;
	private int boardReadcount, boardLikecount, boardReplycount;
	private Date boardCtime, boardUtime;
}
