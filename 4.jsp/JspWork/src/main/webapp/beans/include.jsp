<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-13
  Time: PM 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>포함을 하는 페이지1</title>
    <%
        request.setCharacterEncoding("utf-8"); // 한글 인코딩
    %>

    <jsp:include page="sub.jsp" flush="false"/>
<%--    <%
        String name = request.getParameter("name");
    %>
    <b><%=name %>님. 환영합니다.</b>--%>
    <br> 나머지는 sub.jsp 가 알아서 해줄 예정~~~~~~
</head>
<body>

</body>
</html>
