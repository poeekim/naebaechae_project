<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>매개변수를 전달2</title>
</head>
<body>
<%
   request.setCharacterEncoding("utf-8");
   String name=request.getParameter("name");//이름
   String age=request.getParameter("age");//나이
   String addr=request.getParameter("addr");//주소
%>
<%=name%>님 jQuery Ajax 환영합니다.!<br>
 나이는 <%=age %>이고, 주소는 <%=addr %> 이군요!
</body>
</html>
