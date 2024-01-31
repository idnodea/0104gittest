<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("utf-8"); 
	%>
	<!--get 대신 post쓰면 위 코드를 써주어야 한글이 안 깨짐 -->

	아이디:<%=request.getParameter("id") %><br/>
	비밀번호:<%=request.getParameter("pw") %><br/>
	성별:<%=request.getParameter("gender") %><br/>
	가입경로:<%=request.getParameter("intro") %><br/>
	주소지:<%=request.getParameter("addr") %><br/>
	메모:<%=request.getParameter("memo") %>
</body>
</html>