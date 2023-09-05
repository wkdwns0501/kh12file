<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<script src="/js/memberjoin.js"></script>
<script>

</script>

<form action="join" method="post"  autocomplete="off"  onsubmit="return checkForm();">

	<div class="container w-400 mt-20">
            <div class="row mb-30">
                <h1>회원 가입</h1>            
            </div>
            <div class="row left">
                <!-- 
                    라벨에는 for를 이용하여 특정 대상을 연결시킬 수 있다 
                    for="대상ID"
                    체크박스 등도 선택하게 만들 수 있다 (디자인적으로 활용)
                -->
                <label for="id-input">아이디 <span class="fa-solid fa-asterisk red"></span></label>
                <input type="text" name="memberId" class="form-input w-100" 
                id="id-input" placeholder="영문 소문자+숫자 8~20자 이내"  onblur="checkMemberId();">   
                <div class="success-feedback">사용 가능한 아이디</div>
            	<div class="fail-feedback">영문과 숫자 5~20자로 작성</div>
            </div>
            <div class="row left">
                <label>비밀번호 <span class="fa-solid fa-asterisk red"></span></label>
                <input type="password" name="memberPw" class="form-input w-100" 
                placeholder="영문, 숫자, 특수문자 8~20자"  onblur="checkMemberPw();">
                <div class="success-feedback">사용 가능한 비밀번호</div>
            	<div class="fail-feedback">영문, 숫자, 특수문자 반드시 1개 이상 포함 8~20자로 작성</div>
            </div>
            <div class="row left">
                <label>비밀번호 확인 <span class="fa-solid fa-asterisk red"></span></label>
                <input type="password" name="memberPw" class="form-input w-100"  id="password-check"
                placeholder="비밀번호 재입력"  onblur="checkMemberPwPw();">
                <div class="success-feedback">비밀번호가 일치합니다</div>
            	<div class="fail-feedback">비밀번호가 일치하지 않습니다</div>
            	<div class="fail2-feedback">비밀번호를 먼저 입력하세요</div>
            </div>
            <div class="row left">
                <label>닉네임 <span class="fa-solid fa-asterisk red"></span></label>
                <input type="text" name="memberNickname" class="form-input w-100" 
                placeholder="한글 또는 숫자 2~10자 이내" onblur="checkMemberNickname();">
                <div class="success-feedback">사용 가능한 닉네임</div>
                <div class="fail-feedback">한글 또는 숫자 2~10자 이내로 작성하세요</div>
                <div class="fail2-feedback">이미 사용중인 닉네임</div>
            </div>
            <div class="row left">
                <label>이메일</label>
                <input type="text" name="memberEmail" class="form-input w-100" 
                placeholder="testuser@kh.com" onblur="checkMemberEmail();">
                <div class="fail-feedback">이메일 형식이 잘못되었습니다</div>
            </div>
            <div class="row left">
                <label>연락처</label>
                <input type="tel" name="memberContact" class="form-input w-100" 
                placeholder="- 제외하고 입력" onblur="checkMemberContact();">
                <div class="fail-feedback">전화번호 형식이 잘못되었습니다</div>
            </div>
            <div class="row left">
                <label>생년월일</label>
                <input type="date" name="memberBirth" class="form-input w-100"
                 onblur="checkMemberBirth();">
                 <div class="fail-feedback">생년월일 형식이 잘못되었습니다</div>
            </div>
            <div class="row left">
                <label class="mb-10" style="display: block">주소</label>
                <input style="width:8em" type="text" name="memberPost"  size="6" maxlength="6" 
                class="form-input" placeholder="우편번호" onblur="checkMemberAddress();">
                <button type="button" class="btn"><i class="fa-solid fa-magnifying-glass"></i></button>
                <input type="text" name="memberAddr1" 
                class="form-input mt-10 w-100" placeholder="기본주소" onblur="checkMemberAddress();">
                <input type="text" name="memberAddr2" 
                class="form-input mt-10 w-100" placeholder="상세주소" onblur="checkMemberAddress();">
                <div class="fail-feedback">모든 주소를 작성해주세요</div>
            </div>    
            <div class="row mt-30">
                <button type="submit" 
                class="btn btn-positive w-100 fa-solid fa-arrow-right-to-bracket"
                style="border-color: #85E6C5;  background-color: #85E6C5;"> 
                가입하기</button>
            </div>
        </div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>