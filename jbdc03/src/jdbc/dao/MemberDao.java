package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {
	public void insert(MemberDto dto) {
		String sql = "insert into member(member_id, member_pw, "
				+ "member_nickname, member_birth, member_email, "
				+ "member_contact) values(?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getMemberId(), dto.getMemberPw(), dto.getMemberNickname()
				, dto.getMemberBirth(), dto.getMemberEmail(), dto.getMemberContact()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	//비밀번호 변경 기능
	//1. 기존비밀번호와 신규비밀번호를 입력받아 검사 후 변경
	//2. 임시비밀번호 변경하는 기능
	//3. 아이디에 맞는 계정의 비밀번호를 변경하는 기능
	
//	public boolean updateMemberPassword(MemberDto dto, String newPw) {//1
//	public boolean updateMemberPassword(String memberId) { //2
//	public boolean updateMemberPassword(String memberId, String memberPw) {//3
	public boolean updateMemberPassword(MemberDto dto) {//3
		String sql = "update member set member_pw=? where member_id=?";
		Object[] data = {dto.getMemberPw(), dto.getMemberId()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set member_nickname=?, "
				+ "member_contact=?, member_email=?, member_birth=? "
				+ "where member_id=?";
		Object[] data = {dto.getMemberNickname(), dto.getMemberContact(), 
				dto.getMemberEmail(), dto.getMemberBirth(), dto.getMemberId()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
}
