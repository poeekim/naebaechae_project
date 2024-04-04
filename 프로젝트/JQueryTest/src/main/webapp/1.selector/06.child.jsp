<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>06.child.jsp</title>
    <script>
        $(function () {
        // 중첩 : 트리구조 형성(DOM) = 동일한 태그/ 인접하는 태그
            /*
            * 특징
            * 1. 부모태그 > 자식태그 == 부모태그 바로 밑에 있는 자식 태그 선택(손자 태그 포함 X)
            * 2. 부모태그 자식태그 == 손자 태그까지 포함.
            * 3. 부모태그 + 자식태그 == 바로 옆 태그를 찾을 때 사용 ( next() ) 여러번 사용이 가능  <--> prev() : 바로 이전의 태그. 여러번 사용이 가능
            *
            * */

            //$('body>div').css('border', 'solid 3px blue');
            //$('span+a').css('border', 'double red 5px');
            $('span+a').next().next().css('border', 'double red 5px');
            $('span+a').prev().css('border', 'dotted blue 5px');
            $('span+a').nextAll().css('border', 'solid green 5px');
            $('body>div>ul>li').css('border', 'solid 3px orange');
            $('span+a').prev().css('background', 'yellow');


        })
    </script>
</head>
<body>
    <div>
        <ul> 과일 목록
            <li>사과</li>
            <li>배</li>
            <li>복숭아</li>
            <li>오렌지</li>
            <li>파인애플</li>
        </ul>
    </div>
        <div>jQuery 연습</div>
        <p>
            <span>태그정보1</span>
            <a>one</a>
            <span>태그정보2</span>
            <span>태그정보3</span>
            <span>태그정보4</span>
        </p>
<div>
    <p>
    <div>
        <div>도레미</div>
        <div>파솔라</div>
        <div>시도</div>

    </div>
    </p>
</div>

</body>
</html>
