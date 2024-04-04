
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>07. attr.jsp </title>
    <style>
        input{
            width: 300px;
        }
    </style>
    <script>
        $(function () {
            // 같은 태그일 때 , 어떻게 각각의 태그를 다르게 인식해서 처리할 것인가?
            /*
            * 같은 태그일때는 속성을 가지고 구분=> 속성선택자이용
        `	     선택자 속성          설명
                 요소[속성명]->특정 속성을 가진 태그를 찾을때 사용
                 요소[속성명=값]-> 속성값이 일치하는 태그를 찾아라
                 요소[속성명!=값]-> 속성값이 일치하지않는 태그를 찾아라(일치하는 태그외의 전부)

                 요소[속성명^=값]-> 지정한값으로 시작하는 태그를 찾아라
                 요소[속성명|=값]-> 지정하는값을 찾거나 지정한글자- 태그를 찾아라
                 요소[속성명$=값]-> 지정한 값으로 끝나는 태그를 찾아라
                 요소[속성명*=값]-> 지정한 값을 포함한 태그를 찾아라(ex sql의 like연산자 비슷)
                 요소[속성명~=값]-> 지정한값을 단어로서 포함하는 태그를 찾아라(단어중심으로)`
            *
            * */
            $('button[name]').text("버튼 텍스트 바뀐다"); // 버튼 태그 중에 name 속성이 있는 버튼만 text를 바꿔라.
            $('input[type=password]').css('background', 'orange');

            //$('input[type]').val("셋 둘 하나"); // input 태그 중에 type 속성이 있는 input 태그 내  text를 바꿔라.
            $('input[type=text]').val("텍스트 들어가요");
           // $('input[type!=text]').val("type 값이 text 아닌거에 다 들어가요");

            // div 태그 중 id 속성값이 content- 로 시작하는 태그 값의 글자색을 변경하라.
            $('div[id^=content-]').css('color', 'red');

            // div 태그 중 id 속성값이 content의 배경색을 변경하라.
            $('div[id|=content]').css('background', 'brown');

            // div 태그 중 id 속성값이 2로 끝나는 태그값의 폰트크기와 배경색을 변경하라.
            $('div[id$=2]').css('font-size', '20pt').css('background', 'yellow');

            // input 태그 중 id 속성값이 '한국' 을 포함하는 단어찾아라(공백 인식X)
            $('input[id*=한국]').css('font-size', '30pt').css('background', 'pink');

            $('input[name~=한국]').css('border', 'solid 4px blue');
        })
    </script>
</head>
<body>
    <h3>속성 선택자 이용하기 (같은 태그일때)</h3>
        <button name="btb">버튼1</button>
        <button>버튼2</button><br>

        <input type="text">
        <input type="password"> <br>
        <input name="한국" value="한국">
        <input name="한국인" value="한국인">
        <input name="한국 민" value="한국 민">
        <input name="대한민국" value="대한민국">

        <div id="content-1">DIV content-1</div>
        <div id="content-2">DIV content-2</div>

        <input id="한국" value="한국">
        <input name="한 국인" value="한 국인">
        <input name="한국민" value="한국민">
        <input name="대한민국" value="대한민국">

</body>
</html>
