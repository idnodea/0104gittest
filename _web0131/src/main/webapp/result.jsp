<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- index의 폼 메소드가 get방식이라면   
	http://localhost:8080/_web0131/result.jsp?kor=100&eng=87
	?붙이고 값을 붙이는 식으로 열 수도 있음
	 -->
	 <!-- 페이지는 엔코딩이 됬지만, 받은 값이 엔코딩이 되었을까요?  -->
	 <%
	 request.setCharacterEncoding("utf-8");
	 %>
	 <!-- 위의 식을 추가해줍니다  -->
	 
	국어: <%=request.getParameter("kor") %><br/>
	영어: <%=request.getParameter("eng") %><br/>
	수학: <%=request.getParameter("math") %><br/>
</body>
</html>