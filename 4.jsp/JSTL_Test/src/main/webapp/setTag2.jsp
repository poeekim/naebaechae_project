
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
    request.setCharacterEncoding("utf-8");  == <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
--%>

<%--
jstl태그중에서는 기존의 다른 태그에서 만들어진 객체를 다른 액션태그에서
불러올때 (참조할때)  target="${객체명}"  =>객체로 인식
--%>
<%
    //java.util.HashMap map = new java.util.HashMap<>();
    // map.put("name","홍길동"); // map.get(꺼낼키명(name))

%>
<!DOCTYPE html>
<html>
<head>
    <title>setTag2</title>
</head>
<body>
<%--
<c:set target-"${불러올 객체명}" property="속성명(멤버변수명)" value="저장할값" />
<c:set target="map" value="<%=new java.util.HashMap()%> />
<c:set var ="map" value="<%=new.java.util.HashMap()% />
map.put("name", "홍길동"); //map.get(꺼낼키명(name))

--%>

<fmt:requestEncoding value="utf-8" />
<c:set target="${map}" property="name" value="홍길동"/>
<%-- map.get(키명)--%>
1. 변수 map 에 저장된 name 값 : ${map.name} <br>
1. 변수 map 에 저장된 name 값 : ${map['name']} <br>
1. 변수 map 에 저장된 name 값 : ${map["name"]} <br>
<p></p>
<form method="post" action="setTag2.jsp">
    이름: <input type="text" name="name">
    <input type="submit" value="전송">
</form>

<%
    //request.setCharacterEncoding("utf-8");
%> <p>
    <hr>

입력 받은 이름 : <%=request.getParameter("name")%>
이름은(el 내장객체를 이용) ${param.name}


</body>
</html>
