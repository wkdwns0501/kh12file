<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script>
$(function(){
	//파일이 바뀌면 프로필을 업로드하고 이미지 교체
	$(".profile-chooser").change(function(){
		//선택된 파일이 있는지 확인하고 없으면 중단
		//var input = document.querySelector(".profile-chooser");
		//var input = $(".profile-chooser")[0];
		var input = this;
		if(input.files.length == 0) return;
		
		//ajax로 multipart 업로드
		var form = new FormData();
		form.append("attach", input.files[0]);
		
		$.ajax({
			url:"/rest/member/upload",
			method:"post",
			processData:false,
			contentType:false,
			data:form,
			success:function(response){
				//응답 형태 - { "attachNo" : 7 }
				
				//프로필 이미지 교체
				$(".profile-image").attr("src", 
					"/rest/member/download?attachNo="+response.attachNo);
			},
			error:function(){
				window.alert("통신 오류 발생\n잠시 후 다시 시도해주세요");
			},
		});
	});
	
	//삭제아이콘을 누르면 
	$(".profile-delete").click(function(){
		//확인창
		var choice = window.confirm("정말 프로필을 지우시겠습니까?");
		if(choice == false) return;
		
		//삭제요청
		$.ajax({
			url:"/rest/member/delete",
			method:"post",
			success:function(response) {
				$(".profile-image").attr("src", "/images/user.png");
			}
		});
	});
});
</script>

<div class="container w-500">
	<div class="row">
		<h1>${memberDto.memberId} 님의 회원 정보</h1>
	</div>
	
	<div class="row mv-30">
		<c:choose>
			<c:when test="${profile == null}">
				<img src="/images/user.png" width="150" height="150" 
						class="image image-circle image-border profile-image">
			</c:when>
			<c:otherwise>
				<img src="/rest/member/download?attachNo=${profile}" width="150" height="150" 
						class="image image-circle image-border profile-image">
			</c:otherwise>
		</c:choose>
		
		<!-- 라벨을 만들고 파일선택장을 숨김 -->
		<label>
			<input type="file" class="profile-chooser" accept="image/*" style="display:none;">
			<i class="fa-solid fa-camera fa-2x blue"></i>
		</label>
		<i class="fa-solid fa-trash-can fa-2x red profile-delete"></i>
	</div>

	
	<div class="row">
		<table class="table table-border table-stripe">
			<tr>
				<th width="25%">닉네임</th>
				<td>${memberDto.memberNickname}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${memberDto.memberEmail}</td>
			</tr>
			<tr>
				<th>연락처</th>
				<td>${memberDto.memberContact}</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>${memberDto.memberBirth}</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>
					[${memberDto.memberPost}]
					${memberDto.memberAddr1}
					${memberDto.memberAddr2}
				</td>
			</tr>
			<tr>
				<th>등급</th>
				<td>${memberDto.memberLevel}</td>
			</tr>
			<tr>
				<th>포인트</th>
		<%-- 		<td>${memberDto.memberPoint} pt</td> --%>
				<td>
					<fmt:formatNumber value="${memberDto.memberPoint}" 
									pattern="#,##0"></fmt:formatNumber> pt
				</td>
			</tr>
			<tr>
				<th>가입일</th>
		<%-- 		<td>${memberDto.memberJoin}</td> --%>
				<td>
					<fmt:formatDate value="${memberDto.memberJoin}" 
									pattern="y년 M월 d일 E a h시 m분 s초"/>
				</td>
			</tr>
			<tr>
				<th>마지막로그인</th>
				<td>
					<fmt:formatDate value="${memberDto.memberLogin}" 
									pattern="y년 M월 d일 E a h시 m분 s초"/>
				</td>
			</tr>
			<tr>
				<th>마지막변경일</th>
				<td>
					<fmt:formatDate value="${memberDto.memberChange}" 
									pattern="y년 M월 d일 E a h시 m분 s초"/>
				</td>
			</tr>
		</table>
	</div>
	
	<div class="row mt-40">
		<h2>내가 좋아요한 게시글</h2>
	</div>
	
	<div class="row">
		<table class="table table-border table-stripe">
			<c:forEach var="boardDto" items="${boardLikeList}">
			<tr>
				<td class="w-75 left">
					<a class="link" href="/board/detail?boardNo=${boardDto.boardNo}">
						${boardDto.boardTitle}
					</a>
				</td>
				<td class="w-75">
					${boardDto.boardWriter}
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	
	<div class="row mt-40">
		<a class="btn w-100" href="password">
			<i class="fa-solid fa-key"></i>
			비밀번호 변경
		</a>
	</div>
	
	<div class="row">
		<a class="btn w-100" href="change">
			<i class="fa-solid fa-user"></i>
			개인정보 변경
		</a>
	</div>
	
	<div class="row mb-40">
		<a class="btn btn-negative w-100" href="exit">
			<i class="fa-solid fa-user-xmark"></i>
			회원 탈퇴
		</a>
	</div> 
	
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>