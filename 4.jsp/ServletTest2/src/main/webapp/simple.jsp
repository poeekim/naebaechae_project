
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>simple</title>
</head>
<body>
<%
    //  request.setAttribute("result", resultObject); // Object 로 저장
    // request.getAttribute("result") 키명 == ${키명} 과 동일
%>
<h2> 처리결과 : <%=request.getAttribute("result")%></h2>
<h2> 처리결과 : ${result}</h2>

</body>
</html>
