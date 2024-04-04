
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="../jquery-3.4.1.min.js"></script>
    <title>01. ready.jsp</title>
    <script>

        /*
        * $(documnet) : ready 문서를 읽어들일때 실행하는 함수
        * 근데 요즘은 ready() Event는 1.8 버전에서는 deprecated 되었으며 3.0에서는 지원하지 않기 때문입니다.
        * $(function){} 을 사용함
        * ex.) $(handler){기능}       $(function(){기능}
        * */
        $(document).ready(function (){
            alert("$(document).ready(funtion()) 으로 함수 호출");
        })

        /*        // window.on 이벤트종류명 = 호출할 함수명 또는 익명함수    ->  불러오는 문서의 화면 디자인이 복잡하면 불러오는 속도가 느린 단점이 있음.
        window.onload = function () {
            alert("window.onload 로 함수 호출");
        }*/
        /*
        function test() {
            alert("jQuery 소개");
        }*/

        // let 변수명  = function(){내용}
    /*    let test = function () {
            alert("이름이 없는 함수(익명)로 jQuery 소개");
        }*/
    </script>
</head>
<body>
<%--<body onload="test()">--%>

</body>
</html>
