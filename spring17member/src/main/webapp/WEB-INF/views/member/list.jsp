<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form>
	<div>아이디<input type="text" name="memberId" value="${vo.memberId}"></div>
	<div>닉네임<input type="text" name="memberNickname" value="${vo.memberNickname}"></div>
	<div>연락처<input type="text" name="memberContact" value="${vo.memberContact}"></div>
	<div>이메일<input type="text" name="memberEmail" value="${vo.memberEmail}"></div>
	<div>
		생년월일
		<input type="date" name="memberBirthBegin" value="${vo.memberBirthBegin}">
		~
		<input type="date" name="memberBirthEnd" value="${vo.memberBirthEnd}">
	</div>
	<div>
		포인트
		<input type="number" name="memberPointMin" value="${vo.memberPointMin}">이상
		<input type="number" name="memberPointMax" value="${vo.memberPointMax}">이하
	</div>
	<div>
		등급
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('일반')} ">
				<input type="checkbox" name="memberLevelList" value="일반" checked> 일반			
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="일반"> 일반		
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('VIP')} ">
				<input type="checkbox" name="memberLevelList" value="VIP" checked>VIP		
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="VIP">VIP		
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.memberLevelList.contains('관리자')} ">
				<input type="checkbox" name="memberLevelList" value="관리자" checked>관리자		
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="memberLevelList" value="관리자">관리자		
			</c:otherwise>
		</c:choose>
	</div>
	<div>
		<input type="number" name="begin" value="${vo.begin}">번
		~
		<input type="number" name="end" value="${vo.end}">번
	</div>
	
	<div>
		1차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="member_birth asc">생년월일 오름차순</option>
			<option value="member_birth desc">생년월일 내림차순</option>
			<option value="member_point asc">낮은 포인트순</option>
			<option value="member_point desc">높은 포인트순</option>
			<option value="member_join desc">최근에 가입한순</option>
			<option value="member_join desc">오래전 가입한순</option>
		</select>
	</div>
	<div>
		2차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="member_birth asc">생년월일 오름차순</option>
			<option value="member_birth desc">생년월일 내림차순</option>
			<option value="member_point asc">낮은 포인트순</option>
			<option value="member_point desc">높은 포인트순</option>
			<option value="member_join desc">최근에 가입한순</option>
			<option value="member_join desc">오래전 가입한순</option>
		</select>
	</div>
	
	<button type="submit">검색</button>
</form>



<hr>

<table border="1">
	<thead>
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>연락처</th>
			<th>생년월일</th>
			<th width="200">주소</th>
			<th>등급</th>
			<th>포인트</th>
			<th>회원가입일</th>
			<th>마지막접속일</th>
			<th>비밀번호변경일</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="memberDto" items="${list}">
		<tr>
			<td>${memberDto.memberId}</td>
			<td>${memberDto.memberNickname}</td>
			<td>${memberDto.memberEmail}</td>
			<td>${memberDto.memberContact}</td>
			<td>${memberDto.memberBirth}</td>
			<td>(${memberDto.memberPost}) ${memberDto.memberAddr1} ${memberDto.memberAddr2}</td>
			<td>${memberDto.memberLevel}</td>
			<td>${memberDto.memberPoint}</td>
			<td>${memberDto.memberJoin}</td>
			<td>${memberDto.memberLogin}</td>
			<td>${memberDto.memberChange}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>