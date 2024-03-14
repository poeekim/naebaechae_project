<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> 쿠키 확인하기 </title>
</head>
<body>
<h2> 웹 브라우저에서 저장된 쿠키를 가져오는 예제 </h2>
<%
    Cookie[] cookies = request.getCookies(); // 저장된 모든 쿠키값 가져오기
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("mycookie")) { %>
                cookiesname : <%=cookies[i].getName() %>
                cookiesvalue : <%=cookies[i].getValue() %>
<%
            }
        }
    }
%>
</body>
</html>
