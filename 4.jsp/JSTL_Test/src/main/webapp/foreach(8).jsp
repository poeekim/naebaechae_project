<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
    java.util.HashMap mapData = new java.util.HashMap();
    mapData.put("name", "홍길동");
    mapData.put("today", new java.util.Date()); // 날짜객체

%>

<c:set var="intArray" value="<%=new int[]{1,2,3,4,5}%>" />
<%-- map이라는 변수도 주소를 가진 동일한 객체로(객체명은 다르지만, 주소는 같다)
    같은 객체를 의미한다.
    --%>
<c:set var="map" value="<%=mapData%>"/>

<html>
<head>
    <title>foreach(8).jsp</title>
</head>
<body>
    <%
        // 1~100 까지의 합 중에서 홀수값을 출력하시오.
        int sum = 0;
        for (int i = 1; i <= 100; i+=2) { // c:forEach var="초기변수명" begin="시작값" end="종료값" step="증가치(default step=1)"
            sum+= i; // sum = sum+1;  -> 같은 변수를 2번선언, 수정의 의미로 받아들여짐
        }
        System.out.println(sum);
    %>
    <h3> 1~100 사이의 홀수들의 합 </h3><br>
    <c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="100" step="2">
    <c:set  var="sum" value="${sum+i}"/>
</c:forEach>
    결과 값 : ${sum}<br>
<hr>
결과값 2 : <c:out value="${sum}"/>
<hr>
    <hr>
<h4>배열의 값, 컬렉션의 값을 출력(확장 for문)</h4>
<%--
<c:set var="intArray" value="<%=new int[]{1,2,3,4,5}%>" />

forEach 로 생성된 객체를 가져올 때 items="${외부에서 불러올 객체명}" 을 이용한다.

--%>
    <c:forEach var="i" items="${intArray}" begin="2" end="4">
        <h2>[${i}]</h2>
    </c:forEach>
<hr>
    <h3>Map(key,value) 의 값</h3>

<%--
외부에서 생성된 객체 map 를 가져오기 위해선 ${map} 으로 가져와야함.
for(출력할 변수명 : 컬렉션 객체명)

var = "객체명"     items = "배열 또는 컬렉션 객체명"

<c:forEach var="obj" items="${map}">
--> HashMap 타입의 객체인 map 에서 하나씩 꺼낸 각각의 객체를 의미하는 obj.
    key, value 값은 HashMap 객체에서 가지고 있는 기본 속성명.

--%>
<c:forEach var="obj" items="${map}">
    <h3>${obj.key} = ${obj.value}</h3>

</c:forEach>

</body>
</html>
