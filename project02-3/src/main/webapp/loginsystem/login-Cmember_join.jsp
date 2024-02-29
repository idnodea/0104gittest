<%@page import="dao.BoardDao"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
    request.setCharacterEncoding("utf-8");
    String id = request.getParameter("id");
    String email = request.getParameter("email");
    String name = request.getParameter("name");
    
    Connection conn = null;
    try {
        conn = BoardDao.getConnection();
        
        MemberDao memberDao = MemberDao.getInstance();
        
        if (memberDao.selectForLogin(conn, id, email) != null) {   
            // 이미 있는 아이디이면 오류 표시
%>
            <script>
                alert('이미 등록된 아이디입니다.');
                history.back()
            </script>
<%          
        } else {
            Member member = new Member(id, email, name);
            memberDao.insert(conn, member);
%>
            <script>
                alert('가입이 완료되었습니다.');
                window.close();
            </script>
<%          
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
%>

</body>
</html>