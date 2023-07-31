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
	
	<!-- 
		input은 여러 가지의 입력을 처리할 수 있다
		- type이라는 속성을 통해 입력창의 형태를 바꿀 수 있다
		- type의 기본값은 text이다
		- date 는 날짜, number는 숫자만 입력가능(하나씩 올리고 내리는 기능이 있음)
		- (참고) 반드시 입력해야 하는 값은 required="required" 속성 추가
		- 만약 이름이랑 값이 같다면 특별히 이름만 써도 처리해준다 
		- required, readonly, disabled, checked, selected, ...
	 -->
	<form action="http://localhost:8080/save">
	제목 : <input type ="text" name = "bookTitle" required><br><br>
	작가 : <input type ="text" name = "bookAuthor" required><br><br>
	출판일 : <input type="date" name = "bookPublicationDate" required><br><br>
	가격 : <input type="text" name = "bookPrice" required><br><br>
	출판사 : <input type="text" name = "bookPublisher" required><br><br>
	<!-- 1~1000 사이에서 1씩 증가/감소하며 시작값은 1 -->
	페이지수 : <input type="number" name = "bookPageCount" required
						min="1" max="1000" step="1" value="1"><br><br>
<!-- 	장르 : <input type="text" name = "bookGenre"><br><br> -->
	<!-- select를 이용하여 선택 가능한 입력창을 만들수 있다 -->
	장르 : 
	<select name = "bookGenre" required>
		<option>자기개발</option>
		<option>수험서</option>
		<option>소설</option>
		<option>공포</option>
		<option>추리</option>
	</select><br><br>
	
	<button>등록하기</button>
	</form>
</body>
</html>