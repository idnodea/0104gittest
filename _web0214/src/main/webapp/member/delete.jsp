<%@ page import="dto.Board" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.BoardDao" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String memberId = (String) session.getAttribute("MEMBERID");
    if (memberId == null) {
        response.sendRedirect("sessionLoginForm.jsp");
    } else {
        int num = Integer.parseInt(request.getParameter("num"));
        BoardDao dao = BoardDao.getInstance();
        dao.delete(num);
        response.sendRedirect("list.jsp");
    }
%>
