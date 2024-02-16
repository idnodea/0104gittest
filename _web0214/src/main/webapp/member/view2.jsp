<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<!-- 챗GPT -->
<%
String memberId = (String)session.getAttribute("MEMBERID");
if (memberId == null) {
	response.sendRedirect("sessionLoginForm.jsp");
}

BoardDao dao = BoardDao.getInstance();

int num = 0; // 초기값 설정
String numParam = request.getParameter("num");
if (numParam != null && !numParam.isEmpty()) {
    try {
        num = Integer.parseInt(numParam);
    } catch (NumberFormatException e) {
        // "num" 매개변수의 값이 정수로 변환할 수 없는 경우에 대한 예외 처리
        e.printStackTrace(); // 또는 다른 처리 방법을 선택하세요
    }
}

Board board = null;
if (num != 0) {
    board = dao.selectOne(num);
}
%>
   <!-- 생각하던 부분  -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td><%= (board != null) ? board.getTitle() : "" %></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><%= (board != null) ? board.getWriter() : "" %></td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td><%= (board != null) ? board.getRegtime() : "" %></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%= (board != null) ? board.getHits() : "" %></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%= (board != null) ? board.getContent() : "" %></td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<%
if (board != null) {
%>
<input type="button" value="수정"
       onclick="location.href='write.jsp?num=<%= board.getNum() %>'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=<%= board.getNum() %>'">
<%
}
%>

</body>
</html>