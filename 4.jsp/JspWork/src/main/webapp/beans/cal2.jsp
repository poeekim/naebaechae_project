
<%@ page contentType="text/html;charset=UTF-8" language="java" import="calc.CalcBean" %>
<!DOCTYPE html>
<jsp:useBean id="ca" class="calc.CalcBean" scope="page" />
<jsp:setProperty name="ca" property="*" />
<% ca.calculate();%>
<html>
<head>
    <title>요청페이지</title>
</head>
<body>
<center>
<h2>계산기</h2><hr>
    <%-- 계산 결과를 홈화면에 보이도록 하는 방법
    1. action 부분을 삭제한다 : 자기가 요청하고 자기가 응답함(삭제하거나, 내 자신을 호출하도록 설정)
    <form method="post" action="calResult2.jsp" name="form1">
    --> <form method="post" name="form1">
     input type 을 submit으로 변경
    <input type="submit" value="계산">
    2. action 부분을 수정한다(내 자신을 호출하도록 수정)
    <form method="post" action="cal.jsp" name="form1">

    --%>
<form method="post" name="form1">
    <input type="text" name="num1" size="20">
    <select name="operator">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select>

    <input type="text" name="num2">
    <p>
    <input type="submit" value="계산">
    <input type="reset" value="다시입력" onclick="reset()">
</form>
    <h3>계산 결과 : <%=ca.getResult()%></h3>
    <jsp:getProperty name="ca" property="result" />
</center>
</body>
</html>
