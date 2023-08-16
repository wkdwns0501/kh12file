<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<title>게시글 상세정보</title>

		<h2>${boardDto.boardNo}번 게시글 </h2>
		<h4>조회수 : ${boardDto.boardReadcount} / 좋아요 : ${boardDto.boardLikecount} / 댓글수 : ${boardDto.boardReplycount}</h4>
		<table border="1"  width="500">
			<tr>
				<th width="25%">제목</th>
				<td>${boardDto.boardTitle}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${boardDto.boardWriterString}</td>
			</tr>
			<tr height="150">
				<th>내용</th>
				<td>${boardDto.boardContent}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><fmt:formatDate value="${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
			</tr>
			<tr>
				<th>최근 수정일</th>
				<td><fmt:formatDate value="${boardDto.boardUtime}" pattern="y년 M월 d일 E a h시 m분 s초"/></td>
			</tr>
		</table>
			<%-- 회원일 때만 글쓰기, 수정, 삭제가 나와야 한다 --%>
			<%--수정/삭제는 소유자일 경우만 나와야 한다 --%>
		<c:if test="${sessionScope.storage != null}">
			<button><a href="write">글쓰기</a></button>
			<button><a href="#">답글쓰기</a></button>
				<c:if test="${sessionScope.storage == boardDto.boardWriter}">
					<button><a href="edit?boardNo=${boardDto.boardNo}">수정하기</a></button>
					<button><a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></button>
				</c:if>
		</c:if>

	<button><a href="list">목록으로</a></button>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>