<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, "scott", "tiger");
    %>

    <a href="index.jsp">처음으로</a>

    <%
        // Section 1: Display update form
        String sqlSelect = "SELECT ename, job, sal FROM emp1 WHERE ename = ?";
        PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
        pstmtSelect.setString(1, request.getParameter("ename"));
        ResultSet rs = pstmtSelect.executeQuery();

        String ename = "";
        String job = "";
        String sal = "";

        if(rs.next()){
            ename = rs.getString("ename");
            job = rs.getString("job");
            sal = rs.getString("sal");
        }
    %>

    <form action="update.jsp" method="post">
        이름<input type="text" name="ename" value="<%=ename%>"/><br/>
        직무<input type="text" name="job" value="<%=job%>"/><br/>
        월급<input type="text" name="sal" value="<%=sal%>"/><br/>
        <input type="submit" value="수정"/>
        <input type="reset" />
    </form>

    <%
        // Section 2: Process form submission and update data
        String sqlUpdate = "UPDATE emp1 SET job=?, sal=? WHERE ename=?";
        PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);
        pstmtUpdate.setString(1, request.getParameter("job"));
        pstmtUpdate.setString(2, request.getParameter("sal"));
        pstmtUpdate.setString(3, request.getParameter("ename"));
        
        int resultUpdate = pstmtUpdate.executeUpdate();
        
        if (resultUpdate == 1) {
            out.println("수정 성공!");
        }
    %>

</body>
</html>