<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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

<!-- jquery cdn -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/5.3.2/flatly/bootstrap.min.css" rel="stylesheet">



    <div class="container-fluid mt-5">
        <div class="row">
            <div class="col-md-10 offset-md-1">

                <!-- 메뉴바 -->
                <nav class="navbar navbar-expand-lg bg-primary fixed-top" data-bs-theme="dark">
                    <div class="container-fluid">
                      <a class="navbar-brand" href="#">KH정보교육원</a>
                      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
                        data-bs-target="#navbarColor01" aria-controls="navbarColor01" 
                        aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span><!-- 메뉴바 아이콘 -->
                      </button>
                      <div class="collapse navbar-collapse" id="navbarColor01">
                        <ul class="navbar-nav me-auto">
                          <li class="nav-item">
                            <a class="nav-link active" href="#">Home<!-- active : 활성화 클래스 -->
                              <span class="visually-hidden">(current)</span>
                            </a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#">Features</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#">Pricing</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                          </li>
                          <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                            <div class="dropdown-menu">
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </li>
                        </ul>
                        <!-- 검색창 (가입, 로그인을 만들고 싶다면 form 대신 div) -->
                        <form class="d-flex"><!-- display : flex --> <!-- d-block = display : block -->
                          <input class="form-control me-sm-2" type="search" placeholder="Search">
                          <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
                        </form>
                      </div>
                    </div>
                  </nav>
        <section>
