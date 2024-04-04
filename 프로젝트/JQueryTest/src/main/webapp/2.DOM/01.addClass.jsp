
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>01.addClass.jsp</title>
    <style>
      .high_light_0 {
        background: yellow;
        font-size: 13pt;
        color: darkblue;
      }
      .high_light_1 {
        background: orangered;
        font-size: 15pt;
        /*color: darkblue;*/
      }
      .high_light_2 {
        background: blue;
        font-size: 17pt;
        /*color: darkblue;*/
      }
      .high_light_3 {
        background: green;
        font-size: 19pt;
        /*color: darkblue;*/
      }
      .high_light_4 {
        background: red;
        font-size: 21pt;
        /*color: darkblue;*/
      }
    </style>
    <script>
        $(function () {
          // 가장 첫번쨰로 위치한 h1 태그를 찾아서 css를 적용할 시 .css.css.css ..
          /*
          * jQuery 에서 스타일을 적용할 수 있다.
          * css() -> 속성명 -> 속성값을 하나씩 부여 -> css({키명:속성값;키명2:속성값2}_
          * addClass(적용시킬 클래스명) -> 한꺼번에 여러개의 스타일을 동시에 설정하고 싶을 경우,
          *             <-> removeClass(해제시킬 클래스명)
          *                 toggleClass(적용시킬 클래스명) : 이벤트 처리시
          * */
          //$('h1:first').addClass('high_light_0');

          // 콜백 함수를 이용하자 ( 매개변수로 전달된 function 함수의 실행 결과를 밖의 함수인 addClass 한테 넘겨줌)
            $('h1').addClass(function (index) {
                return 'high_light_'+index;
            })
        })
    </script>
</head>
<body>
  <h1>Item-0</h1>
  <h1>Item-1</h1>
  <h1>Item-2</h1>
  <h1>Item-3</h1>
  <h1>Item-4</h1>

</body>
</html>
