
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>ifTag(4).jsp</title>
</head>
<body>
<%
    //int age = 20;
    //String name = "bk";
    // if(age>19) ---> <c:if test ="${조건식(el로 표시한다)}" > 내용 </c:if>
%>

<c:set var="age" value="${20}"/>

<%--<c:set var="name" value="bk" />--%>
<c:set var="name" value="${'bk'}" />

<c:if test="true" >무조건 실행이 되는 구문<br>
    <c:if test="${19 <age}">
        19살 이상임.
    </c:if>
    <p>
    <%-- if 문 태그에서 문자열을 비교하는 경우 --%>
    <c:if test="${name=='bk'}">
        name 의 값은 ${pageScope.name}
        입니다. <br>
    </c:if>
        <%-- c:if 액션태그에서는 else 구문이 없어서 아래와 같이 조건문같이 부정조건문을 선언해줘야함. --%>
        <c:if test="${name!='bk'}">
        name 의 값은 ${pageScope.name} 입니다. <br>
        </c:if>
</c:if>



</body>
</html>
