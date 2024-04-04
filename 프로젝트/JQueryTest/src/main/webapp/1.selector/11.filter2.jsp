
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {
        /*

        * 요소:contains(찾는문자열) == 찾는 문자열을 가진 태그를 찾기
        * 요소:eq(n) == n번째에 위치한 태그를 찾기(인덱스 번호) ex. ~ where ename = '홍길동'
        * 요소:gt(n) == n번째 보다 큰 위치의 태그 찾기.
        * 요소:lt(n) == n번째 보다 작은 위치의 태그 찾기.
        * 요소:not(선택자)  == 선택자와 일치하지 않는 태그 찾기.
        * 요소:has(특정태그) == 특정 태그를 찾을 때 사용.
        * */

            $('tr:odd').css('background','pink'); // 짝수번째에 위치한 tr 태그의 배경색을 변경한다. ( 내부적으로 인덱스는 0부터 시작하므로, odd 를 설정하면 2,4 row 배경이 변경된다.)
            // $('tr:first').css('font-size', '25pt').css('background', 'yellow');
            //$('tr:eq(0)').css('font-size', '25pt').css('background', 'green');
            $('tr').eq(0).css('font-size', '25pt').css('background', 'orange');
            $('tr:contains(A형)').css('background', 'purple');

            //$('tr:lt(2)').css('font-family', '바탕체').css('font-size', '16pt').css('color', 'red');
            $('tr:gt(2)').css('font-family', '바탕체').css('font-size', '16pt').css('color', 'red');

            // not(선택자)
            $('tr').not(':even').css('color', 'blue'); // 짝수번째가 아닌 (=홀수번쨰) row 의 글자색을 바꿔라.
            $('tr:last').css('font-size', '30pt').css('background', 'cyan')
                .css('color', 'red');

            // has(찾는 태그)
            $('tr:has(th)').css('font-family', '궁서체').css('font-size', '40pt');
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
