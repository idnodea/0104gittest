<%@page import="java.sql.PreparedStatement"%>
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

	<%
	String driver="com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/firm";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url,"root","mysql");
	String sql="delete from emp1 where ename = ? ";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	pstmt.executeUpdate();
	%>
	
	<%
	response.sendRedirect("mysql_List(4).jsp");
	%>
</body>
</html>