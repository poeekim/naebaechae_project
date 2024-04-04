<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-04
  Time: AM 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {

            /*
            * event 객체 : 이벤트를 발생시킨 객체에 대한 정보를 가지고 있는 객체.
            * (ex. 클릭한 좌표값, 마우스버튼의 누른 버튼 종류)
            * */
            $('img').bind('dblclick',function(event){
                let target = $(this); // 이벤트를 발생시킨 이벤트 객체를 의미.
                alert(target.width() + "," + target.height);
                target.width(target.width()*2);

                target.unbind();

            })
            document.on('mouseover',function (event){
                $('.posX').text(event.pageX); // e.pageX -> 좌표값 (속성명)
                $('.posY').text(event.pageY); // e.pageX -> 좌표값 (속성명)

            })
        })
    </script>
</head>
<body>
<img src="../picCats/Persian.jpg" width="200" height="200" alt="">
    <p>x : <span class="posX">0</span></p>
    <p>y : <span class="posY">0</span></p>
</body>
</html>
