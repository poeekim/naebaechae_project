
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>catch(7).jsp</title>
</head>
<body>

<%
    /*
    try {
        실행구문(에러가 발생할 가능성이 있는 문장)
    } catch (Exception e) {
        e.getMessage()
    }
    == <c:catch var="예외처리객체명"> 예외처리 내용 </c:catch>
    */
%>
<h1>
    <c:catch var="ex">
        name 매개변수 : <%=request.getParameter("name")%>
        <%
            if (request.getParameter("name").equals("test")) { %>
               ${param.name} 은 test입니다.<br>
           <% }%>
    </c:catch>
<%--    <c:if test="${ex!=null}">--%>

    <c:if test="${not empty ex}">
    예외발생 <br>
        ${ex}
    </c:if>
</h1>
</body>
</html>
