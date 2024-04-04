
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>04. append2.jsp</title>
    <script>
        $(function () {
            /*
	         함수             설명
	    $(A).append(B)->B를 A의 기존자식의 뒤에 추가할때 사용
	    $(A).prepend(B)->B를 A의 기존자식의 앞에 추가할때 사용

	    $(A).after(B)->B를 A뒤에 추가할때 사용(자식에 추가 X)
	    $(A).before(B)->B를 A앞에 추가할때 사용(자식에 추가 X)


            */
             // $('div').append('<h1>jQueryTest222</h1>');
            // $('div').prepend('<h1>jQueryTest444</h1>');
            //(3)  $('div').after('<h1>DOMTest555</h1>');
            // $('div > h1').css('color','red').before('<h1>DOMTest 6666</h1>');

            // width 크기를 지정 -> 비례해서 자동적으로 height도 설정된다.
            $('img').attr('width',300).before('<h1>DOMTest 7777</h1>');//이미지 앞에 배치



        })
    </script>
</head>
<body>
<div>
    <h1>안녕하세요</h1>
</div>
<h1>반갑</h1>
<img src="../picCats/Persian.jpg" alt="">
</body>
</html>
