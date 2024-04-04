
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>09.formevent.jsp</title>
    <style>
      .focused {
          background: #bbb;
      }

    </style>
    <script>
        $(function () {
            $('h1').css({'color':'red','text-decoration':'underline'})
            // 표현식) $(자식선택자).wrap
            $('#message').wrap('<h2> 요소안에 자료를 넣기 </h2>');
            $('#data').focus(); //커서입력

            // onfocus 이벤트 : 커서가 들어가는 경우에 발생되는 이벤트 종류
            $('#data').focus(function (){
                $(this).addClass('focused'); // 커서를 넣어줌
            })

            // onblur 이벤트 : 현재 inputbox 에서 커서가 벗어났을 때 발생하는 이벤트
            $('#data').blur(function (){
                $(this).removeClass('focused'); // 커서를 넣어줌
            })

            // 전송 버튼 (데이터가 전송되지 않도록 하려고함 = 전송시 onsubmit 이벤트가 발생하므로
            $('#frm').submit(function (event){
                let new_line = $('<li>' + $('#data').val() + '</li>'); //태그생성

                $('#disp').append(new_line); // 부모-append-자식

                // 기존에 입력되어있는 input 스트링은 지우고 커서 입력
                $('#data').val(""); // 지우기
                $('#data').focus(); //  커서

                event.preventDefault();
                // return false; (매개변수가 없을 때 사용가능)
            })

            // 지우기 버튼
            $('#clear').click(function (){
                $('#disp').empty(); // 값만 지움.
                $('#data').val(""); // 지우기
                $('#data').focus(); //  커서
            })
        })
    </script>
</head>
<body>
    <h1>jQuery 의 이벤트 종류 정리</h1>
    <%-- <h2> 요소안에 자료를 넣기--%>
        <div id="message"></div>
    <%-- </h2>--%>
            <form action="aa.jsp" id="frm">
                <input type="text" id="data" name="data">
                <input type="submit" value="확인">
            </form>
        <p></p>
            <button id="clear">지우기</button>
        <ul id="disp">
            <%--<li>aaa</li>
            <li>bbb</li>
            <li>ccc</li>--%>
        </ul>

</body>
</html>
