<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 등록</title>
</head>
<body>

	<h1>셔츠 등록</h1>
	
	<form action="add" method="post">
		상품이름 : <input type="text" name="shirtName" required><br><br>
		상품색상 : <select name="shirtColor" required>
						<option value="none" disable>---선택---</option>
						<option>블랙</option>
						<option>화이트</option>
						<option>그레이</option>
						<option>레드</option>
						<option>블루</option>
					</select><br><br>
		판매가격 : <input type="number" name="shirtPrice" required><br><br>
		상품종류 : <select name="shirtKind" required>
						<option value="none" disable>---선택---</option>
						<option>라운드</option>
						<option>브이넥</option>
						<option>정장</option>
					</select><br><br>
		상품유형 : <select name="shirtType" required>
						<option value="none" disable>---선택---</option>
						<option>민소매</option>		
						<option>반팔</option>		
						<option>긴팔</option>		
					</select><br><br>
		상품재질 : <input type="text" name="shirtMaterial"><br><br>
		판매수량 : <input type="number" name="shirtStock"><br><br>
		<button>상품등록</button>
	</form>

</body>
</html>