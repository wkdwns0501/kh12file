<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<title>게시판 목록</title>

<h2>자유 게시판</h2>
	
	<%-- 검색일 경우 검색어를 추가로 출력
		&quot; -> "       html 특수문자 검색하면 많이나옴
	 --%>
	 <c:if test="${isSearch}">
		<h3>&quot;${param.keyword}&quot;에 대한 검색 결과</h3>
	</c:if>
	<%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
	<c:if test="${sessionScope.storage != null}">
			<button><a href="write">글쓰기</a></button><br>
	</c:if>
	
<table border="1" width="800">
	<thead>
		<tr>
			<th>글번호</th>
			<th width="30%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>수정일</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>그룹</th>
			<th>상위</th>
			<th>차수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardListDto" items="${list}">
			<tr>
				<td>${boardListDto.boardNo}</td>
				<td align="left">
				
				<%--for(int i=1; i<= 차수; i++) --%>
				<c:forEach var="i" begin="1" end="${boardListDto.boardDepth}" step="1">
				&nbsp;&nbsp;
				</c:forEach>
				
				<%--띄어쓰기 뒤에 화살표 표시 --%> 
				<c:if test="${boardListDto.boardDepth > 0}">
					<img src="/images/reply.png" width="15" height="15">
				</c:if>
				
				<!-- 제목을 누르면 상세페이지로 이동 -->
					<a href="detail?boardNo=${boardListDto.boardNo}">
						${boardListDto.boardTitle}
					<!-- 댓글이 있다면 개수를 표시 -->
						<c:if test="${boardListDto.boardReplycount >0}">
						 	[${boardListDto.boardReplycount}]
						</c:if>
					 </a>
				</td>
				
<%-- 				사용자가 없으면 탈퇴한 사용자로 표시 (jsp에서 하는것보다 java에서 해라)--%>
<%-- 				<c:choose> --%>
<%-- 					<c:when test="${boardListDto.boardWriter != null}"> --%>
<%-- 						<td>${boardListDto.boardWriter}</td> --%>
<%-- 					</c:when> --%>
<%-- 					<c:otherwise> --%>
<!-- 						<td>(탈퇴한 사용자)</td> -->
<%-- 					</c:otherwise> --%>
<%-- 				</c:choose> --%>

				<td>${boardListDto.getBoardWriterString()}</td>
				
				<td>${boardListDto.boardCtimeString}</td>
				<td>${boardListDto.boardUtime}</td>
				<td>${boardListDto.boardReadcount}</td>
				<td>${boardListDto.boardLikecount}</td>
				<td>${boardListDto.boardGroup}</td>
				<td>${boardListDto.boardParent}</td>
				<td>${boardListDto.boardDepth}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<!-- 검색창 -->
<form action="list" method="get">

<c:choose>
	<c:when test="${param.type == 'board_writer'}">
		<select name="type" required>
			<option value="board_title">제목</option>
			<option value="board_writer" selected>작성자</option>
		</select>
	</c:when>
	<c:otherwise>
		<select name = "type" required>
			<option value="board_title">제목</option>
			<option value="board_writer">작성자</option>
		</select>
	</c:otherwise>
</c:choose>
	
	<input type="search" name="keyword" placeholder="검색어 입력" value="${param.keyword}" required>
	
	<button>검색</button>
</form>
	<br>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>