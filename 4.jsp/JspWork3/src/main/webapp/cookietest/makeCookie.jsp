<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-14
  Time: PM 4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>쿠키생성</title>
</head>
<body>
<%
    // 쿠키이름, 저장할 값설정 -> 쿠키생성 -> 접속자에게 전송 -> 추후 사이트 접속 시 빠르게 접속됨
    String cookiname = "mycookie";
    // 1. 쿠키객체생성(1. 쿠키명  2. 저장할값)
    Cookie c = new Cookie(cookiname, "테스트김"); // 저장할값(한글가능)
    // 2. 쿠키값을 컴퓨터에 전송하기 전에 설정(2분동안 쿠키저장)
    c.setMaxAge(60 * 2); // 2분 -> 60초 * 60분 * 24시간 * 365 = 1년동안 보관
    // c.setValue("바뀌나");
    response.addCookie(c); // addCookie(전송할 쿠키 객체명)
%>
<h1> 쿠키 생성 예제 </h1>
<p>쿠키생성됐다<br>
    쿠키내용은 <a href="useCookie.jsp">여기에서 확인</a>
</body>
</html>
