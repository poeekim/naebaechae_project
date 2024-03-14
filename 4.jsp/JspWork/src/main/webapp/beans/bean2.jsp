<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" import="test.BeanDTO" %>
<!DOCTYPE html>
<html>
<head>
    <title>자바 빈즈가 나온 배경</title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String addr = request.getParameter("addr");
    // 1. 객체 생성하기
    BeanDTO bd = new BeanDTO();
    // 2. Setter Method 메소드 호출
    bd.setName(name);
    bd.setAddr(request.getParameter("addr"));
    // 3. Getter Method 를 호출해서 나중에 테이블의 필드에 맞게 출력
    System.out.println("입력받은 bd.getName() = " + bd.getName());
    System.out.println("입력받은 bd.getAddr() = " + bd.getAddr());
%>


<p>
    저장된 값 출력(getter) :
<h2><%=bd.getName() %> 님 잘오셨습니다.
</h2>&nbsp
<h2><%=bd.getAddr() %>
</h2>
</body>
</html>
