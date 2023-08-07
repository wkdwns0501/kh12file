<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirtNo}번 셔츠정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>
				${dto.shirtNo}번 셔츠정보
			</h1>
			
			<table border="1" width="350">
				<tr>
					<th width="30%">상품이름</th>
					<td>${dto.shirtName}</td>
				</tr>
				<tr>
					<th>상품색상</th>
					<td>${dto.shirtColor}</td>
				</tr>
				<tr>
					<th>판매가격</th>
					<td>${dto.shirtPrice}원</td>
				</tr>
				<tr>
					<th>상품종류</th>
					<td>${dto.shirtKind}</td>
				</tr>
				<tr>
					<th>상품유형</th>
					<td>${dto.shirtType}</td>
				</tr>
				<tr>
					<th>상품재질</th>
					<td>${dto.shirtMaterial}</td>
				</tr>
				<tr>
					<th>판매수량</th>
					<td>${dto.shirtStock}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1>존재하지 않는 상품입니다</h1>
		</c:otherwise>
	</c:choose>
		<h2><a href="edit?shirtNo=${dto.shirtNo}">수정하기</a></h2>
		<h2><a href="delete?shirtNo=${dto.shirtNo}">삭제하기</a></h2>
		<h2><a href="add">등록하기</a></h2>
		<h2><a href="list">목록으로</a></h2>
</body>
</html>