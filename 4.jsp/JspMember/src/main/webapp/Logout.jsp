
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    session.invalidate(); // 로그아웃(메모리에 저장된 계정정보 삭제하기)
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout.html(로그아웃)</title>
</head>
<body>
<script>
    //형식 alert("상대방에게 경고성 멘트를 출력")
    alert("정상적으로 로그아웃 되었습니다.")
    //document.location="이동할 페이지명"
    document.location="Login.jsp"
</script>
</body>
</html>