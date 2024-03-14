
<%@ page contentType="text/html;charset=UTF-8" language="java" import="calc.CalcBean" %>
<!DOCTYPE html>
<html>
<head>
    <title>요청페이지</title>
</head>
<body>
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
    <input type="reset" value="다시입력" onclick="reset()">
</form>
    <hr>
    <h3>계산 결과 : </h3>
</center>
</body>
</html>
