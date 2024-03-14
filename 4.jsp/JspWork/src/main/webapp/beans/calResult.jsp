<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="calc.CalcBean" %>
<!DOCTYPE html>
<html>
<head>
    <title>요청페이지</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String operator = request.getParameter("operator");
    //System.out.println("operator = " + operator);

%>

<jsp:useBean id="cc" class="calc.CalcBean" scope="page" />
<jsp:setProperty name="cc" property="*"/>
<hr>
<jsp:getProperty name="cc" property="num1" />
<jsp:getProperty name="cc" property="num2" />
<jsp:getProperty name="cc" property="operator" />
<br>
<center>
    <h2>계산기</h2>
    <hr>
    <form method="post" action="calResult.jsp" name="form1">
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
            <input type="submit" value="다시입력" onclick="reset()">
    </form>
    <hr>
    <h3>계산 결과 : <%=cc.calculator(operator)%></h3>
</center>
</body>
</html>
