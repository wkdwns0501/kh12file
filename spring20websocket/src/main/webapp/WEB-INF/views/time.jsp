<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>타임 웹소켓 예제</h1>

<button type="button" class="connect-btn">연결</button>
<button type="button" class="disconnect-btn">종료</button>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	$(function(){
		$(".connect-btn").click(function(){
			var uri = "ws://localhost:8080/ws/time";
			window.socket = new WebSocket(uri);
		});
		$(".disconnect-btn").click(function(){
			window.socket.close();
		});
	
	});
</script>