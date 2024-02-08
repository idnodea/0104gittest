<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<button onclick="location.href='mysql_index(1).jsp'" >첫 화면으로</button>
<table class="table1">
    <tr>
        <th class="th1">번호</th>
        <th class="th1">이름</th>
        <th class="th1">국어</th>
        <th class="th1">영어</th>
        <th class="th1">수학</th>
        <th class="th1">총점</th>
        <th class="th1">평균</th>
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
                
                // 최고점수에 해당하는 name을 저장할 변수
                String highestScorerName = "";
                // 최고점수를 저장할 변수
                int maxScore = Integer.MIN_VALUE;

                while (rs.next()) {
                    int num = rs.getInt("num");
                    String name = rs.getString("name");
                    int kor = rs.getInt("kor");
                    int eng = rs.getInt("eng");
                    int math = rs.getInt("math");
                    
                    int sum = kor + eng + math;
                    float average = (float)sum / 3;

                    // 최고점수 계산
                    if (sum > maxScore) {
                        maxScore = sum;
                        highestScorerName = name;
                    }
%>          
                    <tr class="tr1">
                        <td class="td1"><%= num %></td>
                        <td class="td1"><%= name %></td>
                        <td class="td1"><%= kor %></td>
                        <td class="td1"><%= eng %></td>
                        <td class="td1"><%= math %></td>
                        <td class="td1"><%= sum %></td>
                        <td class="td1"><%= String.format("%.2f", average) %></td>
                    </tr>
                   
<%                  
                }
%>
            </table>
            <!-- 최고점수에 해당하는 name 출력 -->
            <table class="table2">
                <tr class="tr2">
                    <th class="th2">최고점수를 기록한 학생</th>
                </tr>
                <tr class="tr3">
                    <td class="td2"><%= highestScorerName %></td>
                </tr>
            </table>
            <br/>
            <!-- 추가된 부분: 나머지 테이블 및 버튼 -->
            <table class="table3">
                <tr class="button-tr">
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >조회</button>
                    </td>
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >신규</button>
                    </td>
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >수정</button>
                    </td>
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >삭제</button>
                    </td>
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >검색</button>
                    </td>
                    <td>
                        <button onclick="location.href='mysql_index(1).jsp'" >종료</button>
                    </td>
                </tr>
            </table>
<%
            }
        }
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
%>

</body>
</html>