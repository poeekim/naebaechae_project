
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {
        /*
        * 선택자(같은 태그 -> 속성을 이용한다) 같은 태그인데 속성이 없을 시, 어떻게 구분을 할 것인가?
        * == 같은 태그의 출력되는 순서를 기준으로 설정할 수 있다.
        * 요소:odd == 홀수번째 위치한 태그를 찾는다.
        * 요소:even == 짝수번째 위치한 태그를 찾는다.
        * 요소:first == 첫번째 위치의 태그를 찾는다.
        * 요소:last == 맨 마지막 위치의 태그를 찾는다.
        * */

            $('tr:odd').css('background','pink'); // 짝수번째에 위치한 tr 태그의 배경색을 변경한다. ( 내부적으로 인덱스는 0부터 시작하므로, odd 를 설정하면 2,4 row 배경이 변경된다.)
            $('tr:first').css('font-size', '25pt').css('background', 'yellow');
            $('tr:last').css('font-size', '30pt').css('background', 'cyan')
                .css('color', 'red');
        })


    </script>
</head>
<body>
<table border="1">
    <tr><th>이름</th><th>혈액형</th></tr>
    <tr><td>테스트</td><td>A형</td></tr>
    <tr><td>임시</td><td>B형</td></tr>
    <tr><td>테스트2</td><td>O형</td></tr>
    <tr><td>테스트3</td><td>AB형</td></tr>
</table>

</body>
</html>
