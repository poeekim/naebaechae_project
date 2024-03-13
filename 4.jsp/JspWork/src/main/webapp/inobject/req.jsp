<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-13
  Time: AM 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>내장 객체의 개요 및 사용법(request)</title>
</head>
<body>
    <h2>
        1. 서버의 도메인이름 : <%=request.getServerName() %><br>
        2. 서버의 포트번호 : <%=request.getServerPort() %><br>
        3. ★ 요청한 URL 에서의 경로 : <%=request.getRequestURL() %><br>
        4. ★ 요청한 URI 에서의 경로 : <%=request.getRequestURI() %><br>
        5. ★ 접속한 원격 주소 : <%=request.getRemoteAddr() %><br>
        6. 클라이언트가 요청한 프로토콜 : <%=request.getProtocol() %><br>
        7. ★ 요청방식(get or post) : <%=request.getMethod() %><br>

    </h2>
</body>
</html>
