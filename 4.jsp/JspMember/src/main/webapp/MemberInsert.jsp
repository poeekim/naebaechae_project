
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="hewon.MemberDAO" %>
<%
    System.out.println("-------------Connect MemberInsert.jsp------------ ");
// 404 에러 발생 시 보통은 오타로 인한 오류가 많음 -> 수정을 해도 캐시에 이전 데이터로 저장되어 있기 때문에 바로 적용되지 않음
    response.setHeader("Cache-Control", "no-cache"); // 메모리에 저장 유무 - (no-cache) : 캐시 저장 X
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0); // 저장 유효기간을 없앰.

%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="mem" class="hewon.MemberDTO" />
<jsp:setProperty name="mem" property="*" />

<%
    // 메소드 호출 객체 생성
    MemberDAO memMgr = new MemberDAO();
    boolean check = memMgr.memberInsert(mem); // 내부 -> Getter Method -> 필드저장

%>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body bgcolor="#FFFFCC">
<%
    if (check) {
        %>
<b> 회원가입을 축하드립니다.</b><p></p>
        <a href=Login.jsp>로그인</a>

   <% }else { %>
<b> 회원가입에 실패하였습니다.</b><p></p>
       <a href=register.jsp> 다시 가입 </a>;
   <% }
%>

</body>
</html>
