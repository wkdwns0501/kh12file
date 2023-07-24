package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.MemberDto;

public class MemberMapper implements RowMapper<MemberDto>{

	@Override
	public MemberDto mapRow(ResultSet rs, int idx) throws SQLException {
		MemberDto dto = new MemberDto();
		dto.setMemberId(rs.getString("member_id"));
		dto.setMemberPw(rs.getString("member_pw"));
		dto.setMemberNickname(rs.getString("member_nickname"));
		dto.setMemberBirth(rs.getString("member_birth"));
		dto.setMemberEmail(rs.getString("member_email"));
		dto.setMemberContact(rs.getString("member_contact"));
		dto.setMemberLevel(rs.getString("member_level"));
		dto.setMemberPoint(rs.getInt("member_point"));
		dto.setMemberJoin(rs.getDate("member_join"));
		return dto;
	}

}
