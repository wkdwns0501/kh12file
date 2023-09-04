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

    var nickRegex = /^[가-힣0-9]{2,10}$/;
    var isValid = nickRegex.test(nick.value);

    nick.classList.remove("success", "fail", "fail2");
    if(isValid) {
		// +중복검사(추후)
		nick.classList.add("success");
		return true;
	}
	else {
		nick.classList.add("fail");
		return false;
	}
}

function checkMemberEmail() {
    var email = document.querySelector("[name=memberEmail]");
    var regex = /^(.*?)@(.*?)$/;

    var isValid = email.value.length == 0 || regex.test(email.value);
    email.classList.remove("success", "fail");
    email.classList.add(isValid ? "success" : "fail");
    return isValid;
}

function checkMemberContact() {
    var contact = document.querySelector("[name=memberContact]");
    var regex = /^010[1-9][0-9]{7}$/;

    var isValid = contact.value.length == 0 || regex.test(contact.value);

    contact.classList.remove("success", "fail");
    contact.classList.add(isValid ? "success" : "fail");
    return isValid;
}

function checkMemberBirth() {
    var input = document.querySelector("[name=memberBirth]");
    var regex = /^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$/;

    var isValid = input.value.length == 0 || regex.test(input.value);
    input.classList.remove("success", "fail");
    input.classList.add(isValid ? "success" : "fail");
    return isValid;
}

function checkMemberAddress() {
	var input1= document.querySelector("[name=memberPost]");
	var input2= document.querySelector("[name=memberAddr1]");
	var input3= document.querySelector("[name=memberAddr2]");
	
	var isBlank = input1.value.length == 0 && input2.value.length == 0 && input3.value.length == 0;
	var isFill = input1.value.length > 0 && input2.value.length > 0 && input3.value.length > 0;
//	var isValid = 모두 비어있다 || 모두 채워져있다;
	var isValid = isBlank || isFill;
	
	input1.classList.remove("success", "fail");
	input2.classList.remove("success", "fail");
	input3.classList.remove("success", "fail");
	
	input1.classList.add(isValid ? "success" : "fail");
	input2.classList.add(isValid ? "success" : "fail");
	input3.classList.add(isValid ? "success" : "fail");
	
	return isValid;
}

function checkForm() {
    var r1 = checkMemberId();
    var r2 = checkMemberPw();
    var r3 = checkMemberPwPw();
    var r4 = checkMemberNickname();
    var r5 = checkMemberEmail();
    var r6 = checkMemberBirth();
    var r7 = checkMemberContact();
    var r8 = checkMemberAddress();
    return r1 && r2 && r3 && r4 && r5 && r6 && r7 && r8;
}