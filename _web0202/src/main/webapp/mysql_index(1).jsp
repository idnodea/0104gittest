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
    
	Class.forName("com.mysql.cj.jdbc.Driver");

    try ( 
        Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/firm", "root", "mysql");
    		
    ) {
    	
        out.println("DB 접속 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
<h1>학생 성적 정보</h1>
<button onclick="location.href='mysql_List.jsp'" >성적 목록</button>
<button onclick="location.href='mysql_Insert.jsp'">성적 입력</button>



</body>
</html>