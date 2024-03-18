<%@ page import="hewon.MemberDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="hewon.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
    <title>id, passwd 확인하는 페이지</title>
</head>
<body>
    <%
    // id, passwd 값을 받아서 loginCheck() 를 호출 -> 값이 일치할 경우 True -> LoginSuccess.jsp 호출 -> logOut.jsp 호출
        String mem_id = request.getParameter("mem_id");
        String mem_passwd = request.getParameter("mem_passwd");
        System.out.println("mem_id = " + mem_id);
        System.out.println("mem_passwd = " + mem_passwd);

        // MemberDAO -> loginCheck(id, passwd) 호출
        MemberDAO memMgr = new MemberDAO();
        boolean check = memMgr.loginCheck(mem_id, mem_passwd);
        System.out.println("LoginProc.jsp - check = " + check);
    %>
    <%
    // check 값이 true 일 경우 : LoginSuccess.jsp(인증화면)    | false 일 경우  : LogError.jsp
        if (check) {
            session.setAttribute("idKey", mem_id);
            //System.out.println("idKey - mem_id = " + mem_id);// 키명, 저장할값 (id계정이름)
            response.sendRedirect("LoginSuccess.jsp");

        } else {
            response.sendRedirect("LogError.jsp");
        }

    %>
</body>
</html>
