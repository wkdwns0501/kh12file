<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<title>게시글 작성</title>

	<h2>게시글 작성</h2>
	
	<form action="write" method="post">
		제목 : <input type="text" name="boardTitle" required><br><br>
		내용 : <textarea name="boardContent" required></textarea><br><br>
		<button>글쓰기</button>
	</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>