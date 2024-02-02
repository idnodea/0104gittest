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
    
    try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/firm", "root", "mysql");
         PreparedStatement pstmt = conn.prepareStatement("")) {
        
        String[][] score = {
            { "1", "홍길동", "50", "60", "70" }, 
            { "2", "이순신", "65", "75", "85" }, 
            { "3", "강감찬", "60", "80", "70" }
        };
        
        for (int i = 0; i < score.length; i++) {
            String sql = String.format(
                "insert into score values (?, ?, ?, ?, ?)");

            pstmt.setInt(1, Integer.parseInt(score[i][0]));
            pstmt.setString(2, score[i][1]);
            pstmt.setInt(3, Integer.parseInt(score[i][2]));
            pstmt.setInt(4, Integer.parseInt(score[i][3]));
            pstmt.setInt(5, Integer.parseInt(score[i][4]));

            pstmt.executeUpdate();
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>