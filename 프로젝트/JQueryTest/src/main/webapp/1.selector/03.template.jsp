<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-02
  Time: AM 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>03. template.jsp </title>
    <script>
        $(function () {
            // 태그 객체를 얻어오려고 한다. id document.getElementByID("id값")
            // 태그 이름을 이용해서 태그 객체를 얻어올 때 document.getElementsByTagName('태그명')

            //let test = document.getElementsByTagName('h2');
            let test = $('h2');
/*            alert(test);
            test.css('font-family', '궁서체');
            test.css('font-size', '30pt');
            test.css('color', 'red');

            특정 태그에 대해서 함수를 호출할 때, 여러개의 함수를 마치 체인처럼 연결해서
            호출하는 방식 = 체이닝 메소드 방법
            */
            test.css('font-family', '궁서체')
                .css('color', 'blue').css('border','4px black solid');

        })
    </script>
</head>
<body>
<h2>jQuery CSS 연습</h2>
</body>
</html>
