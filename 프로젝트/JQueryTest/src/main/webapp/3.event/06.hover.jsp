
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>06.hover.jsp</title>
    <style>
        .reverse {
            background: black;
            color: yellow;
        }
    </style>
    <script>
        $(function () {

            /*
            * mouseover, mouseout 이벤트를 번갈아 가면서 자동으로 호출해주는 함수
            * 표현식) $('선택자').hover(1.mouseover | function(){}, 2.mouseout | function(){})
            * */
            $('h1').hover(function (){
                $(this).addClass('reverse');

            },function (){
                $(this).removeClass('reverse');
            })
        })
    </script>
</head>
<body>
    <h1>hover text_0</h1>
    <h1>hover text_1</h1>
    <h1>hover text_2</h1>
</body>
</html>
