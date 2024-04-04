
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>03. append.jsp</title>
    <script>
        $(function () {
            /*
               함수             설명
          $(A).appendTo(B)->A를 B의 기존자식의 뒤에 추가할때 사용
          $(A).prependTo(B)->A를 B의 기존자식의 앞에 추가할때 사용

          $(A).insertAfter(B)->A를 B뒤에 추가할때 사용
          $(A).insertBefore(B)->A를 B앞에 추가할때 사용
            */
           // $('<h1>jQueryTest</h1>').appendTo('div'); // 새로 생성한 h1 태그를 기존에 존재한는 div 태그 자식 뒤에 추가된다.( div>h1 뒤에 jQueryTest 가 출력된다.)
           // $('<h1>jQueryTest prependTo</h1>').prependTo('div'); // 새로 생성한 h1 태그를 기존에 존재하는 div 태그 앞에 추가된다.
            $('<h1>DOM TEST insertAfter</h1>').insertAfter('div');
            $('<h1>DOM TEST insertBefore</h1>').insertBefore('div');
            $('<h1>DOM TEST 22</h1>').css('color','red').insertBefore('div');

            // width 크기를 지정 -> 비례해서 자동적으로 height도 설정된다.
            $('img').attr('width', 300).insertBefore('div');



        })
    </script>
</head>
<body>
<div>
    <h1>하이하이</h1>
</div>
<h1>반갑</h1>
<img src="../picCats/Persian.jpg" alt="">
</body>
</html>
