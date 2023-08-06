<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 정보 수정</title>
</head>
<body>

	<h1>셔츠 정보 수정</h1>
		
		<form action="edit" method="post">
			<input type="hidden" name="shirtNo" value="${dto.shirtNo}" required>
			상품이름 : <input type="text" name="shirtName" value="${dto.shirtName}" required><br><br>
			상품색상 : <select name="shirtColor" required>
							<option value="none" disable>---선택---</option>
							<option value="${dto.shirtColor}">블랙</option>
							<option value="${dto.shirtColor}">화이트</option>
							<option value="${dto.shirtColor}">그레이</option>
							<option value="${dto.shirtColor}">레드</option>
							<option value="${dto.shirtColor}">블루</option>
							</select><br><br>
			판매가격 : <input type="number" name="shirtPrice" value="${dto.shirtPrice}"  required><br><br>
			상품종류 : <select name="shirtKind" required>
								<option value="none" disable>---선택---</option>
								<option value="${dto.shirtKind}">라운드</option>
								<option value="${dto.shirtKind}">브이넥</option>
								<option value="${dto.shirtKind}">정장</option>
							</select><br><br>
			상품유형 : <select name="shirtType" required>
								<option value="none" disable>---선택---</option>
								<option value="${dto.shirtType}">민소매</option>
								<option value="${dto.shirtType}">반팔</option>
								<option value="${dto.shirtType}">긴팔</option>
							</select><br><br>
			상품재질 : <input type="text" name="shirtMaterial" value="${dto.shirtMaterial}" required><br><br>
			판매수량 : <input type="number" name="shirtStock" value="${dto.shirtStock}" required><br><br>
			<button>수정하기</button>
		</form>
		
</body>
</html>