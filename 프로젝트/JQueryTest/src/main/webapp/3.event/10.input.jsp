<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-04
  Time: PM 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <style>
        #userid,#age,#pwd1,#pwd2 {width:200px}
        .msg {color:red;padding-left:2px}
    </style>
    <script type="text/javascript" src="input.js?ver=1"></script>
    <script>
        $(function () {

        })
    </script>
</head>
<body>
<h2>***간단한 회원 가입폼***</h2>
<form id="signup" method="post" >
    id입력:<input type="text" name="userid" id="userid">
    <span class="msg" id="id_error">id값(필수정보)입력요망</span>
    <br>
    <!-- 나이 -->
    나이입력:<input type="text" name="age" id="age">
    <span class="msg" id="age_error1">나이(필수정보)입력요망</span><br>
    <span class="msg" id="age_error2">나이는 반드시 숫자로 입력</span>
    <br>
    <!-- 비밀번호 -->
    비번입력:<input type="password" name="pwd1" id="pwd1">
    <span class="msg" id="p_error1">비번(필수정보)입력요망</span>
    <br>
    <!-- 비밀번호 재입력 -->
    비번재입력:<input type="password" name="pwd2" id="pwd2">
    <span class="msg" id="p_error2">비밀번호가 불일치합니다.</span>
    <br>
    <input type="button" id="btnSend" value="전송">
</form>
</body>
</html>
