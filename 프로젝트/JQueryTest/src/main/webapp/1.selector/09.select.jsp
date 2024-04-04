
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>09. select.jsp </title>
    <script>
        $(function () {
            /*
            * 요소:selected  -> select 태그의 option 객체중에서 선택된 태그를 가리킬 때 사용.
            *
            * 1. setTimeout(호출할 함수명 | 익명함수,초단위(1000 기본값))  == 1초 뒤 한번만 실행 후 종료
            * 2. setInterval(호출할 함수명 | 익명함수,초단위(1000 기본값)) == 1초 마다 반복해서 실행. (일종의 스레드 기능을 대신한다)
            * // 실행할 함수(매개변수(함수)) ==> callback 함수라고 말함.
            * */
            setTimeout(function () {
                let value = $('select > option:selected').val() // select 태그 안에 selected 속성값을 가진 option태그의 값을 가져와라.
                alert(value);
                console.log(value);
            },5000); // 5초 뒤에 선택한 항목을 출력

        })
    </script>
</head>
<body>
<h2>select 태그</h2>
<select name="" id="">
    <option value="">화면구현1</option>
    <option value="" selected>오라클</option>
    <option value="">자바</option>
    <option value="">JSP</option>
    <option value="">GIT</option>
    <option value="">화면구현2(jQuery&Bootstrap)</option>
</select>
</body>
</html>
