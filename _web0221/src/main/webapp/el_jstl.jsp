<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"    
%>
<%
	request.setAttribute("name", "홍길동"); //연습용포워딩,포워딩된 것으로 가정
	request.setAttribute("arr2", new int[]{1,2,3,4,5});
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${intArray = [10,20,30,40,50 ]}<br/>
	<c:forEach var="iy" items ="${arr2}" varStatus="st">
	${iy}: ${st.index} : ${st.count }<br/>
	</c:forEach>
-------<br/>	
	${intArray = [10,20,30,40,50 ]}<br/>
	<c:forEach var="io" items ="${intArray }" varStatus="st">
	${io}: ${st.index} : ${st.count }<br/>
	</c:forEach>
-------<br/>	
	<c:forEach var="i" begin="1" end="10">
	${i;''}
	</c:forEach>
	
	${sm=0; ''}
	<c:forEach var="vv" begin="1" end="10">
	${sm = sm + vv; ''}
	</c:forEach>	
	1~10까지의 합의 결과: ${sm }<br/>
	
	${sm2=0; ''}
	<c:forEach var="vv" begin="0" end="10" step="2">
	${sm2 = sm2 + vv; ''}
	</c:forEach>
	0~10까지의 짝수들의 합의 결과: ${sm2 }<br/>
	
	
	

	${name }<br/>
	${aaa = '3.14'; ''}<br/>
	${aaa = 100 }<br/>
	${aaa = aaa+10} }<br/>
	${"10"+1 }<br>
	${null+10 }<br/>
	${null+null }<br/>
	
</body>
</html>