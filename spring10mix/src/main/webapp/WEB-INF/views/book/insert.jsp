<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>

	<h1>도서 등록</h1>
	
	<form action="insert"  method="post">
		제목 : <input type="text" name="bookTitle" required><br><br>
		작가 : <input type="text" name="bookAuthor" required><br><br>
		출판일 : <input type="date" name="bookPublicationDate" required><br><br>
		가격 : <input type="text" name="bookPrice" required><br><br>
		작가 : <input type="text" name="bookPublisher" required><br><br>
		페이지수 : <input type="number" name="bookPageCount" required><br><br>
		장르 : <input type="text" name="bookGenre" required><br><br>
		<button>등록</button>
		
	</form>
	
	<h2><a href="list">목록으로</a></h2>
</body>
</html>