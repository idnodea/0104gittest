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
	<!-- 우클릭 런애즈-서버-넥스트-리무브올- 
	pstmt.setString(1, "홍길동");
	pstmt.setString(2, "사원");
	pstmt.setDouble(3, 3120)
	pstmt.setDouble(3, Double.parseDouble(request.getParameter("sal")));

-->
	<%
	request.setCharacterEncoding("UTF-8");
	%>
	<%
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "insert into emp1(ename, job, sal) values(?, ?, ?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	pstmt.setString(2, request.getParameter("job"));
	pstmt.setString(3, request.getParameter("sal"));
	int result = pstmt.executeUpdate();
	if (result == 1) {
		out.println("입력 성공!");
	}
	%>
	
	<!--  스테이트먼트는 sql을 쿼리문안에 넣고, 프리페어스테이트먼트는 스테이트먼트 뒤에 -->\
	<br/>
	<button onclick = "location.href='select2.jsp'">사원 목록</button>
	<%
	response.sendRedirect("select2.jsp");
	%>
</body>
</html>