<%--
	JSP 설정
	- 이 부분은 사용자에게 보여지지 않는 내용
	- 아무 값이나 써도됨(보안 수준이 높음)
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>  
    <!-- 
    HTML
    - 이 부분은 사용자에게 보여지는 내용
    - 중요한 정보를 빼고 써야 됨
    - 태그(tag) 형식을 사용하며 미리 정해진 이름이 있음
    - 시작 태그와 종료 태그로 영역을 설정할 수 있다 <> </>
    - 시작 태그만 있는 경우 영역을 설정할 수 없다
    - 사용자에게 보여질 화면의 골격을 만듦
    
    - html : html 문서의 범위를 지정
    - head : 문서의 정보를 나타내기 위한 영역
    - body : 문서의 표시 내용을 나태내기 위한 영역
     -->									 
<!DOCTYPE html>			<!-- 사용할 HTML 버전 명시(HTML5) -->		
<html> 									
	<head> 								
		<meta charset="UTF-8">		
		<title>첫 번째 페이지</title>
	</head>
	<body>
		안녕하세요
	</body>
</html>