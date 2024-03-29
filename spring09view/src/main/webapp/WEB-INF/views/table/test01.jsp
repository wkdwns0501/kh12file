<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 만들기</title>
</head>
<body>

	<h1>테이블 만들기</h1>
	
	<!-- 
		홈페이지에서 목록을 보여주기 위해서 사용 가능한 태그
		[1] table 태그 - 넓은 화면을 위한 목록
		[2] list 태그 - 좁은 화면을 위한 목록
	 -->
	 <!-- 
	 	tr - 줄
	 	th - 제목 칸
	 	td - 내용 칸
	 	(주의) 글자는 반드시 th나 td 안에 써야 한다
	 	(참고) 폭과 높이를 부여하지 않으면 내용에 기반하여 자동 생성
	 	정렬을 위해 th를 사용하지 않는다, 정렬방법이 따로 있다
	 	디자인의 기본단위 : 픽셀
	  -->
	 <table border="1" width="300">
	 	<tr>
	 		<th>1-1</th>
	 		<th>1-2</th>
	 	</tr>
	 	<tr>
	 		<td>2-1</td>
	 		<td>2-2</td>
	 	</tr>
	 </table>
	 
</body>
</html>