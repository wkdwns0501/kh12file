function checkMemberId() {
    var id = document.querySelector("[name=memberId]");

    var idRegex = /^[a-z][a-z0-9]{4,19}$/;
    id.classList.remove("success", "fail");
    if(idRegex.test(id.value)){
        id.classList.add("success");
        return true;
    }
    else {
        id.classList.add("fail");
        return false;
    }
}

function checkMemberPw() {
    var pw = document.querySelector("[name=memberPw]");

    var pwRegex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
    var isValid = pwRegex.test(pw.value);

    pw.classList.remove("success", "fail");
    pw.classList.add(isValid ? "success" : "fail");
    
    return isValid;
}

function checkMemberPwPw() {
    var pw = document.querySelector("[name=memberPw]");
    var pwpw = document.querySelector("#password-check");

    //var isVaild = 비밀번호가 1글자 이상 입력되어 있고 두 입력값이 같으면;
    var isVaild = pw.value.length >= 1 && pw.value == pwpw.value;
    pwpw.classList.remove("success", "fail", "fail2");
    if(pw.value.length == 0){ //비밀번호 미작성
        pwpw.classList.add("fail2");
        return false;
    }
    else if(isVaild) { //비밀번호 일치
        pwpw.classList.add("success");
        return true;
    }
    else { //비밀번호 불일치
        pwpw.classList.add("fail");
        return false;
    }
}

function checkMemberNickname() {
    var nick = document.querySelector("[name=memberNickname]");

    var nickRegex = /^[가-힣0-9]{1,10}$/;
    var isValid = nickRegex.test(nick.value);

    nick.classList.remove("success", "fail");
    nick.classList.add(isValid ? "success" : "fail");
    
    return isValid;
}

function checkForm() {
    var r1 = checkMemberId();
    var r2 = checkMemberPw();
    var r3 = checkMemberPwPw();
    var r4 = checkMemberNickname();
    return r1 && r2 && r3 && r4;
}