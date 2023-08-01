<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 비밀번호 변경</title>
</head>
<body>

	<h1>회원 비밀번호 변경</h1>
	
	<form action="http://localhost:8080/member/password"
			autocomplete="off" method="post">
		아이디 : <input type="text" name="memberId" required
									placeholder="아이디 입력"><br><br>	
		기존 비밀번호 : <input type="password" name ="memberPw" required
									placeholder="현재 비밀번호 입력"><br><br>
		신규 비밀번호 : <input type="password" name="changePw" required 
									placeholder="새 비밀번호 입력"><br><br>
<!-- 		신규 비밀번호 확인: <input type="text" name="changePw" required -->
<!-- 									placeholder="새 비밀번호 확인"><br><br> -->
		<button>변경하기</button>
	</form>
</body>
</html>