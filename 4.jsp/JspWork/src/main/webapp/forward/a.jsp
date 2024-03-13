
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp</title>
</head>
<body bgcolor="yellow">
    <h1> a.jsp 로 오신것을 환영합니다. </h1>
<%
    /*
    * 메모리에 저장되며, 입력받는게 없다. -> request.getAttribute("키명");
     메모리에 저장되며, 입력받는게 있다 (ex. 회원가입, 회원수정등) -> request.getParameter("매개변수명");
        예외!!! hidden 태그를 이용하는 경우에도 request.getParameter("매개변수명"); 을 사용할 수 있다.
    * */

    int su = (Integer)request.getAttribute("total");
    // 메모리에 올라간 데이터는 Object(Integer) 이므로 원래 타입으로 형변환 시키지 않으면 오류 발생
    //

%>
    total 값은? <%=su%>
    <hr>
    형변환을 하지 않고 바로 값을 가져올 수 있다.
    <hr>
    move2.jsp 에서 공유한 su 값은? <%=request.getAttribute("total")%>
</body>
</html>

