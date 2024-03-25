
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>jstlcore(3).jsp,jsp(변수(객체))의 사용범위, out태그</title>
</head>
<body>
    <h3>출력문</h3>
    <%--
    str이라는 변수의 출력문 3가지를 작성하시오.
    1) out.println(str)
    2) <%=str%>
    3) ${str}
    out.println(변수명)   <%=변수명%>   ${변수명}

    <c:out(액션태그명) value(속성명)="${출력대상자(el언어와 같이)}" />
    --%>
<h1>
    1+2 = ${1+2} = <c:out value="${1+2}" />
    <%
        System.out.println(1 + 2);

    %> <br>
    <%=1+2%> <br>
    <p><hr>
    <%-- gt : >    lt : < --%>
    1>3 = ${1>3} = <c:out value="${1>3}" /> <br>
    1>3 = ${1 gt 3} = <c:out value="${1 gt 3}" />
    <p><hr>
    <%
        // String name = "hello";
        //session.setAttribute("name", "하늘");
        // el 의 내장객체의 사용범위
        /*
        JSP 내장객체의 사용범위          el의 내장객체의 사용범위
        * page ----------------------> pageScope
        * request -------------------> requestScope
        * seesion -------------------> sessionScope
        * appliaction ---------------> applicationScope
        * */
    %>
    <c:set var="name" value="hello"/> <br>

    <c:set var="name" value="하늘" scope="session"/> <br>
    expression name : <%=session.getAttribute("name")%> <br>

    <%--
    동일명의 변수값은 어떻게 구분하여 출력하는가 -> 저장영역.출력할변수명
    --%>
    1. c:out name = <c:out value="${name}"/><br>
    2. c:out pageScope.name = <c:out value="${pageScope.name}"/><br>
    3. c:out sessionScope.name  = <c:out value="${sessionScope.name}"/><br>
    <hr>
    remove sessionScope value:"name" = <c:remove var="name" scope="session"/><br> <%-- session 의 변수 name 의 값 삭제 --%>

   session의 name 값  = <c:out value="${sessionScope.name}"/><br>  <%-- 위에서 c:remove 로 값을지웠으므로 값이 나오지 않음. --%>




</h1>
</body>
</html>
