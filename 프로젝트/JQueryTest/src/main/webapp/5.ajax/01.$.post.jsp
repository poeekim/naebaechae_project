
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>$.post.jsp</title>
    <script>
        $(function () {

            /*
            * $.post() -> 내부적으로 $.ajax() 를 호출한다.
            *             post 방식으로 서버에 요청(서버에 요청한 문서결과를 콜백함수로 전달하고
            *             페이지 이동없이 원하는 특정위치에 출력한다.
            *
            * 표현식) $.post(url 요청문서, 전달할 매개변수명{매개변수명:전달할값}, 콜백함수(매개변수명), 요청문서 종류)
            *
            * $.get() -> get방식으로 서버에 요청 ($.ajax()를 호출)
            *  */

            $('#saveButton').click(function (){
                let value = $('#name').val();
                //alert(value);
                $.post('aa.jsp', {name:value}, function (arg){
                    $('#resultDIV').html(arg);
                })
            })

            // 지우기
            $('#clearButton').click(function (){
                $('#resultDIV').empty(); // 내용만 지우기
                $('#name').val("");
                $('#name').focus();
            })

        })
    </script>
</head>
<body>
    이름 : <input type="text" id="name"><br><p></p>
    <button id="saveButton">전송</button>
    <button id="clearButton">지우기</button>
    <div id="resultDIV"></div>
</body>
</html>
