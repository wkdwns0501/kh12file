<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.bookId}번 도서 상세 페이지</title>
</head>
<body>

	<!-- 
		리스트 태그
		- 외부에 <ul> 또는 <ol>을 사용
			-ul은 순서가 없는 리스트(unorder list)
			-ol은 순서가 있는 리스트(order list)
		- 내부 항목에 <li>를 사용(list item)
	 -->
	
	<c:choose>
		<c:when test="${dto != null}">
			<ul>
				<li>${dto.bookId}번 도서 상세 내용</li>
				<li>${dto.bookTitle}</li>
				<li>${dto.bookAuthor}</li>
				<li>${dto.bookPublicationDate}</li>
				<li>${dto.bookPrice}</li>
				<li>${dto.bookPublisher}</li>
				<li>${dto.bookPageCount}</li>
				<li>${dto.bookGenre}</li>
			</ul>
		</c:when>
		<c:otherwise>
			<h1>존재하지 않는 도서입니다</h1>
		</c:otherwise>	
	</c:choose>
	<%-- 	<c:if test="${not empty dto}"> --%>
	<c:if test="${dto != null}">
	<h2><a href="edit?bookId=${dto.bookId}">수정하기</a></h2>
	<h2><a href="delete?bookId=${dto.bookId}">삭제하기</a></h2>
	</c:if>
	
	<a href="list">목록보기</a>
	
</body>
</html>