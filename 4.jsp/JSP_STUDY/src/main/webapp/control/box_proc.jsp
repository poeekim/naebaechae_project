<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-12
  Time: AM 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>요청을 받아서 처리해주는 페이지</title>
</head>
<body>
<%
// 스크립트릿(자바코드를 사용할 수 있음, 태그 사용 불가, 표현식 사용 불가)
    String tr_cnt = request.getParameter("tr_cnt");
    String td_cnt = request.getParameter("td_cnt"); // null이 뜰 경우 매개변수 오타확인 요망
    System.out.println("tr_cnt = " + tr_cnt + ", td_cnt" + td_cnt);
%>
<table border="1">
    <% for (int i = 0; i < Integer.parseInt(tr_cnt); i++) {    %>
    <tr>
        <% for (int j = 0; j < Integer.parseInt(td_cnt); j++) {    %>
            <td width ="50">&nbsp</td>
        <% } %>
    </tr>
    <% } %>
</table>
<%--
<a href="box.html">다시 입력하기 </a>
history.back() or history.go(-1) : 뒤로가기
history.forward() : 앞으로 가기
--%>
<a href="JavaScript:history.back()">다시 입력하기</a>

</body>
</html>
