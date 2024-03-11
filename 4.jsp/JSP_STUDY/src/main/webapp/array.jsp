<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배열의 값을 출력(array.jsp)</title>
</head>
<body>
	<%
	// 스크립트릿(태그 사용 X, 표현식 사용 x) 표현식을 알고 있는지 물어보는 예제
	// 뭔말이야
	String keyword[] = {"scriptlet","expression","declaration"}; %>
	<table border = "1">
	<%
	for(int i =0; i<keyword.length;i++) { %>
	<tr>
		<td><%=i %></td>
		<td><%=keyword[i] %></td>
	</tr>
	<% } %>
	 </table> 
%>
</body>
</html>