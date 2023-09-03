<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="/js/boardWrite.js"></script>
<script>

</script>

<form action="edit" method="post" autocomplete="off" onsubmit="return checkForm();">
<input type="hidden" name="boardNo" value="${boardDto.boardNo}">

<div class="container w-600">
	<div class="row">
		<h1>게시글 수정</h1>
	</div>
	
	<div class="row left">
		<label>제목</label>
		<input class="form-input w-100" type="text" name="boardTitle" 
		value="${boardDto.boardTitle}" onblur="checkBoardTitle();">
		<div class="fail-feedback">제목은 필수이며 100자 이내로 작성하세요</div>
	</div>
	
	<div class="row left">
		<label>내용</label>
		<textarea class="form-input w-100" name="boardContent" 
			style="min-height:250px" oninput="checkBoardContent();">${boardDto.boardContent}</textarea>
			<div class="fail-feedback">내용은 반드시 작성해야 합니다</div>
            <div class="fail2-feedback">내용은 1000자 이하로만 작성 가능합니다</div>
	</div>
	
		<div class="row right">
            <span class="len red">0</span> / 1000
        </div>
	
	<div class="row right">
		<a href="list" class="btn">
			<i class="fa-solid fa-list"></i>
			목록
		</a>
		<button type="submit" class="btn btn-positive"
		style="border-color: #85E6C5;  background-color: #85E6C5;">
			<i class="fa-solid fa-edit"></i>
			수정
		</button>
	</div>
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>