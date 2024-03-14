<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="test.BeanDTO" %>
<!DOCTYPE html>
<html>
<head>
    <title> bean3.jsp - 자바 빈즈가 나온 배경 </title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String addr = request.getParameter("addr");
    // 1. 객체 생성하기 -> 23row
    //BeanDTO bd = new BeanDTO();
    // 2. Setter Method 메소드 호출
    //bd.setName(name);
    //bd.setAddr(request.getParameter("addr"));
    // 3. Getter Method 를 호출해서 나중에 테이블의 필드에 맞게 출력
    //System.out.println("입력받은 bd.getName() = " + bd.getName());
    //System.out.println("입력받은 bd.getAddr() = " + bd.getAddr());
%>
<%-- 1. 객체 만들기 --%>
<jsp:useBean id="bd" class="test.BeanDTO" scope="page" />
<%-- scope - session : 로그인한 동안  |    application : 모든 페이지--%>

<%-- 2. 액션으로 값 가져오기--%>
<%-- setproperty 액션태그로 가져오기 (가져올 값들이 적을 때는 괜찮음 허나 가져올 값들이 100개, 4000개.. 이럴경우에는???) --%>
<%--
<jsp:setProperty name="bd" property="name" value="<%=name%>" />
<jsp:setProperty name="bd" property="addr" value="<%=addr%>" />
--%>

<%-- 2-1. 가져올 값이 많을 경우 --%>
<jsp:setProperty name="bd" property="*"/>

<hr>
액션태그를 통한 Getter Method 호출하는 경우<p>
    <jsp:getProperty name="bd" property="name" />
    <jsp:getProperty name="bd" property="addr" />
    <br>
        저장된 값 출력(getter) :
<b><%=bd.getName() %> 님 잘오셨습니다.
</b>&nbsp
<h2><%=bd.getAddr() %>
</h2>
</body>
</html>
