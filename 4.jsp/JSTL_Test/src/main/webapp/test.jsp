
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <title>출력확인</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");

%>
 입력 받은 이름 : <%=request.getParameter("name")%>
 이름은(el 내장객체를 이용) ${param.name}


</body>
</html>
