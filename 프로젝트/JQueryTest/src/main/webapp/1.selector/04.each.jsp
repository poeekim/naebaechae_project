<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>04. each() 함수</title>
    <style>
        .fromjQuery0 {
            color: red;
        }
        .fromjQuery1 {
            color: deeppink;
        }
        .fromjQuery2 {
            color: blue;
        }
        .fromjQuery3 {
            color: green;
        }
    </style>
    <script>
        let i = 0; // const i (x) : const 는 값이 변경이 안됨. 클래스 선택자를 구분하기 위한 구분값으로 let i 를 선언

        $(function () {
// 표현식) $('선택자').attr('속성명','속성값) : setter Method 와 비슷
            // let | var 변수명 = $('선택자').attr('속성명','속성값) : getter Method 와 비슷
            // = 태그객체.setAttribute(속성명,값) DOM 함수

            //$('li').attr('class', 'fromjQuery0'); // 동적디자인
            // 같은 태그를 어떻게 구분해서 스타일을 적용할 것인가. 또한 반복적으로 적용되는 것은 어떻게 구현할 것인가.(for문 -> each() 함수)
            // 표현식) $('반복적으로 수행할 태그명').each(호출할 함수명 or 익명함수)
            $('li').each(forEach);
        })

        // 외부에서 따로 함수를 만들어서 each 함수를 호출해야한다.
        function forEach() {
            //$('li').attr('class', 'fromjQuery' + i); 각 li 태그의 row 별로 인식을 하지못함(한뭉탱이로 인식해서 모든 텍스트가 빨간색으로 되거나, 노란색으로 되거나..)
            $(this).attr('class', 'fromjQuery' + i);
            // $(this) : 현재 선택해서 읽어들이는 각각의 태그를 구분하는 예약어로 많이 사용한다.
            i++;
        }
    </script>
</head>
<body>
<ul>
    <%-- 1) 정적 디자인으로 디자인한 그 자체를 보여주는 부분 (jQuery 를 사용하지 않고 표현)--%>
    <%--<li class="fromjQuery">jQuery each() 연습중0</li>
    <li class="fromjQuery1">jQuery each() 연습중1</li>
    <li class="fromjQuery2">jQuery each() 연습중2</li>
    <li class="fromjQuery3">jQuery each() 연습중3</li>--%>

        <%-- 2) jQuery 를 사용해서  표현--%>
        <li>jQuery each() 연습중0</li>
        <li>jQuery each() 연습중1</li>
        <li>jQuery each() 연습중2</li>
        <li>jQuery each() 연습중3</li>
</ul>

</body>
</html>
