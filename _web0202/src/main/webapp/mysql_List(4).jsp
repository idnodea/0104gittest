<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width: 400px; text-align: center; }
        th { background-color: cyan; }
    </style>    
</head>
<body>

<table border="1">
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
<%
    try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/firm";
        String id = "root";
        String pass = "mysql";

        try (Connection conn = DriverManager.getConnection(url, id, pass)) {
            String sql = "SELECT * FROM score";
            
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {
                
                while (rs.next()) {
                    int num = rs.getInt("num");
                    String name = rs.getString("name");
                    int kor = rs.getInt("kor");
                    int eng = rs.getInt("eng");
                    int math = rs.getInt("math");
                    
                    int sum = kor + eng + math;
                    float average = (float)sum / 3;
%>          
                    <tr>
                        <td><%= num %></td>
                        <td><%= name %></td>
                        <td><%= kor %></td>
                        <td><%= eng %></td>
                        <td><%= math %></td>
                        <td><%= sum %></td>
                        <td><%= String.format("%.2f", average) %></td>
                    </tr>
<%                  
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</table>

</body>
</html>