<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-04
  Time: AM 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>07. keyup.jsp</title>
    <script>
        $(function () {
            /*
            * 사용자가 글자 입력했을때 발생하는 이벤트 ==> keyup(typing)
            * 단순히 특정한 글자를 누른 경우 ==> keyPress (F1, Ctrl, Shift 등)
            * 일반 글자를 누른 경우 ==> keyDown 이벤트 발생
            * */
        $('input').keyup(function (){
            // 1. input 박스 내 텍스트 뜯어오기
            let value = $(this).val(); // 글자를 쓰고 있는 inputbox : 이벤트 대상자이므로,
            // 2. id 속성값이 console인 부분에 뜯어온 텍스트 붙여넣기
            report(value);

        }) // 버튼을 눌렀을 시, input 박스에 있는 내용을 지우고, 커서 입력
            $('button').click(function(){
                $('input').val(""); // 지우기
                $('input').focus(); // 커서 자동입력 (document.regFprm.idtest.focus(XXXXXXXXXXX)
                $('#console').empty(); // 내용만 지워라.

            })
            // 사용자정의 함수작성-> 호출
            function report(msg) {
                $('#console').text(msg);
            }
        })
    </script>
</head>
<body>
    <button>reset</button>
    <input type="text" value="val 함수 연습중" size="100">
    <div id="console">

    </div>
</body>
</html>
