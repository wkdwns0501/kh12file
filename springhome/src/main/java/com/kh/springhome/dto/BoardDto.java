package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String boardWriter, boardTitle, boardContent;
	private int boardReadcount, boardLikecount, boardReplycount;
	private Date boardCtime, boardUtime;
	private int boardGroup, boardDepth;
	private Integer boardParent;
	
	//작성자 출력용 메소드 //탈퇴한 사용자 나타내기
	public String getBoardWriterString() {
		if(boardWriter == null) return "(탈퇴한 사용자)";
		return boardWriter;
	}
	
	//날짜에 따라 다른 값을 반환하는 메소드
	//작성일이 오늘이면 시간을 하루가 지나면 날짜가 나오게하기
	public String getBoardCtimeString() {
		LocalDate current = LocalDate.now();//현재날짜
		LocalDate ctime = boardCtime.toLocalDate();//작성일
		
		if(ctime.equals(current)) {//작성일이 오늘이면
			Timestamp stamp = new Timestamp(boardCtime.getTime());
			LocalDateTime time = stamp.toLocalDateTime();
			LocalTime result = time.toLocalTime();
			return result.format(DateTimeFormatter.ofPattern("HH:mm"));
		}
		else {
			return ctime.toString();
		}
	}
}
