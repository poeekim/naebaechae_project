

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    System.out.println("-------------Connect deletePro.jsp------------ ");
    // 404 에러 발생 시 보통은 오타로 인한 오류가 많음 -> 수정을 해도 캐시에 이전 데이터로 저장되어 있기 때문에 바로 적용되지 않음
    response.setHeader("Cache-Control", "no-cache"); // 메모리에 저장 유무 - (no-cache) : 캐시 저장 X
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0); // 저장 유효기간을 없앰.

%>
<%

    request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="memMgr" class="hewon.MemberDAO" />


<%
    // 추가 : deletePro.jsp?mem ='아이디명';
    String mem_id = request.getParameter("mem_id");
    String passwd = request.getParameter("passwd");

    System.out.println("deletePro - mem_id = " + mem_id);
    System.out.println("deletePro - passwd = " + passwd);

    int check = memMgr.memberDelete(mem_id,passwd); // 내부 -> Getter Method -> 필드저장
    System.out.println("deletePro.jsp 탈퇴유무 - check = " + check); // 1 : 탈퇴 O
%>
<!DOCTYPE html>
<html>
<head>
    <title>회원탈퇴</title>
</head>
<body bgcolor="#FFFFCC">
<%
    if (check ==1) { // 회원탈퇴에 성공했다면
        session.invalidate(); // 세션종료(메모리해제)
%>
<script>
    alert("<%=mem_id%>님 성공적으로 탈퇴 되었습니다.");
    location.href = "Login.jsp"; // 페이지 이동
</script>
<% }else { %>
<script>
    alert("탈퇴 도중 에러가 발생되었습니다.");
    history.back(); // 페이지 이동
</script>
<% }
%>

</body>
</html>

