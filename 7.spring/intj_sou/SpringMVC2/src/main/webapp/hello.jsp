<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello.jsp</title>
</head>
<body bgcolor="#ff4500">
<h2> <%=request.getAttribute("message") %> </h2>
<h2>world.jsp ${message}세상!! 환영 !!</h2>
</body>
</html>