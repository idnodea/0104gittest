<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String numU = "";
String nameU = "";
String korU = "";
String engU = "";
String mathU = "";

Class.forName("oracle.jdbc.driver.OracleDriver");
try ( 
    Connection conn = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from score where num = "
                             + request.getParameter("num"));
) {
    if (rs.next()) {
    	numU = rs.getString("num");
    	nameU = rs.getString("name");
    	korU = rs.getString("kor");
    	engU = rs.getString("eng"); 
    	mathU = rs.getString("math");
    }


} catch(Exception e) {
   System.out.println("오류!");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        table { width: 400px; text-align: center; }
        th    { background-color: cyan; }
	</style>
</head>
<body>
<form method="post" id="frm">
번호<input type="text" name="num" value="<%=numU %>"/><br/>
이름<input type="text" name="name" value="<%=nameU %>"/><br/>
국어<input type="text" name="kor" value="<%=korU %>"/><br/>
영어<input type="text" name="eng" value="<%=engU %>"/><br/>
수학<input type="text" name="math" value="<%=mathU %>" /><br/>
</form>
<button onclick="insert()">입력</button>
<button onclick="update()">수정</button>
<button onclick="clean()">초기화</button>
<table>
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th><th>삭제</th>
    </tr>
<%
    
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score");
    ) {
        while (rs.next()) {
        	int num = rs.getInt("num");
        	String name = rs.getString("name");
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>          
            <tr>
                <td><a href="index.jsp?num=<%=num %>"><%=num %></a></td>
                <td><a href="index.jsp?num=<%=num %>"><%=name %></a></td>
                <td><%=rs.getInt   ("kor" )%></td>
                <td><%=rs.getInt   ("eng" )%></td>
                <td><%=rs.getInt   ("math")%></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
                <td><a href="delete.jsp?num=<%=num %>">삭제</a></td>
            </tr>
<%          
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</table>
<script>
function insert() {
	document.getElementById('frm').action='insert.jsp';
	document.getElementById('frm').submit();
}
function update() {
	document.getElementById('frm').action='update.jsp';
	document.getElementById('frm').submit();
}
function clean() {
	var el = document.getElementById('frm');
	for(var i=0; i<el.length; i++){
		el[i].value = '';
	}

}
</script>
</body>
</html>