<%@page import="java.sql.ResultSet"%>
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
	String sql="select ename, job, sal from emp1";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery(); %>
	
	<table>
	<tr>
	<td>
		<a href="index.jsp">목록으로</a>
	
	<% 
	while(rs.next()){ %>
	
	<%=rs.getString("ename")%>
	<%=rs.getString("job")%>
	<%=rs.getString("sal")%>
	
	<%	}
	%>
	</td>
</tr>

</table>
	

</body>
</html>