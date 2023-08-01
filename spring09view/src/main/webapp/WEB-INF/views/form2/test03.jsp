<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h1>탈퇴를 위한 정보를 입력해주세요</h1>
	<form action="http://localhost:8080/member/exit"
						autocomplete="off" method="post">
		아이디 : <input type="text" name="memberId" required
						placeholder="아이디 입력"><br><br>
		비밀번호 : <input type="password" name="memberPw" required
						placeholder="비밀번호 입력"><br><br>
		<button>탈퇴하기</button>
	</form>
</body>
</html>