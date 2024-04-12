
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>$.ajax.jsp</title>
    <script>
        $(function () {

            /*
            * 표현식) $.ajax(url 요청문서, 전달할 매개변수명{매개변수명:전달할값}, 콜백함수(매개변수명), 요청문서 종류)
            *
            * $.get() -> get방식으로 서버에 요청 ($.ajax()를 호출)
            *  */

            $.ajax({ // $.get() 과 동일함
                // key : value 형식으로 보내기
                url:'aa2.jsp',  // 1. url(속성명):요청문서형  'sub/abc/aa2.jsp' 경로지정 가능
                type:'get', // 2. type:전송방식(post)  $.post() 와 동일
                // 3. data:{매개변수명:값1, 매개변수명2:값2, ...}
                data:{name : 'test', age:23, addr:'서울'}, // 여러개는 콤마로 구분함
                success: function (args) {
                    alert(args);
                }, error: function () {
                    alert("서버 요청 실패");
                }
            })
        })
    </script>
</head>
<body>

    <button id="saveButton">전송</button>
    <button id="clearButton">지우기</button>
    <div id="resultDIV"></div>
</body>
</html>
