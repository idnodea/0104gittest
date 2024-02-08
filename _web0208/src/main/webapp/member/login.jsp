<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "util.Cookies" %>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
    boolean login = false;
    //System.out.println(pw);
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //String sql="select count(*) as cnt from score where num = ? and name = ? ";
    String sql="select count(*) as cnt from score where num = ? and name = ? ";
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        
    		
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	
    ) {
    	pstmt.setInt(1, Integer.parseInt(id));
        pstmt.setString(2, pw);
        ResultSet rs = pstmt.executeQuery();
		
         rs.next();   //next()가 null일 수가 없으니까.  0이면 모를까
         int res= rs.getInt("cnt");  //별칭써도 괜찮음
        // System.out.println(res);
         
         if(res == 1){
        	login = true;
         }
         
    } catch(Exception e) {
       System.out.println("오류!");
       e.printStackTrace();
    }

	if (login) {
		
		response.addCookie(
			Cookies.createCookie("AUTH", id, "/", -1)
			//쿠키이름,쿠키값  쿠키이름은 고정으로 정하자
		);
		response.sendRedirect("index.jsp");
%>
<html>
<head><title>로그인성공</title></head>
<body>


</body>
</html>
<%
	} else { // 로그인 실패시
%>
<script>
alert("로그인에 실패하였습니다.");
history.go(-1);
</script>
<%
	}
%>
