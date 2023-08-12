<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<title>게시판 목록</title>

<h2>게시판 목록</h2>

<button><a href="write">글쓰기</a></button>

<table border="1">
	<thead>
		<tr>
			<th>글번호</th>
			<th width="40%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>수정일</th>
			<th>조회수</th>
			<th>좋아요</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
			<tr>
				<td>${boardDto.boardNo}</td>
				<td align="left">
					<a href="detail?boardNo=${boardDto.boardNo}">${boardDto.boardTitle} [${boardDto.boardReplycount}]</a>
				</td>
				<td>${boardDto.boardWriter}</td>
				<td>${boardDto.boardCtime}</td>
				<td>${boardDto.boardUtime}</td>
				<td>${boardDto.boardReadcount}</td>
				<td>${boardDto.boardLikecount}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>