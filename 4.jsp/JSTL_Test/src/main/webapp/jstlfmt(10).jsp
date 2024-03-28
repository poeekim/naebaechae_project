
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <title>날짜, 시간, 숫자 출력양식</title>
</head>
<body>
<%--
    언어 표시
    setLocale 액션 -> value ="언어-국가명"
    ex. ko-KR , js-JP, en-US
--%>
<fmt:setLocale value="ko-KR" />
<h1>
    <%-- 숫자, 통화, 퍼센트 단위
        value = "출력할 값" type="number/currency/percent"
    --%>
    number : <fmt:formatNumber value="9876543.61" type="number"/><br>
        currency : <fmt:formatNumber value="9876543.61" type="currency"/><br>
        percent : <fmt:formatNumber value="9876543.61" type="percent"/><br>
        pattern : ".0000"   -> <fmt:formatNumber value="9876543.61" pattern=".0000"/><br>
        pattern : "#,#00.0#"   -> <fmt:formatNumber value="9876543.61" pattern="#,#00.0#"/><br>
    <%--
    사용자 정의 형식 포맷으로 지정하고 싶을 시,
    patter="설정할 타입포맷 지정"

    <c:set var="now" value="<%=new java.util.Date()%>" />
    --%>
    <hr>
    <jsp:useBean id="now" class="java.util.Date"/>
    date : <fmt:formatDate value="${now}" type="date"/><br>
    time : <fmt:formatDate value="${now}"  type="time"/><br>
    both : <fmt:formatDate value="${now}"  type="both"/><br>

    <%--
    - 날짜를 세부적으로 설정 : dateStyle
    - 시간만 세부적으로 설정 : timeStyle
    - medium과 같다 : default
    - long<full> : 요일이 출력(대한민국 표준시 한글로 표시)
    --%>
    <hr>
    default : <fmt:formatDate value="${now}" type="both" dateStyle="default" timeStyle="default"/><br>
    short : <fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short"/><br>
    medium : <fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium"/><br>
    long : <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long"/><br>
    full : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>
    pattern : "yy년 MM월 dd일(HH시 mm분 ss초)" <fmt:formatDate value="${now}" type="both"  pattern="yy년 MM월 dd일(HH시 mm분 ss초)"/><br>

</h1>
</body>
</html>
