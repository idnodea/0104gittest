
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTTP 상태 404 – 파일   외부 -->
<!-- HTTP 상태 500 – 내부 서버 오류   내부오류 -->
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3366/firm";
		String id = "root";
		String pass = "mysql";
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
	%>
</body>
</html>