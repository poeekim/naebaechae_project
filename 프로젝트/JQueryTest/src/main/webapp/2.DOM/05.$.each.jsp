<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>$.each.jsp</title>
    <script>
        $(function () {

            /*
            * jQuery 에서 제공되는 함수의 패턴 종류가 2가지가 있다.
            * 1. $('반복적으로 사용되는 태그').each(콜백함수())
            * 2. $.each(함수명) : 배열관리, 객체관리 등 케이스에서사용되는 단독으로 처리해주는 함수
            *    $.each(꺼낼객체명(출력대상자),콜백함수(매개변수1, 매개변수2)){처리구문}
            *
            * let 변수명(=객체) ={키명:값,키명2:값2,...}
            * let 변수명 = [] : 배열객체
            * let 변수명 = {} : 빈객체
            *
            *   * */

                let array = [{name:'naver',link:'http://www.naver.com'},
                    {name:'daum',link:'http://www.daum.net'},
                    {name:'nate',link:'http://www.nate.com'},
                    {name:'google',link:'http://www.google.com'}]

            $.each(array, function (index, item) {

                let output = "";
                output += '<a href="' + item.link + '">';
                output += '<h1>' +item.name+'</h1>';
                output += '</a>';

                // 인덱스 번호에 해당하는 항목을 가져와서 body 에 결합한다.
                document.body.innerHTML += output;
            })
        })
    </script>
</head>
<body>
<a href="https://www.naver.com"><h1>네이버</h1></a>
</body>
</html>
