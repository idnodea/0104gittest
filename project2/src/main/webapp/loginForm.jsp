<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 로그인 화면</title>
<style type="text/css">
@charset="utf-8";
*{margin: 0; padding: 0;
}

button{
	flex:left;
	color: black; border-radius: 5px;
	background: red;
}
input{
	width:100%;
}

.account{

}
.write{
	width: 100%;
}
.button{
	margin: 10px 10px;
}
#divid{
	
}
#divemail{
	
}
#login{
	background: red; color: white;
}
</style>
</head>
<body>
<div>
	<form action="login.jsp" method="post">
		<div class="account" id="divid">
			<label>아이디:</label><input type="text" class="write" name="id">
		</div>
		<div class="account" id="divemail">
			<label>이메일:</label><input type="text" class="write" name="email">
		</div>		
			<div class="button">
				<button type="submit" id="login">로그인</button>
			</div>
				
	</form>
</div>
</body>
</html>