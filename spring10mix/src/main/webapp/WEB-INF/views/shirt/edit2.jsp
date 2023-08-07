<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 정보 수정</title>
</head>
<body>

	<h1>셔츠 정보 수정</h1>
		
		<form action="edit2" method="post">
			<input type="hidden" name="shirtNo" value="${shirtDto.shirtNo}">
			상품이름 : <input type="text" name="shirtName" value="${shirtDto.shirtName}" required><br><br>
			<!-- 
			option에 value를 주면 표시되는 값과 다르게 전송을 한다
		 -->
			상품색상 : <select name="shirtColor" required>
			<%--
				EL의 특징
				- 외따옴표, 쌍따옴표 모두 문자열로 취급
				- 문자열도 비교연산이 가능
			--%>
						<option value="" >---선택---</option>
						<c:choose>
				<c:when test="${shirtDto.shirtColor == '블랙'}">
					<option selected>블랙</option>
				</c:when>
				<c:otherwise>
					<option>블랙</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtColor == '화이트'}">
					<option selected>화이트</option>
				</c:when>
				<c:otherwise>
					<option>화이트</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtColor == '그레이'}">
					<option selected>그레이</option>
				</c:when>
				<c:otherwise>
					<option>그레이</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtColor == '레드'}">
					<option selected>레드</option>
				</c:when>
				<c:otherwise>
					<option>레드</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtColor == '블루'}">
					<option selected>블루</option>
				</c:when>
				<c:otherwise>
					<option>블루</option>
				</c:otherwise>
			</c:choose>
		</select>
		<br><br>
		판매가 <input type="number" name="shirtPrice" 
							value="${shirtDto.shirtPrice}" required><br><br>
		
		상품종류
		<select name="shirtKind" required>
			<option value="">---선택---</option>
			<option <c:if test="${shirtDto.shirtKind == '라운드'}">selected</c:if>>라운드</option>
			<option <c:if test="${shirtDto.shirtKind == '브이넥'}">selected</c:if>>브이넥</option>
			<option <c:if test="${shirtDto.shirtKind == '정장'}">selected</c:if>>정장</option>
		</select>	
		<br><br>
		상품유형
		<select name="shirtType" required>
			<option value="">---선택---</option>
			
			<c:choose>
				<c:when test="${shirtDto.shirtType == '민소매'}">
					<option selected>민소매</option>
				</c:when>
				<c:otherwise>
					<option>민소매</option>
				</c:otherwise>	
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtType == '반팔'}">
					<option selected>반팔</option>
				</c:when>
				<c:otherwise>
					<option>반팔</option>
				</c:otherwise>	
			</c:choose>
			
			<c:choose>
				<c:when test="${shirtDto.shirtType == '긴팔'}">
					<option selected>긴팔</option>
				</c:when>
				<c:otherwise>
					<option>긴팔</option>
				</c:otherwise>	
			</c:choose>
			
		</select>
		<br><br>
			상품재질 : <input type="text" name="shirtMaterial" value="${shirtDto.shirtMaterial}" required><br><br>
			판매수량 : <input type="number" name="shirtStock" value="${shirtDto.shirtStock}" required><br><br>
			
			<hr>
			
			<!-- 체크박스를 만들 때 체크 처리해야됨 -->
			
				<input type="checkbox" name="size" value="S"> S
				<input type="checkbox" name="size" value="M"> M
				<input type="checkbox" name="size" value="L"> L
				<input type="checkbox" name="size" value="XL"> XL
				<input type="checkbox" name="size" value="2XL"> 2XL
				<input type="checkbox" name="size" value="3XL"> 3XL
			
			<hr>
			<button>수정하기</button>
		</form>
		
		<h2><a href="list">목록으로</a></h2>
		<h2><a href="detail2?shirtNo=${shirtDto.shirtNo}">상세보기</a></h2>
		
</body>
</html>