<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>개인정보 변경</h2>

<c:if test="${param.error != null}">
	<h3>비밀번호가 일치하지 않습니다</h3>
</c:if>

<form action="updateInfo" method="post" autocomplete="off">
	변경 닉네임 <input type="text" name="memberNickname" value="${memberDto.memberNickname}" required><br><br>
	변경 이메일 <input type="email" name="memberEmail" value="${memberDto.memberEmail}" ><br><br>
	변경 연락처 <input type="tel" name="memberContact" value="${memberDto.memberContact}" ><br><br>
	변경 생년월일 <input type="date" name="memberBirth" value="${memberDto.memberBirth}" ><br><br>
	주소<br>
	<input type="text" name="memberPost" size="6" maxlength="6" placeholder="우편번호" value="${memberDto.memberPost}" ><br><br>
	<input type="text" name="memberAddr1" size="50"  placeholder="기본주소"  value="${memberDto.memberAddr1}" ><br><br>
	<input type="text" name="memberAddr2" size="50" placeholder="상세주소"  value="${memberDto.memberAddr2}" ><br><br>
	비밀번호 확인 <input type="password" name="memberPw" required><br><br>
	<button>회원정보 변경하기</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>