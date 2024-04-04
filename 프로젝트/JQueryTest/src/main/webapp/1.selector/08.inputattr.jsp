<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>08. inputattr.jsp </title>
    <script>
        $(function () {

            /*
            * 입력양식에 관련된 필터 속성 선택자 -> 요소[속성=값] ->  요소:속성명  으로 작성 가능
            * 요소:button -> input 태그중에서 type 속성이 button인 경우
            *                   disable <-> enabled
            * 요소:reset(초기화), 요소:submit(전송)
            * 요소:text, 요소:checkbox (checked - 체크불가)
            * 요소:file(파일첨부), 요소:image, 요소:password, 요소:radio
            *
            * */

            // checked : 실행 후 첫 호면에서 미리 체크가 되어 있도록 하는 속성
            // disabled : 비활성화(버튼 클릭 할 수 없음)

            // !!! input 태그 중에서 속성명이 type 인 것중 value 값에 값을 입력해라
            // $('input[type=text]').val("값");
            // input 태그일 경우에만 콜론을 사용하여 간단하게 표현할 수 있다. ->    :text == type 속성이 text인 태그 찾기(필터선택자)
            $('input:text').val("값");
            $('input:password').css('background', 'pink').val('핑크색');
            $('input:button').val('필터속성'); // value 값에 '필터속성' 텍스트 입력
            $('input:disabled').attr('disabled',false); // 비활성화 되어 있는 것 해제하라.(= 활성화)
            $('input:checkbox').attr('checked',false); // 기본값으로 설정된 checked 해제하라.
            console.log("console.log 는 내장객체");

        })
    </script>
</head>
<body>
    <h1>jQuery 필터 선택자</h1>
    <input type="text">
    <input type="password">
    <input type="button">
    <button>버튼2</button>
    <hr>
    <input type="checkbox" name="city" value="서울" checked="checked">서울
    <input type="button" value="확인" disabled="disabled">

</body>
</html>
