
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {
            // 중첩된 동일한 태그를 어떻게 얻어오고, 내용을 검색할 수 있음? 스타일은 어떻게 적용?
            let nodes = $('#root').children().css('color','red'); // === let nodes = document.getElementById('root');
            alert("자식들의 수 : " + nodes.length); // 4

            let txt = ""; // 자식들의 이름을 저장할 변수
            let html = "";
            let val = "";
            /*
            * 1. text() : 태그의 텍스트만 가져오는 함수 (Getter) <-> text(변경할 값) : 태그의 텍스트를 수정하는 함수 (Setter)
            * 2. html() : 태그와 텍스트들까지 같이 가져오는 함수(Getter) <-> html(변경할 값(태그포함)) : (Setter)
            * 3. val() : 입력 폼 안의 입력양식에 해당되는 값을 가져올 때 사용하는 함수 (Getter) <-> val(inputbox에 저장할 값)  (Setter)
            * */
            // 표현식) $('반복적으로 수행할 태그명').each(호출할 함수명 or 익명함수)
            $('#root').children().each(function () {
                txt += $(this).text()+" "; // each 함수 내부에서는 각태그를 $(this) 로 구분한다.
                // txt += $('div').text()+" "; -> 한번 읽을 때마다 div 를 뭉탱이로 다 읽어서 원하는 결과물을 얻지 못함

                html = $(this).html()+" "; //
                val = $(this).val()+" "; //

            })
            alert("txt = " + txt);
            alert("html = " + html);
            alert("val = " + val);
        })
    </script>
</head>
<body>
<div id="root"> <%-- 부모태그 --%>
    <div><b>홍길동</b></div>
    <div>테스트</div>
    <div><i>임시</i></div>
    <div>임시테스트</div>
</div>

</body>
</html>
