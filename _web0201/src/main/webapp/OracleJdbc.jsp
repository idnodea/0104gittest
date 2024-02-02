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
<!-- 우클릭 런애즈-서버-넥스트-리무브올- -->
	<%
	String driver="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	String sql="create table emp1 as select ename, job,sal from emp";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.executeQuery();
	%>
<!--  스테이트먼트는 sql을 쿼리문안에 넣고, 프리페어스테이트먼트는 스테이트먼트 뒤에 -->	
	접속완료!
	<br/>
	emp1 테이블 생성!
</body>
</html>