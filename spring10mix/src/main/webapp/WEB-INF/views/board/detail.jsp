<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.boardNo}번 게시글</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>
				${dto.boardNo}번 게시글 
				(조회수 : ${dto.boardReadcount})
			</h1>
			
			<table border="1" width="500">
				<tr>
					<th width="25%">제목</th>
					<td>${dto.boardTitle}</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${dto.boardWriter}</td>
				</tr>
				<tr height="150">
					<th>내용</th>
					<td>${dto.boardContent}</td>
				</tr>
			</table>
			<a href="edit?boardNo=${dto.boardNo}">정보수정</a>
		</c:when>
		<c:otherwise>
			<h1>존재하지 않는 게시글입니다</h1>
			<img src="https://dummyimage.com/600x400/000/fff">
		</c:otherwise>
	</c:choose>
	<h2><a href="list">목록으로</a></h2>
	
</body>
</html>