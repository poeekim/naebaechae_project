<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="calc.CalcBean" %>
<!DOCTYPE html>
<html>
<head>
    <title>응답페이지</title>
</head>
<body>
<%-- // 방법 1. 클래스를 만들어서 메소드를 호출 cal.Calcbean

<%
    CalcBean ca = new CalcBean();
    ca.setNum1(Integer.parseInt(request.getParameter("num1"))); // "5" -> 5
    ca.setOperator(request.getParameter("operator"));
    ca.setNum2(Integer.parseInt(request.getParameter("num2")));
    ca.calculate(); // 계산 -> result -> calResult.jsp 호출
%>
계산결과 : <%=ca.getResult()%>--%>


 <%-- 방법 2. --%>
<jsp:useBean id="ca" class="calc.CalcBean" scope="page" />
<jsp:setProperty name="ca" property="*" />
<% ca.calculate();%>
<hr>
<%--<jsp:getProperty name="ca" property="num1" />
<jsp:getProperty name="ca" property="num2" />
<jsp:getProperty name="ca" property="operator" />--%>
<br>
<h3>계산 결과 : <%=ca.getResult()%></h3>
<jsp:getProperty name="ca" property="result" />

</body>
</html>
