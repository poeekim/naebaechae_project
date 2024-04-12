<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>01.slide.jsp</title>
    <style>
        div {
            background: #3d9a44;
            margin: 3px;
            width: 80px;
            height: 40px;
            float: left; /* 왼쪽부터 배치 */
        }
    </style>
    <script>
        $(function () {
            // 1. slideup
            $('#slideUp').click(function (){
                // 표현식) $('선택자').slideUp() or slideDown(유지시간,처리함수)
                $('div').slideUp();
            })
            // 2. slidedown
            $('#slideDown').click(function (){
                // 표현식) $('선택자').slideUp() or slideDown(유지시간,처리함수)
                $('div').slideDown("slow");

            })

            // 3. slideToggle -> slidedup 이랑 slidedown 을 번갈아 호출해줌
            $('#slideToggle').click(function (){
                // 표현식) $('선택자').slideUp() or slideDown or slideToggle(유지시간,처리함수)
                $('div').slideToggle("slow");

            })

        })
    </script>
</head>
<body>
    <button id="slideUp">slideUp</button>
    <button id="slideDown">slideDown</button>
    <button id="slideToggle">slideToggle</button>
    <p></p>
    <div></div><div></div><div></div><div></div>
</body>
</html>
