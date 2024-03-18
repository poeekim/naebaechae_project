
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
// 로그인 유무 판단 session.setAttribute("idKey", mem_id);
    String mem_id = (String)session.getAttribute("idKey"); // 로그인 했을 때 보여지는 모든 화면에 해당 문장이 있어야함(로그인 성공 여부에 따라 보여지는 화면이 다르므로)
    System.out.println("LoginSuccess.jsp 의 mem_id = " + mem_id);


%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LoginSuccess.html(인증성공페이지)</title>
    <!-- 웹페이지가 변경이 되도 항상 동일한 스타일을 적용 -->
    <link href="style.css" rel="stylesheet" type="text/css">
    <style>
        body{
            background-color:#FFFFCC;
            text-align:center;
        }
        span{
            font-weight:bolder;/* <strong>or <b>  */
            color:blue;
        }
    </style>
</head>
<body><!-- bgcolor(X)-->
<!-- 계정명 출력 -->
<%
    if (mem_id != null) { // 계정으로 로그인 성공
%>
<span><%=mem_id%>></span>님 환영합니다.<p></p>
**당신은 제한된 기능을 사용할 수가 있습니다 <p></p>

<a href="MemberUpdate.jsp">회원수정</a>
<a href="DelCheckForm.jsp">회원탈퇴</a><!-- 1.진짜 탈퇴?  2.잘못 클릭한 경우-->
<a href="Logout.jsp">로그아웃</a>
<% }else  { %>
    <script>
        alert("로그인을 먼저 진행하시길 바랍니다.");
    </script>

<% } %>
</body>
</html>