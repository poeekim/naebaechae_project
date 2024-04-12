
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>10.$.Script.jsp</title>
    <!-- <script language="JavaScript" src="test.js?ver=2.0"></script>

    $.getScript() -> <script> 태그를 사용하지 않아도, 외부에서 작성한 자바 스크립트의 파일을
                       불러와서 특정 함수를 호출할 수 있도록 만들어 주는 함수

      function call(param){
        return ("Hello,"+param)
    }
     -->
    <script>
        $(function(){
            //형식)$.getScript('경로포함해서 불러올 js파일명')->함수호출이 가능
            $.getScript("test.js");//실행할때 불러옴=><script>태그 사용없이 외부의 js파일을 불러온다.

            $('#submit').click(function(){
                var msg=call($('.username').val());

                $('#message').html(msg);
                return false;//기본적인 기능은 중지(전송기능 X)
            })
        })
    </script>
</head>
<body>
    이름 : <input type="text" name="username" class="username"><br><p></p>
    <button id="submit">전송</button>
    <div id="message"></div>
</body>
</html>
