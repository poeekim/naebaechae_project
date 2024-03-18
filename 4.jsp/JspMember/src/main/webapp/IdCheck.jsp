<%@ page import="hewon.MemberDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="hewon.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
    <title>id 중복 확인하는 페이지</title>
</head>
<body bgcolor="#FFFFCC">
<jsp:useBean id="memMgr" class="hewon.MemberDAO" scope="page" />
<%

    String mem_id = request.getParameter("mem_id");
    System.out.println("IdCheck.jsp 의 mem_id = " + mem_id);

    // MemberDAO -> checkId(id) 호출
    //MemberDAO memMgr = new MemberDAO(); -> 액션태그로 객체 생성 대체함 : row 9
    boolean check = memMgr.checkId(mem_id);
    System.out.println("IdCheck.jsp - checkId = " + check);
%>
<center>
<%--    <b><%=mem_id%></b>--%>
<%
    // check 값이 true 일 경우 : LoginSuccess.jsp(인증화면)    | false 일 경우  : LogError.jsp
    if(check){%>
    <b><%=mem_id%></b> 는 이미 존재하는 아이디입니다. <p></p>
    <% }else{ %>
    <b><%=mem_id%></b> 는 사용 가능한 아이디입니다. <p></p>
    <% }

%>
    <a href="#" onclick="self.close()">닫기</a>
</center>
</body>
</html>
