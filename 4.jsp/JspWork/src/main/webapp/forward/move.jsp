<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--
        1. 조건에 따라서 페이지를 이동할 수 있도록 해주는 검증용 페이지역할을 해준다.

    --%>
    <title> 페이지를 이동시키는 역할 </title>
    <h2> 페이지 이동 </h2>
    <%
        String move = request.getParameter("move");
        System.out.println("move = " + move);
        // response.sendRedirect("a.jsp");   -> 단순히 이동만 시키고 싶을 경우
        // forward -> 페이지 이동 + 데이터 공유(모델2)
        if (move.equals("a.jsp")) {
            //response.sendRedirect("a.jsp");
    %>
<%--

    jsp:forward(액션태그명) page ="이동할 페이지명" (데이터를 공유하면서 이동)
--%>
<%--<jsp:forward page='<%=move%>' /> &lt;%&ndash; String move 값이 들어옴 &ndash;%&gt;--%>

    <jsp:forward page='a.jsp' />
    <% } else if (move.equals("b.jsp")) {%>
    <jsp:forward page='b.jsp' />
    <% } else {%>
        <script>
            alert("당신이 요청한 페이지는 존재하지 않습니다.\n 다시 확인 후 실행하시기 바랍니다.");
            location.href = "forward.jsp"; // 홈화면 보여주기
        </script>
    <%}%>


</head>
<body>

</body>
</html>
