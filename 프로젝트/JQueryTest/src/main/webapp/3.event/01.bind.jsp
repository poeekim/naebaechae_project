
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>01. bind.jsp</title>
    <script>
        $(function () {
        /*
        * 형식) window.on이벤트종류명 = 호출할 함수명 or function(){ ~ }
        * 형식) windows.addEventListener(이벤트 종류명, 실행할 함수명)
        * 형식) $('이벤트 발생 대상자').bind(등록할 이벤트 종류명, 함수명 또는 function(){ ~})
        *
        * 태그의 기본적인 기능(ex.링크태그는 링크 클릭시 해당 링크로 창이 이동된다.)
        *
        * */

            // -----------------링크 클릭 시 페이지 이동되지 않도록 설정하기 -----------------
            // 매개변수를 받지 않았을 때.
/*            $('a').bind('click', function () {
                // 1) 링크를 눌러도 새창으로 이동하지 않게 설정하고 싶을 경우
                return false; // 눌러도 페이지 이동 X
            })*/

            // 매개변수를 받았을 때 (event 객체 : 마우스 클릭 좌표, 타이핑 된 글자 등)
            $('a').bind('click', function (event) {
               // let href = $('a').attr('href');  -> 어떠한 a태그에 대한 href인지 인식할 수 없어서, 어떤 걸 눌러도 페르시안 이미지에 대한 경로가 뜬다.
                // 그러므로 똑같은 태그 중에서 특정 태그를 가리킬 때 사용하는 this 를 사용해 준다.

               /* let href = $(this).attr('href');
                $('img').attr('src', href);
                위 두 문장은 아래 문장과 동일하다.
                */

                $('img').attr('src', $(this).attr('href'));



                // 1) 링크를 눌러도 새창으로 이동하지 않게 설정하고 싶을 경우
                event.preventDefault(); // 눌러도 페이지 이동 X
            })
        })
    </script>
</head>
<body>
<ul>
    <li><a href="../picCats/Persian.jpg">Persian</a></li>
    <li><a href="../picCats/RussianBlue.jpg">RussianBlue</a></li>
    <li><a href="../picCats/BritishShorthairs.jpg">BritishShorthairs</a></li>
    <p></p>
    <img >
</ul>

</body>
</html>
