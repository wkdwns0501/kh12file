<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
<body>
	
	<h1>도서 정보 수정</h1>
	
	<form action="edit" method="post">
		<input type="hidden" name="bookId" value="${dto.bookId}">
		제목 : <input type="text" name="bookTitle" value="${dto.bookTitle}">
		작가 : <input type="text" name="bookAuthor" value="${dto.bookAuthor}">
		출판일 : <input type="text" name="bookPublicationDate" value="${dto.bookPublicationDate}">
		가격 : <input type="number" name="bookPrice" value="${dto.bookPrice}">
		출판사 : <input type="text" name="bookPublisher" value="${dto.bookPublisher}">
		페이지수 : <input type="text" name="bookPageCount" value="${dto.bookPageCount}">
		장르 : <input type="text" name="bookGenre" value="${dto.bookGenre}">
		<button>수정하기</button>
	</form>
</body>
</html>