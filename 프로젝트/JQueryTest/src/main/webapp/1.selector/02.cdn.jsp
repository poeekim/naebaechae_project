
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>02. cdn.jsp </title>
    <style>
        /*
        cdn 방식 : jquery 를 지원해주는 특정사이트의 url 을 이용하여, 함수를 호출, 처리해주는 개발방식. 속도가 느릴 수 있는 단점이 있음.

             h1 {
            color : red;
        }
        span {
            border: 3px solid blue;
        }
        .my{
            border: 5px dotted green;
        }
        */


    </style>
    <script>
        $(function () {
          // 표현식)  $(element(태그이름), id, class선택자).함수명()
          // 표현식2) $('태그명').css('속성명','속성값) : Setter Method 랑 비슷함.
            // let | var 변수명 = $('태그명').css('속성명') : Getter Method 와 동일

            $('h1').css('color','red'); // 스타일태그 내 h1 설정값과 동일함.
            $('span').css('border','3px solid blue');
            // 표현식3) 클래스 선택자 -> $(태그명.클래스명) : 특정태그에 제한적 반영
            $('span.my').css('border','5px dotted green');
            // 포현식4) id 선택자 -> $(태그명#선택자) : 태그명은 생략 가능
            $('#content').css('background', 'yellow');
            // 표현식5) 모든 태그를 가리키는 예약어 : *
            $('*').css('color', 'cyan');

            /*
            *
            *
            *
            *
            * */
        })
    </script>

</head>
<body>
<h1>JQuery 선택자 연습</h1>
<p>JQuery 실습</p>
<div class="my">
    <div id="content">id 값이 content 인 div 태그</div>
</div>
<p></p>
    <span>span1</span>
    <span class="my">span2</span>
</body>
</html>
