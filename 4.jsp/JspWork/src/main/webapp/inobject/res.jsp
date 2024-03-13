<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-13
  Time: AM 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response (응답객체)</title>
</head>
<body>
<%
    // 서블릿에서 처음 시작시 처리해 주는 메소드
    //response.setContentType("text/html;charset=UTF-8");
   // response.sendRedirect("https://www.naver.com");
    response.sendRedirect("/req.jsp");
%>
<script>
    //location.href = "https://www.daum.net"; // 객체명.속성명 = 값
    //location.href="http://www.empas.com";
</script>
</body>
</html>
