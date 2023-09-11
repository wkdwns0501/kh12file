<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>

<!-- favicon 설정 -->
<link rel="shortcut icon" href="/images/favicon.ico">

<!-- css 파일을 불러오는 코드 -->
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<!-- 구글 웹 폰트 사용을 위한 CDN -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/css/reset.css">
<link rel="stylesheet" type="text/css" href="/css/layout.css">
<link rel="stylesheet" type="text/css" href="/css/commons.css">
<!-- <link rel="stylesheet" type="text/css" href="/css/test.css"> -->
<style></style>

<!-- jquery cdn -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

</head>
<body>
	<main>
        <header>
            <div class="logo">
                <img src="https://dummyimage.com/200x50/000/fff">
            </div>
            <div class="title">
                <h1 style="color:#33BBC5">F A D O</h1>
            </div>
            <div class="etc"></div>
        </header>
        <nav>
            <ul class="menu center">
            	<c:choose>
            		<c:when test="${sessionScope.storage != null}">
            			<li><a href="/">Home</a></li>
            			<li><a href="/member/mypage">내정보</a></li>
            			<li><a href="/member/logout">로그아웃</a></li>
            			<li><a href="/board/list">게시판</a></li>
            			
       					<%-- 관리자인 경우 추가 메뉴 출력 --%>
						<c:if test="${sessionScope.level == '관리자'}">
							<li><a href="/admin/home">관리자메뉴</a></li>
						</c:if>
            		</c:when>
            		<c:otherwise>
            			<li><a href="/">Home</a></li>
            			<li><a href="/member/join">회원가입</a></li>
            			<li><a href="/member/login">로그인</a></li>
            			<li><a href="/board/list">게시판</a></li>
            		</c:otherwise>
            	</c:choose>
            </ul>
        </nav>
        <section>
