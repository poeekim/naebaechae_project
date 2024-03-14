<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-13
  Time: PM 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>요청2. sub.jsp</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
    %>
    <b><%=name %>님. 환영합니다.</b>
</body>
</html>
