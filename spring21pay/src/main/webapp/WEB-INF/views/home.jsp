 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include> 
              
                <!-- 내용(배너, 컨텐츠 등)을 배치할 때는 margin top을 줘서 메뉴가 표시될 자리만큼 띄워야 한다 -->
                <c:choose>
					<c:when test="${sessionScope.name == null}">
                <form action="login" method="post" autocomplete="off">
                  <div class="row mt-5 pt-5">
                      <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                          <h1 class="text-center">로그인</h1>
                      </div>
                  </div>

                  <div class="row mt-4">
                      <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                          <input type="text" name="memberId" class="form-control" placeholder="아이디">
                      </div>
                  </div>

                  <div class="row mt-2">
                      <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                          <input type="password" name="memberPw" class="form-control" placeholder="비밀번호">
                      </div>
                  </div>

                  <div class="row mt-2">
                      <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                          <div class="form-check form-switch">
                              <input class="form-check-input" type="checkbox" id="flexSwitchCheckDefault"
                                      name="remember">
                              <label class="form-check-label" for="flexSwitchCheckDefault">
                                  아이디 저장하기
                              </label>
                          </div>
                      </div>
                  </div>

                  <div class="row mt-4">
                      <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                          <button type="submit" class="btn btn-primary w-100">로그인</button>
                      </div>
                  </div>
              </form>

              <div class="row mt-4">
                  <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2 text-center">
                      <a href="#" class="text-secondary link-underline link-underline-opacity-0 link-underline-opacity-75-hover">
                          비밀번호 찾기 링크
                      </a>
                  </div>
              </div>
              </c:when>
              <c:otherwise>
               <div class="row mt-4">
                  <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2 mt-5">
	              	<h1 class="text-center">${sessionScope.name}</h1>
				 </div>
             </div>
             <div class="row mt-4">
                  <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2 text-center">
                <a href="logout" 
						class="text-secondary link-underline link-underline-opacity-0 link-underline-opacity-75-hover">
						로그아웃</a>
				</div>
             </div>
              </c:otherwise>
             </c:choose>
             
             <h2><a href="pay/test1">첫번째 예제</a></h2>
			<h2><a href="pay/test2">두번째 예제</a></h2>
			<h2><a href="pay/test3">세번째 예제</a></h2>

  <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>                