<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 서블렛 선택(쿠키) -->
<%
Cookie ck = new Cookie("loginId","admin");
//ck.setMaxAge(60*60*24*30);//60초 ***** 기본값은 -1  브라우저창이 닫히는 것이기준
ck.setMaxAge(60);//60초 ***** 기본값은 -1  브라우저창이 닫히는 것이기준
response.addCookie(ck);
%>
<%=ck.getName() %><br/>
<%=ck.getValue() %>
</body>
</html>