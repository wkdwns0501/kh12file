<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<form action="findPw" method="post">
	<div class="container w-400">
		<div class="row mv-30">
			<h1>비밀번호 찾기</h1>
		</div>
	
		<div class="row">
			<input type="text" name="memberId" placeholder="아이디"
				class="form-input w-100" required>
		</div>
		<div class="row">
			<input type="email" name="memberEmail" placeholder="이메일"
				class="form-input w-100" required>
		</div>
		<div class="row mv-30"> 
			<button type="submit" class="btn btn-positive w-100"
			style="border-color: #85E6C5;  background-color: #85E6C5;">
				<i class="fa-solid fa-magnifying-glass"></i>
				비밀번호 찾기
			</button>
		</div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>