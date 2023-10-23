<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>SockJS를 적용한 웹소켓 예제</h1>

<input type="text" class="message-input">
<button type="button" class="send-btn">전송</button>

<div class="client-list"></div>
<div class="message-list"></div>

<!-- 웹소켓 서버가 SockJS일 경우 페이지에서도 SockJS를 사용해야 한다 -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.min.js"></script>
<script>
	//연결생성
// 	window.socket = new WebSocket(주소); //ws로 시작, sockJs를 안쓴경우
	window.socket = new SockJS("${pageContext.request.contextPath}/ws/sockjs"); //http로 시작
	//연결 후 해야할 일들을 콜백함수로 지정 (onopen, onclose, onerror, onmessage)
	window.socket.onmessage = function(e){
// 		console.log(e);
		var data = JSON.parse(e.data);
		//console.log(data);
		
		//사용자가 접속하거나 종료했을 때 서버에서 오는 데이터로 목록을 갱신
		//사용자가 메세지르 보냈을 때 서버에서 이를 전체에게 전달한다
		//data.clients에 회원 목록이 있다
		if(data.clients){//목록처리
			$(".client-list").empty();
			for(var i = 0; i < data.clients.length; i++){
				$("<div>").text(data.clients[i].memberId).appendTo(".clients-list");
			}
		}
		else if(data.content){//메세지 처리
			var memberId = $("<span>").text(data.memberId).addClass("badge bg-primary");
			var memberLevel = $("<span>").text(data.memberLevel).addClass("badge bg-secondary ms-1");
			var content = $("<div>").text(data.content).addClass("p-2 mt-1 border border-secondary rounded");
			
			$("<div>").addClass("mt-4")
							.append(memberId)
							.append(memberLevel)
							.append(content)
							.appendTo(".message-list");
		}
		
		$(".send-btn").click(function(){
			var text = $(".message-input").val();
			if(text.length == 0) return;
			
			window.socket.send(text);
			$(".message-input").val("");
		});
	};
</script>
