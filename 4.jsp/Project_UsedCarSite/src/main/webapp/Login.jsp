
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    System.out.println("-------------Connect Login.jsp------------ ");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인창</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="script.js?ver=1"></script>
    <style>
        /* 공통 스타일시트->1.파일로 불러오기
           2.특정페이지에서 사용하는 경우->style태그를 사용해서 적용시키기    */
        body{
            text-align:center;
            background-color:#FFFFCC;
        }
        table {
            /*
                border:1px solid black; 영역을 잡아줄 테두리 보여주기위해서(임시)
                margin-left:230px;
            */
            margin:0 auto;
        }
    </style>
</head>
<body>
<!--
 디자인=>table+input box(form)
    table>tr*4>td*2
-->
<!-- <center> -->
<table><!-- form:post-->
    <form name="login" action="LoginProc.jsp" method="post">
        <tr><!-- 로그인 타이틀명 h4{출력문자열}-->
            <td align="center" colspan="2"><h4>로그인</h4></td>
            <!-- <td></td>-->
        </tr>
        <tr><!-- 아이디 input:text
                     label태그를 사용해서 레이블명과 입력박스를 연결시키는 방법
                       형식)<label label for="연결시킬 id값">레이블명</label>
                      -->
            <td><label for="id">아이디</label></td>
            <td><input type="text" name="mem_id" id="id"></td>
        </tr>
        <tr><!-- 비번 input:password-->
            <td>비밀번호</td>
            <td><input type="password" name="mem_passwd" ></td>
        </tr>
        <tr><!--정가운데 버튼 2개 배치 input:button  나머지 td영역까지 포함해서 가운데 배치-->
            <td align="center" colspan="2">
                <input type="button" value="로그인" onclick="loginCheck()">&nbsp
                <input type="button" value="회원가입" onclick="document.location = 'agreement.jsp'">
                <label>
                    <input type="checkbox" name="b_1" value="v_1"> 버튼1
                </label>
                <label>
                    <input type="checkbox" name="b_2" value="v_2"> 버튼2
                </label>
                <label>
                    <input type="checkbox" name="b_3" value="v_3"> 버튼3
                </label>
                <%

                %>

            </td>
            <!-- <td align="center"><input type="button" value="회원가입"></td> -->
        </tr>
    </form>
</table>
<!-- </center> -->
</body>
</html>