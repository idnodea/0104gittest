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
<table border="1">
<tr>

	<a href="index.jsp">목록으로</a>
	<%
	/*request.setCharacterEncoding("UTF-8");*/
	String driver="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	String sql="select ename, job, sal from emp1";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery(); %>
	
	<% 
	while(rs.next()){ %>
	
	<tr>
		<td><%=rs.getString("ename")%></td>
		<td><%=rs.getString("job")%></td>
		<td><%=rs.getString("sal")%></td>
	
	
	</tr>
	
	
	<%	}
	%>
	
</table>
<!--  스테이트먼트는 sql을 쿼리문안에 넣고, 프리페어스테이트먼트는 스테이트먼트 뒤에 -->	
<!-- 
/*out.println(rs.getString("ename")+"<br/>");


  는 JSP 페이지에서 표현식(Expression)을 사용하는 구문입니다.
이 구문은 JSP 페이지에서 Java 코드의 결과를 출력하는데 사용됩니다. 
구체적으로는 out.print() 메서드를 사용하는 것과 동등합니다.

예를 들어,   는
데이터베이스에서 가져온 ResultSet 객체(rs)의 "ename" 열의 값을 출력합니다. 
이는 JSP 페이지에서 동적으로 생성된 데이터를 HTML에 삽입하여 클라이언트에게 표시하는 데 사용됩니다.
아래는 간단한 설명입니다:
 : 표현식 태그로, JSP 페이지에서 Java 코드의 결과를 출력하는 역할을 합니다.
rs.getString("ename"): ResultSet 객체인 rs에서 "ename"
열의 값을 가져오는 메서드 호출입니다.
이를 통해 JSP 페이지는 동적으로 데이터를 생성하고 웹 페이지에 출력할 수 있습니다. 
이러한 표현식을 사용함으로써 HTML 코드와 Java 코드를 쉽게 통합할 수 있습니다.*/
 -->	
</body>
</html>