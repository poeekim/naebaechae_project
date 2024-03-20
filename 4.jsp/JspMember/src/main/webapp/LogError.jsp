
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LogError.jsp</title>
    <!-- 웹페이지가 변경이 되도 항상 동일한 스타일을 적용 -->
    <link href="style.css" rel="stylesheet" type="text/css">
    <style>
        body{
            background-color:#FFFFCC;
            text-align:center;
        }
        span{
            font-weight:bolder;/* <strong>or <b>  */
            color:red;
        }
    </style>
</head>
<body><!-- bgcolor(X)-->
<!-- span{로그인에 실패하셨습니다.}+span{아이디및 비밀번호를 다시 확인요망!} -->
<span>로그인에 실패하셨습니다.</span><p></p>
<span>아이디 및 비밀번호를 다시 확인요망!</span><p></p>
<a href="Login.jsp">다시 로그인</a>
</body>
</html>