function checkId() {
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

function checkPw() {
    var pw = document.querySelector("[name=memberPw]");

    var pwRegex = /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$/;
    var isValid = pwRegex.test(pw.value);

    pw.classList.remove("success", "fail");
    if(isValid){
        pw.classList.add("success");
        return true;
    }
    else {
        pw.classList.add("fail");
        return false;
    }
}

function checkNickname() {
    var nick = document.querySelector("[name=memberNickname]");

    var nickRegex = /^[가-힣0-9]{1,10}$/;
    var isValid = nickRegex.test(nick.value);

    nick.classList.remove("success", "fail");
    if(isValid){
        nick.classList.add("success");
        return true;
    }
    else {
        nick.classList.add("fail");
        return false;
    }
}

function checkForm() {
    var r1 = checkId();
    var r2 = checkPw();
    var r3 = checkNickname();
    return r1 && r2 && r3;
}