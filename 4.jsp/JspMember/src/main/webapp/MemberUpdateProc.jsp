
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="hewon.MemberDAO" %>
<%
    System.out.println("-------------Connect MemberUpdateProc.jsp------------ ");
    // 404 에러 발생 시 보통은 오타로 인한 오류가 많음 -> 수정을 해도 캐시에 이전 데이터로 저장되어 있기 때문에 바로 적용되지 않음
    response.setHeader("Cache-Control", "no-cache"); // 메모리에 저장 유무 - (no-cache) : 캐시 저장 X
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0); // 저장 유효기간을 없앰.

%>
<%
    // MemberUpdate.jsp(수정폼) -> MemberUpdateProc.jsp(수정메소드 호출)
    request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="mem" class="hewon.MemberDTO" />
<jsp:setProperty name="mem" property="*" />


<%
    // 추가!!!!!!!!!!!!!! :
    String mem_id = request.getParameter("mem_id");
    System.out.println("memberUpdateProc - mem_id = " + mem_id);
    // 메소드 호출 객체 생성
    MemberDAO memMgr = new MemberDAO();
    boolean check = memMgr.memberUpdate(mem); // 내부 -> Getter Method -> 필드저장
    System.out.println("memberUpdateProc.jsp - check = " + check);
%>
<!DOCTYPE html>
<html>
<head>
    <title>회원수정</title>
</head>
<body bgcolor="#FFFFCC">
<%
    if (check) { // 회원수정에 성공했다면
%>
<script>
    alert("성공적으로 수정 되었습니다.");
    location.href = "LoginSuccess.jsp"; // 페이지 이동
</script>
<% }else { %>
<script>
    alert("수정 도중 에러가 발생되었습니다.");
    history.back(); // 페이지 이동
</script>
<% }
%>

</body>
</html>
