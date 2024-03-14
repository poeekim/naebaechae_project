<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>자바 빈즈가 나온 배경</title>
</head>
<body>

<%!
    // 변수+메소드가 필요하다. (Setter, Getter Method)
    // 이런 방식의 코딩은 입력받은 갯수만큼 변수와 메소드가 필요하므로 좋지 못한 코딩 방식이다.
    String name = "홍길동";
    String addr = "";

    public void setName(String name) {
        this.name = name;
        System.out.println("setName() -> name = " + name);

    }

    public void setAddr(String addr) {
        this.addr = addr;
        System.out.println("setAddr() -> addr = " + addr);
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }
%>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String addr = request.getParameter("addr");

%>
메소드호출(Setter) : <% setName(name); %>
<% setAddr(addr); %>

<p>
    저장된 값 출력(getter) :
<h2><%=getName() %>
</h2>&nbsp
<h2><%=getAddr() %>
</h2>
</body>
</html>
