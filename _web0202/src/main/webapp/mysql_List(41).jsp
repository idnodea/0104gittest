<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        .table1 { width: 600px; text-align: center; border-collapse: collapse; }
        .th1 { border: 1px solid black; padding: 8px; background-color: cyan; }
        .td1 { border: 1px solid black; padding: 8px; } 
        .table2 { width: 600px; text-align: center; border-collapse: collapse; }
        .th2 { border: 1px solid black; padding: 8px; background-color: yellow; }
        .td2 { border: 1px solid black; padding: 8px; } 
        .table3 { width: 600px; text-align: center; border-collapse: collapse; }
        .button-tr { width: 600px; text-align: center; border-collapse: collapse; }
        .button-tr button { padding: 8px; margin: 5px; }
    </style>    
</head>
<body>

<%
    // 필드 선언
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/firm";
        String id = "root";
        String pass = "mysql";

        conn = DriverManager.getConnection(url, id, pass);

        String sql = "SELECT * FROM score";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();

        // 메소드: 특정 과목의 최고점수를 가져오기
        int getMaxScore(String subject) {
            int maxScore = 0;
            try {
                String maxScoreSql = "SELECT MAX(" + subject + ") AS max_score FROM score";
                try (PreparedStatement maxScoreStmt = conn.prepareStatement(maxScoreSql);
                     ResultSet maxScoreRs = maxScoreStmt.executeQuery()) {
                    if (maxScoreRs.next()) {
                        maxScore = maxScoreRs.getInt("max_score");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return maxScore;
        }

%>

<button onclick="location.href='mysql_index(1).jsp'" >첫 화면으로</button>
<table class="table1">
    <!-- ... 이전 내용은 그대로 유지 ... -->
</table>
<table class="table2">
    <tr class="tr2">
        <th class="th2">국어 최고점수</th>
        <th class="th2">영어 최고점수</th>
        <th class="th2">수학 최고점수</th>
        <th class="th2">전체 평균점수</th>  	
    </tr>
    <tr class="tr3">
        <!-- 최고점수를 적절히 계산하여 출력하는 부분 수정 -->
        
        <!-- 위 try구문에서의 kor의 최고점수 -->
        <td class="td2"><%= getMaxScore("kor") %></td>
        <!-- 위 try구문에서의 eng의 최고점수 -->
        <td class="td2"><%= getMaxScore("eng") %></td>
        <!-- 위 try구문에서의 math의 최고점수 -->
        <td class="td2"><%= getMaxScore("math") %></td>

        <!-- 전체평균을 num의 숫자만큼 나눈 값이 나오게끔 -->
        <td class="td2">
            <%
                try {
                    String avgSql = "SELECT AVG(kor + eng + math) AS total_avg FROM score";
                    try (PreparedStatement avgStmt = conn.prepareStatement(avgSql);
                         ResultSet avgRs = avgStmt.executeQuery()) {
                        if (avgRs.next()) {
                            int totalAvg = avgRs.getInt("total_avg");
                            out.print(String.format("%.2f", totalAvg / num));
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            %>
        </td>
    </tr>
</table>

<%
    // Finally, close the resources in a separate block
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>

</body>
</html> --%>