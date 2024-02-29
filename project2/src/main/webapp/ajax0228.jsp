<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="target" style="width: 600px; height: 560px; border: solid 1px black;">
    </div>
    <button type="button" onclick="getFromServer()">GET DATA</button>

    <script>
        function getFromServer() {
            const xhttp = new XMLHttpRequest();
            xhttp.onload = function () {
                document.getElementById("target").innerHTML =
                    this.responseText;
            }
            xhttp.open("GET", "list2.jsp");
            xhttp.send();
        } //리스트.jsp파일과 같은 위치에 있을 것
    </script>
</body>
</html>