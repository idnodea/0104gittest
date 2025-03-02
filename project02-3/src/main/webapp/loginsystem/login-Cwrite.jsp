<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%



    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    //int num = Integer.parseInt(request.getParameter("num"));
    

	//String id = request.getParameter("id");
	/*if (id.equals(writer)) {
		session.setAttribute("MEMBERID", id);
		
	}*/
	//boolean inc ="";
	
	
    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
//String writer  = "";
// String title   = "";
//String content = "";
    
    
//String email = "";
    
//String action  = "login-Cinsert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
/*if (id == writer) {
MemberDao memberDao = MemberDao.getInstance();
BoardDao boardDao = BoardDao.getInstance();
Member member = memberDao.select(id);
Board board = boardDao.selectOne(num, true);
    	
    	
// 글 데이터를 변수에 저장
id = member.getId();
writer  = board.getWriter();
title   = board.getTitle();
content = board.getContent();

// 글 수정 모드일 때는 저장 버튼을 누르면 UPDATE 실행
action  = "login-Cupdate.jsp?num=" + id;

}*/
%>
<%
    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    //int num = Integer.parseInt(request.getParameter("num"));
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)
                                                : 0;

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String name  = "";
    String title   = "";
    String content = "";
    String action  = "login-Cinsert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {
    	BoardDao dao = BoardDao.getInstance();
    	Board board = dao.selectOne(num, false);
    	
    	// 글 데이터를 변수에 저장
        name  = board.getName();
        title   = board.getTitle();
        content = board.getContent();

		// 글 수정 모드일 때는 저장 버튼을 누르면 UPDATE 실행
		action  = "login-Cupdate.jsp?num=" + num;

    }
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<form method="post" action="<%=action%>">
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title"  maxlength="80"
                       value="<%=title%>">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="name" value="<%=name%>" maxlength="20">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content" rows="10"><%=content%></textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>

</body>
</html>