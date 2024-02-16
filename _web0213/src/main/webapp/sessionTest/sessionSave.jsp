<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	session.setAttribute("aaa", "bbb");
    %>
    <!-- 파일저장이 아니라 서버메모리에 저장하므로, utf-8을 안해줘도 안 깨짐 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 저장
</body>
</html>