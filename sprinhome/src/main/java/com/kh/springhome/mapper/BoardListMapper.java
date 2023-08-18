package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardListDto;

@Component
public class BoardListMapper implements RowMapper<BoardListDto>{

	@Override
	public BoardListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardListDto boardListDto = new BoardListDto();
		boardListDto.setBoardNo(rs.getInt("board_no"));
		boardListDto.setBoardWriter(rs.getString("board_writer"));
		boardListDto.setBoardTitle(rs.getString("board_title"));
//		boardListDto.setBoardContent(rs.getString("board_content")); //헷갈리니까 써주는게 좋다
		boardListDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardListDto.setBoardLikecount(rs.getInt("board_likecount"));
		boardListDto.setBoardReplycount(rs.getInt("board_replycount"));
		boardListDto.setBoardCtime(rs.getDate("board_ctime"));
		boardListDto.setBoardUtime(rs.getDate("board_utime"));
		boardListDto.setMemberNickname(rs.getString("member_nickname"));
		
		boardListDto.setBoardGroup(rs.getInt("board_group"));
		boardListDto.setBoardDepth(rs.getInt("board_depth"));
		//[1] int 그대로 꺼낸다(null이 0으로 바뀌어 조회됨)
		//boardListDto.setBoardParent(rs.getInt("board_parent"));
		//[2] Integer 형태로 꺼낸다 (null이 그대로 조회됨)
		boardListDto.setBoardParent(rs.getObject("board_parent", Integer.class));
		return boardListDto;
	}

}
