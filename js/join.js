$(function(){

    var status = {
        id:false,
        pw:false,
        pwCheck:false,
        nickname:false,
        email:false,
        contact:false,
        birth:false,
        address:false,
        ok:function(){
            return this.id && this.pw && this.pwCheck 
            && this.nickname && this.email && this.contact 
            && this.birth && this.address;
        },
    };

    // $("[name=memberId]").on ("blur", function(){
        $("[name=memberId]").blur( function(e){
            var regex = /^[a-z][a-z0-9]{4,19}$/;
            var isValid = regex.test($(e.target).val());
            
            
            if(isValid) { //형식이 유효하다면
                $.ajax({
                    url:"http://localhost:8080/rest/member/idCheck",
                    method:"post",
                    data : { memberId : $(e.target).val()},
                    success : function(response){
                        $(e.target).removeClass("success fail fail2");
                        if(response == "Y") {
                            $(e.target).addClass("success");
                            status.id = true;
                        }
                        else {
                            $(e.target).addClass("fail2");
                            status.id = false;
                        }
                    },
                    error : function(){
                        $(e.target).removeClass("success fail fail2");
                        alert("서버와의 통신이 원활하지 않습니다");
                    },
                });
            }
            else { //형식이 유효하지 않다면 (1차 실패)
                $(e.target).addClass("fail");
                status.id = false;
            }
        });

    $("[name=memberPw]").blur(function(){
        var regex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
        var isValid = regex.test($(this).val());
        $(this).removeClass("success fail");
        $(this).addClass(isValid ? "success" : "fail");
        status.pw = isValid;
    });

    $("#password-check").blur(function(){
        var originPw = $("[name=memberPw]").val();
        var checkPw = $(this).val();

        $(this).removeClass("success fail fail2");
        if(originPw.length == 0) {//비밀번호 미입력
            $(this).addClass("fail2");
            status.pwCheck = false;
        }
        else if(originPw == checkPw) {//비밀번호 일치
            $(this).addClass("success");
            status.pwCheck = true;
        }
        else {//비밀번호 불일치
            $(this).addClass("fail");
            status.pwCheck = false;
        }
    });

$("[name=memberNickname]").blur(function(e) {
    var nickRegex = /^[가-힣0-9]{2,10}$/;
    var isValid = nickRegex.test($(e.target).val());
    
    if(isValid) {//형식 통과
        $.ajax({
            url:"http://localhost:8080/rest/member/nicknameCheck",
            method:"post",
            // data : { memberNickname : e.target.value }, //JS
            data : { memberNickname : $(e.target).val()}, //jQuery
            success : function(response){
                $(e.target).removeClass("success fail fail2");
                if(response == "Y") { //사용 가능한 닉네임
                    $(e.target).addClass("success");
                    status.nickname = true;
                }
                else { //이미 사용중인 닉네임
                    $(e.target).addClass("fail2");
                    status.nickname = false;
                }
            },
            error : function(){
                $(e.target).removeClass("success fail fail2");
                alert("서버와의 통신이 원활하지 않습니다");
            },
        });
    }
    else { //형식 오류
        $(e.target).addClass("fail");
        status.nickname = false;
    }
});

$("[name=memberEmail]").blur(function() {
    var emailRegex = /^(.*?)@(.*?)$/;
    var isValid = $(this).val() == "" || emailRegex.test($(this).val());
    $(this).removeClass("success fail");
    $(this).addClass(isValid ? "success" : "fail");
    status.email = isValid;
});

$("[name=memberContact]").blur(function(){
    var contactRegex =  /^010[1-9][0-9]{7}$/;
    var con = $(this).val();
    var isValid = con.length == 0 || contactRegex.test(con);
    $(this).removeClass("success fail");
    $(this).addClass(isValid ? "success" : "fail");
    status.contact = isValid;
});

$("[name=memberBirth]").blur(function(){
    var birthRegex =  /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$/;
    var isValid = $(this).val().length == 0 || birthRegex.test($(this).val());
    $(this).removeClass("success fail");
    $(this).addClass(isValid ? "success" : "fail");
    status.birth = isValid;
});

//css라서 선택자 , 가능
$("[name=memberPost], [name=memberAddr1], [name=memberAddr2]").blur(function(){
    var post = $("[name=memberPost]").val();
    var addr1 = $("[name=memberAddr1]").val();
    var addr2 = $("[name=memberAddr2]").val();
    var isBlank = post.length == 0 && addr1.length == 0 && addr2.length == 0;
    var isFill = post.length > 0 && addr1.length > 0 && addr2.length > 0;
    var isValid = isBlank || isFill;
    $("[name=memberPost], [name=memberAddr1], [name=memberAddr2]").removeClass("success fail");
    $("[name=memberPost], [name=memberAddr1], [name=memberAddr2]").addClass(isValid ? "success" : "fail");
    status.address = isValid;
});

//페이지 이탈 방지
    //- window에 beforeunload 이벤트 설정
    $(window).on("beforeunload", function(){
        return false;
    });

  //- form 전솔할 때는 beforeunload 이벤트를 제거
$(".join-form").submit(function(e){
    $(".form-input").blur();  //전체적으로 이벤트 재발생
    if(!status.ok()) {
        e.preventDefault();
        // return false;
    }
    else {
        $(window).off("beforeunload");
    }
});

});