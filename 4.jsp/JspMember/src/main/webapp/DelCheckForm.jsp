
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    // DelCheckForm.jsp?mem_id='kkk'
    System.out.println("-------------Connect DelCheckForm.jsp------------ ");
    String mem_id = request.getParameter("mem_id");
    System.out.println("DelCheckForm.jsp - mem_id = " + mem_id);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원탈퇴 확인</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <style>
        body{
            background-color:#FFFFCC;
        }
        span{
            font-weight:bolder;/* <strong>or <b>  */
            color:red;
        }
        table{
            margin:0 auto; /* 좌우여백은 자동으로 조절*/
        }
    </style>
    <script>
        function delCheck() {
            if (document.del.passwd.value == "") {
                alert("비밀번호를 입력하시오");
                document.del.passwd.focus(); // 커서 고정
                return;
            } else {
                document.del.submit(); // action="deletePro.jsp" 로 passwd 를 전송
            }
        }

    </script>
</head>
<body onload="document.del.passwd.focus()"> <%-- 커서 --%>

<table>

    <%--

    deletePro.jsp 에게 memberDelete(mem_id, passwd)를 호출할 예정
    1. 입력하지 않고 전송 시 :  1) hidden 객체를 이용 -> 폼 태그 내 input 태그 type 값을 hidden으로 설정 :
                             <input type="hidden" name = "mem_id" value="<%=mem_id%>"
                            2) action ="deletePro.jsp?매개변수명=값&매개변수명2=값2..." :
                             <form name="del" method="post" action="deletePro.jsp?mem_id=<%=mem_id%>">

    --%>
    <form name="del" method="post" action="deletePro.jsp?mem_id=<%=mem_id%>">
        <tr>
            <td align="center" colspan="2">
                <span><%=mem_id%>님</span>비밀번호를 입력해주세요
            </td>
        </tr>
        <%-- <input type="hidden" name = "mem_id" value="<%=mem_id%>"  --%>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="passwd"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" value="탈퇴" onclick="delCheck()">&nbsp;&nbsp;&nbsp;
                <input type="button" value="취소" onclick="document.location='LoginSuccess.jsp?mem_id=<%=mem_id%>'">
            </td>
            <!-- <td></td> -->
        </tr>
    </form>
</table>
</body>
</html>