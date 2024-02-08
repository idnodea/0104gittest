<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>
<%
	Cookie cookie = new Cookie("name", URLEncoder.encode("호랑이","utf-8"));
	response.addCookie(cookie);
	
	
%>
<html>
<head><title>쿠키생성</title></head>
<body>

<%=
cookie.getName()

%>
쿠키값=
"<%=cookie.getValue()

%>"

</body>
</html>
