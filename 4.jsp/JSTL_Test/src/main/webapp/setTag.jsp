
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%
    // int num1 =20;
    //double num2 = 10.5;
    //java.util.Date today = new java.util.Date(); // 객체도 변수
%>--%>

<%--
    <c:set(액션태그명) var="변수명" value="값" scope="사용범위" />
    -> value 속성값에 저장되는 값에 따라 자동적으로 자료형이 결정된다.

--%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="num1" value="20" scope="page"/>
<c:set var="num2" scope="page">
    10.5
</c:set>
<c:set var="today" value="<%=new java.util.Date()%>" />
<hr>
변수 num1 = ${num1} <br>
변수 num2 = ${num2} <br>
num1 + num2 = ${num1 + num2} <br>
오늘 날짜 : ${today} <p>
</body>
</html>
