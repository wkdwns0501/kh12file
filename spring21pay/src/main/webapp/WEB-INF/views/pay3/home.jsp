<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>가장 일반적인 결제</h1>

<div class="table">

<table border="1" class="product-list">
    <thead>
        <tr>
            <th>선택</th>
            <th>번호</th>
            <th>제품 이름</th>
            <th>가격</th>
            <th>수량</th>
        </tr>
    </thead>
    <tbody align="center">
        <c:forEach var="productDto" items="${list}">
            <tr class="product-item">
                <td><input type="checkbox" name="productNo" value="${productDto.productNo}"></td>
                <td>[${productDto.productNo}]
                <td align="left">${productDto.productName}</td>
                <td>${productDto.productPrice}원</td>
                <td><input type="number" name="qty" value="1" min="1"></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<button class="purchase-btn" type="button">구매하기</button>
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	//버튼 누르면 폼을 만들어서 체크된 항목의 "상품번호"와 "구매수량"을 입력창으로 만들어 추가
	$(".purchase-btn").click(function(){
		var form = $("<form>").attr("action", "test3/purchase").attr("method", "post");
		
		var count = 0;
		
		$(".product-item").each(function(index, tag){
			//체크박스가 체크되어 있다면 상품번호와 상품수량을 불러와서 form에 추가하겠다
			var checked = $(this).find("[name=productNo]").prop("checked");
			if(checked == false) return;
			
			var productNo = $(this).find("[name=productNo]").val();
			var qty = $(this).find("[name=qty]").val();
// 			console.log(productNo, qty);
			
			$("<input>").attr("name","product["+count+"].productNo")
								.attr("type", "hidden")
								.val(productNo)
								.appendTo(form);
			$("<input>").attr("name","product["+count+"].qty")
								.attr("type", "hidden")
								.val(qty)
								.appendTo(form);
			count++;
		});
		
		$("body").append(form);
		form.submit(); //form 전송해라!
	});
</script>
