<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        Statement stmt = conn.createStatement();
    ) {
        String sql = 
                "CREATE TABLE score (" + 
                "    num INT PRIMARY KEY," + 
                "    name VARCHAR(20)," +
                "    kor INT, " +
                "    eng INT, " +
                "    math INT" +    
                ")";
        stmt.executeUpdate(sql);
        out.println("성적 테이블 생성 성공 !");
    } catch(SQLException e) {
        e.printStackTrace();
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>