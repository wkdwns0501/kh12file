<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<!-- 
		입력내용 Dto 가서 확인하기 
		- 여러줄 입력창(textarea)으로 처리
	 -->
	<h1>게시글 등록</h1>
	<form action="http://localhost:8080/insert">
		제목 : <input name = "boardTitle"><br><br>
		내용 : <input name = "boardContent"><br><br>
<!-- 		작성자 : <input name = "boardWriter"><br><br> -->
		작성자 : <input name = "boardWriter"  rows="10" cols="100" ><br><br><textarea> <br><br></textarea>
		<button>글쓰기</button>
	
	</form>

</body>
</html>