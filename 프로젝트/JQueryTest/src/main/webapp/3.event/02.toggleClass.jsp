
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>02. toggleClass.jsp </title>
    <style>
        p {
            margin: 4px;
            font-size: 16px;
            font-weight: bolder;
            cursor: pointer;
        }
        .blue{
            color: blue;
        }
    </style>
    <script>
        $(function () {
            $('p').click(function (){
            //$('p').bind('click', function () {
                // 표현식) $('선택자').toggleClass(적용 시킬 클래스명)
                // addClass()  <-> removeClass()
                $(this).toggleClass('blue'); // $(this) = 클릭한 p 태그를 의미한다.

            })

        })
    </script>
</head>
<body>
    <p class="blue">엘리먼트에 적용된 클래스를</p>
    <p>추가하고 제거하기를 반복적으로 실습합니다.</p>
</body>
</html>
