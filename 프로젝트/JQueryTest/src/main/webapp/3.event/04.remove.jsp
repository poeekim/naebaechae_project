<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-04
  Time: AM 9:33
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
            // $('#button').bind  or $('#button1').on('click(이벤트명,function({})

            /*
            * remove : 태그 자체가 사라지기 때문에 추후 내용을 추가가 불가.
            * empty() : 태그는 존재하고, 내용만 삭제되는 것이기 때문에 추후 내용 추가가 가능.(append)
            *
            * */
            $('#button1').click(function(){ // id 속성값이 button1 인 버튼을 클릭했다면,
                $('#div1').remove(); // 태그 삭제(내용까지 삭제하므로, sql 로 따지면 drop table 테이블명과 비슷하다.)
            })
            $('#button2').click(function(){ // Empty div
                $('#div1').empty(); // 특정 태그(부모)의 자식태그를 포함.(자식태그들을 부모의 내용물로 간주) 내용삭제 (delete from table ..)
            })
            $('#button3').click(function(){ // Empty p
                $('.test').empty(); // delete from ~ : 특정 태그의 내용만 삭제
            })
        })
    </script>
</head>
<body>
    <div id="div1" style="height: 100px; width: 300px; border: 1px solid black; background: yellow">
        <p class="test" style="height: 50px; width: 50px; border: 1px solid black; background: yellow">div first</p>
    </div>
    <br>
    <button id="button1"> Remove div</button>
    <button id="button2"> Empty div</button>
    <button id="button3"> Empty p</button>


</body>
</html>
