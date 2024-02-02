<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<%
    
	Class.forName("oracle.jdbc.driver.OracleDriver");

    try ( 
        Connection conn = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe", "scott","tiger");
    		
    ) {
    	
        out.println("DB 접속 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
<h1>사원 정보</h1>
<button onclick="location.href='select2.jsp'" >사원 목록</button>
<button onclick="location.href='insertForm.jsp'">사원 입력</button>


</body>
</html>
