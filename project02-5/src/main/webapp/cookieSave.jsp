<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String email= request.getParameter("email");
	String ck= request.getParameter("ck");
	
	if(ck != null && ck.equals("on")){//쿠키생성
		//System.out.println(email);
		
		Cookie cookie = new Cookie("email", email);  //쿠키의이름,변수명
		cookie.setMaxAge(60);
		response.addCookie(cookie);
	} else{//쿠키삭제
		Cookie cookie = new Cookie("email", null);  //쿠키의이름,변수명
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>