function checkBoardTitle() {
    var input = document.querySelector("[name=boardTitle]");
    //var regex = /^.{1,100}$/;

    var isValid = input.value.length > 0 && input.value.length <= 100;
    input.classList.remove("fail");
    if(isValid == false) {
        input.classList.add("fail");
        return false;
    }
    return true;
}

function checkBoardContent() {
    var textarea = document.querySelector("[name=boardContent]");
    var isValid = textarea.value.length > 0 && textarea.value.length <= 1000;

    var len = document.querySelector(".len");
    len.textContent = textarea.value.length;
    textarea.classList.remove("fail", "fail2");
    len.classList.remove("red");
    if(textarea.value.length >= 1000) {
        textarea.classList.add("fail2");
        len.classList.add("red");
        return false;
    }
    else if(isValid == false) {
        textarea.classList.add("fail");
        len.classList.add("red");
        return false;
    }
    return true;
}

function checkLength() {
    var textarea = document.querySelector("#a");
    
    if(textarea.value.length > 1000) {
        var copy = textarea.value;
        while(copy.length > 1000) {
            copy = copy.substring(0, copy.length -1);
        }
        textarea.value = copy;
    }
    var span = document.querySelector(".len");
    span.textContent = textarea.value.length;
}

function checkForm() {
    var r1 = checkBoardTitle();
    var r2 = checkBoardContent();
    var r2 = checkLength();
    return r1 && r2 && r3;
}