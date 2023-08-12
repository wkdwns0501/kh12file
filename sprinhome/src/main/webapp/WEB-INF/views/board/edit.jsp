<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<title>게시글 정보 수정</title>

	<h2>게시글 정보 수정</h2>
	<form action="edit"  method="post">
		<input type="hidden" name="boardNo" value="${boardDto.boardNo}">
		제목 : <input type="text" name ="boardTitle" value="${boardDto.boardTitle}"><br><br>
		내용 : <textarea name="boardContent">${boardDto.boardContent}</textarea><br><br>
		<button>수정하기</button>
	</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>