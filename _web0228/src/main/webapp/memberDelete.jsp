<%@page import="mvjsp.board.dao.MemberDao"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");

String memberno = request.getParameter("memberno");
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getInstance();
dao.delete(conn, Integer.parseInt(memberno));

response.sendRedirect("list.jsp");
%>    
    