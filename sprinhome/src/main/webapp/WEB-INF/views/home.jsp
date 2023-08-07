<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
	- 템플릿 페이지(template page)라고 부름
	- 절대경로를 사용할 것
 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

		<h2>환영합니다!</h2>
		<img src="https://fastly.picsum.photos/id/237/536/354.jpg?hmac=i0yVXW1ORpyCZpQ-CknuyV-jbtU7_x9EBQVhvT5aRr0">
		
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
		