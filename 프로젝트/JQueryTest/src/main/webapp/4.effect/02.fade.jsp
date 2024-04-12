<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>02.fade.jsp</title>
    <style>
        p {
            position: relative;
            width: 400px;
            height: 90px;
        }
        div {
            position: absolute;
            width: 400px;
            height: 97px;
            background: red;
            font-size: 36px;
            text-align: center;
            color: yellow;
            left: 0;
            top: 0;
            display: none;

        }
    </style>
    <script>
        $(function () {
            // 1. fadeIn
            $('#fadeIn').click(function (){
                $('div').fadeIn(3000,function (){
                    $('span').fadeOut(100);
                });
            })
            // 2. fadeOut
            $('#fadeOut').click(function (){
                $('div').fadeOut(3000,function (){
                    $('span').fadeIn(100);
                });
            })

            // 3. fadeToggle
            $('#fadeToggle').click(function (){
                $('div').fadeToggle(3000,function (){
                    $('span').fadeIn(100);
                });

            })


        })
    </script>
</head>
<body>
<p>
    불투명도를 점점 높여 보이도록 설정
    speed를 fast, normal, slow 또는 0 이상의 숫자로 설정 가능.
    애니메이션이 끝난 후에 사용자 정의 함수를 지정한다.


</p>
<div><span>SUCCESS</span></div>
    <button id="fadeIn">fadeIn</button>
    <button id="fadeOut">fadeOut</button>
    <button id="fadeToggle">fadeToggle</button>
    <p></p>

</body>
</html>
