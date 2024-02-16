<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	boolean login = false;
	//id.equals(password)->
	session.setAttribute("MEMBERID", id);
	Class.forName("com.mysql.cj.jdbc.Driver");
	String sql="select count(*) from board where num = ? and writer = ? ";
	
	//mysql접속 후, 로그인 체크
	

	     try(
	    		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");	
	    		 PreparedStatement pstmt = conn.prepareStatement(sql);
	    		 
	    		 //String sql="select count(*) as cnt from board where num = ? and writer = ? ";
	    		
	    		 
	    	){
	    	 try(ResultSet rs = pstmt.executeQuery()) {
	 			rs.next();
	 			if (rs.getInt(1) == 1) {  // 로그인 성공 조건
	 				login = true;
	 			}
	 		}catch(SQLException e) {
	 			e.printStackTrace();
	 		}
	    	 
	    	 
	    	 pstmt.setString(1, id);
	 	     pstmt.setString(2, password);
	         ResultSet rs = pstmt.executeQuery();
	         rs.next();
	        
	        
	        // int res= rs.getInt("cnt");  //별칭써도 괜찮음   
	         //int res= rs.getInt(1);  //별칭써도 괜찮음   
	         
	         if(rs.getInt(1) == 1){  //로그인 성공조건
	         	login = true;
	          }
	     }
	     
	     catch(SQLException e){
	  		System.out.println("오류!");
	        e.printStackTrace();
	     }
	     
	     if (login){
	    	 
	    	 session.setAttribute("MEMBERID", id);
	     }
	     //if (login) {
	 		
	 		//response.addCookie(
	 			//Cookies.createCookie("AUTH", id, "/", -1)
	 			//쿠키이름,쿠키값  쿠키이름은 고정으로 정하자
	 		//);
	 		//response.sendRedirect("sessionloginForm.jsp");  
	     //}
%>
<html>
<head>
<title>로그인성공</title>
</head>
<body>로그인에 성공했습니다.

</body>
</html>
<%
	//} else { // 로그인 실패시
%>
<script>
	alert("로그인에 실패하였습니다.");
	history.go(-1);
</script>
<%
	//}
%>
