<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>도서 목록</h1>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>도서명</th>
			<th>저자</th>
			<th>출판사</th>
		</tr>	
	</thead>
	<tbody align="center">
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.bookId}</td>
				<td align="left">
					<a href="detail?bookId=${dto.bookId}">${dto.bookTitle}</a>
				</td>
				<td>${dto.bookAuthor}</td>
				<td>${dto.bookPublisher}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>