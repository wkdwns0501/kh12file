<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<title>게시글 상세정보</title>

<c:choose>
	<c:when test="${boardDto != null}">
		<h2>${boardDto.boardNo}번 게시글 </h2>
		<h3>조회수 : ${boardDto.boardReadcount}  좋아요 : ${boardDto.boardLikecount}  댓글수 : ${boardDto.boardReplycount}</h3>
		<table border="1"  width="500">
			<tr>
				<th width="25%">제목</th>
				<td>${boardDto.boardTitle}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${boardDto.boardWriter}</td>
			</tr>
			<tr height="150">
				<th>내용</th>
				<td>${boardDto.boardContent}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${boardDto.boardCtime}</td>
			</tr>
			<tr>
				<th>수정일</th>
				<td>${boardDto.boardUtime}</td>
			</tr>
		</table>
		<c:if test="${sessionScope.storage == boardDto.boardWriter}">
			<button><a href="edit?boardNo=${boardDto.boardNo}">수정하기</a></button>
			<button><a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></button>
		</c:if>
	</c:when>
	<c:otherwise>
		<h2>존재하지 않는 게시글입니다</h2>
		<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Red_X.svg/2048px-Red_X.svg.png">
	</c:otherwise>
</c:choose>

	<button><a href="list">목록으로</a></button>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>