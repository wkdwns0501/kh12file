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
	
	<form action="add2" method="post">
		상품이름 : <input type="text" name="shirtName" required><br><br>
		<!-- 
			option에 value를 주면 표시되는 값과 다르게 전송을 한다
		 -->
		상품색상 : <select name="shirtColor" required>
						<option value="" >---선택---</option>
						<option>블랙</option>
						<option>화이트</option>
						<option>그레이</option>
						<option>레드</option>
						<option>블루</option>
					</select><br><br>
		판매가격 : <input type="number" name="shirtPrice" required><br><br>
		상품종류 : <select name="shirtKind" required>
						<option value="" >---선택---</option>
						<option>라운드</option>
						<option>브이넥</option>
						<option>정장</option>
					</select><br><br>
		상품유형 : <select name="shirtType" required>
						<option value="" >---선택---</option>
						<option>민소매</option>		
						<option>반팔</option>		
						<option>긴팔</option>		
					</select><br><br>
		상품재질 : <input type="text" name="shirtMaterial"><br><br>
		판매수량 : <input type="number" name="shirtStock" required><br><br>
		<hr>
		
		<input type="checkbox" name="size" value="S"> S
		<input type="checkbox" name="size" value="M"> M
		<input type="checkbox" name="size" value="L"> L
		<input type="checkbox" name="size" value="XL"> XL
		<input type="checkbox" name="size" value="2XL"> 2XL
		<input type="checkbox" name="size" value="3XL"> 3XL
 		
		<hr>
		<button>상품등록</button>
	</form>
	<h2><a href="list">목록으로</a></h2>
</body>
</html>