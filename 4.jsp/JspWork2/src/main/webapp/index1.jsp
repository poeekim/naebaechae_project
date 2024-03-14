<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-13
  Time: PM 4:37
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>페이지 전달용</title>
</head>
<body>
<%-- 액션태그 또는 표현식에 주석을 달 때 사용.

     jsp.param   name = "전달할 매개변수명"  value="전달할값"

     CONTROL 매개변수 : 전달할 페이지 이름을 뜻함.
     PAGENUM 매개변수 : 전달할 페이지의 번호 -> intro_01.jsp(body쪽에)

     url : /view/indexControl.jsp?매개변수명=값&매개변수명2=값2&...
            /view/indexControl.jsp?CONTROL="intro"&PAGENUM="01"
--%>

<jsp:forward page="/view/indexControl.jsp">
    <jsp:param name="CONTROL" value="intro" />
    <jsp:param name="PAGENUM" value="01" />
</jsp:forward>
</body>
</html>
