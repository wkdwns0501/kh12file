<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세정보</title>
</head>
<body>
	
	<h1>상품 상세정보</h1>
	
	<table border="1" width="500">
		<tr>
			<th width="25%">상품번호</th>
			<td>${shirtDto.shirtNo}</td>
		</tr>
		<tr>
			<th>상품명</th>
			<td>${shirtDto.shirtName}</td>
		</tr>
		<tr>
			<th>색상</th>
			<td>${shirtDto.shirtColor}</td>
		</tr>
		<tr>
			<th>판매가</th>
			<td>${shirtDto.shirtPrice}원</td>
		</tr>
		<tr>
			<th>종류</th>
			<td>${shirtDto.shirtKind}</td>
		</tr>
		<tr>
			<th>유형</th>
			<td>${shirtDto.shirtType}</td>
		</tr>
		<tr>
			<th>재질(원단)</th>
			<td>${shirtDto.shirtMaterial}</td>
		</tr>
		<tr>
			<th>구매가능수량</th>
			<td>${shirtDto.shirtStock}개</td>
		</tr>
		<tr>
			<th>보유사이즈</th>
			<td>
				<c:forEach var="sizeDto" items="${sizeList}">
					${sizeDto.shirtSizeName}
				</c:forEach>
			</td>
		</tr>
	</table>
	
	<h2><a href="list">목록으로</a></h2>
	<h2><a href="add2">신규등록</a></h2>
	<h2><a href="edit2?shirtNo=${shirtDto.shirtNo}">정보변경</a></h2>
	<h2><a href="delete?shirtNo=${shirtDto.shirtNo}">상품삭제</a></h2>
	
</body>
</html>