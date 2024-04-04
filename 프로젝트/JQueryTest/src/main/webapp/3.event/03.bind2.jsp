<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>03. bind2.jsp</title>
    <script>
        $(function () {

            /*
            * 이벤트 연결방식 2가지
            * 1. bind 함수를 사용하는 경우 : 현재 발생시킬 이벤트 종류 뿐만 아니라, 다른 이벤트도 연결이 가능 ( on함수로 대체 가능)
            * 2. bind 함수를 사용하지 않는 경우 : 현재 발생시킬 이벤트만 처리(개별처리)
            * */

            $('img').bind({ // 요즘은 bind 를 안쓰고 on을 많이 씀. (unbound, off : 연결해제)
                mouseout:function(){ // 마우스가 벗어날 때(원래 이미지로 변경)
                    $('img').attr('src','../picCats/Persian.jpg');
            },  mouseover:function(){ // 마우스 갖다 댈 때
                $('img').attr('src','../picCats/Abyssinian.jpg');
            }, click:function(){
                alert("bind 함수를 이용한 테스트중");

            }
            })
        })
    </script>
</head>
<body>
<img src="../picCats/Persian.jpg" width="200" height="200" alt="">
</body>
</html>
