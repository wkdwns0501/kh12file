<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KH정보교육원 구내식당 식단표</title>
</head>
<body>

	<h1>식단표</h1>
	
	<table border="1" width="500">
		<!-- 제목은 thead 태그로 감싼다 -->
		<thead>
			<!--  제목 1줄 , thead-->
			<!-- 폭은 1개만 설정하면 그 줄 전체가 설정된다 -->
			<!-- 그래서 보통 제목을 설정한다 -->
			<tr>
				<th width="20%">월</th>
				<th width="20%">화</th>
				<th width="20%">수</th>
				<th width="20%">목</th>
				<th width="20%">금</th>
			</tr>
		</thead>	
		<!-- 내용은 tbody 태그로 감싼다 -->
			<!-- 내용 3줄 -->
		<tbody align="center">
			<tr>
				<td>제육볶음</td>
				<td>김치제육</td>
				<td>간장제육</td>
				<td>마늘제육</td>
				<td>고추장제육</td>
			</tr>
			<tr>
				<td>배추김치</td>
				<td>오이김치</td>
				<td>깍두기</td>
				<td>겉절이</td>
				<td>배추김치</td>
			</tr>
			<tr>
				<td>미역국</td>
				<td>북어국</td>
				<td>시래기국</td>
				<td>된장국</td>
				<td>계란국</td>
			</tr>
		</tbody>		
	</table>
	
</body>
</html>