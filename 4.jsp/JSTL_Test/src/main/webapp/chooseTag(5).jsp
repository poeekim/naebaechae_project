
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>chooseTag(5).jsp</title>
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
        name 의 값은 ${pageScope.name} 입니다. <br><p>
        </c:if>
</c:if>
<%--
    다중 if 조건식        else if... switch~case
    <c:choose>
        <c:when test="조건식1(el)">
            수행 문장1
        </c:when>
        <c:when test="조건식2(el)">
            수행 문장2
        </c:when>
        ,,,
        <c:otherwise>
            위의 조건에 해당하지 않는 경우
        </c:otherwise>
    </c:choose>

        el의 내장객체(param)
        param.name2 == request.getParameter("name2") 같은 문장.

        chooseTag(5).jsp?name2=bk
        chooseTag(5).jsp?age2=20
--%>
    <c:choose>
            <c:when test="${param.name2=='bk'}">
                <h1>name2 의 파라미터 값 = ${param.name2}</h1>
            </c:when>
            <c:when test="${param.age2>=19}">
                <h1>당신의 나이는 19세 이상</h1>
            </c:when>
            <c:otherwise>
                <li>
                    당신은 bk 도 아니고, 19세 이상이 아님.
                </li>

            </c:otherwise>
            </c:choose>



</body>
</html>
