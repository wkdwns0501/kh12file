<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>상품 목록</h1>

<h2><a href="add">상품등록</a></h2>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th width="40%">상품이름</th>
			<th>상품색상</th>
			<th>판매가격</th>
			<th>상품종류</th>
			<th>상품유형</th>
			<th>상품재질</th>
			<th>판매수량</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.shirtNo}</td>
				<td align="left">
					<a href="detail?shirtNo=${dto.shirtNo}">${dto.shirtName}</a>
				</td>
				<td>${dto.shirtColor}</td>	
				<td>${dto.shirtPrice}원</td>	
				<td>${dto.shirtKind}</td>	
				<td>${dto.shirtType}</td>	
				<td>${dto.shirtMaterial}</td>	
				<td>${dto.shirtStock}</td>	
			</tr>
		</c:forEach>
	</tbody>
	
</table>