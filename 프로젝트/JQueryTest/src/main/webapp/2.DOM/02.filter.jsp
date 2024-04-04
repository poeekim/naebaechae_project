
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>01.filter.jsp - each 함수 사용하기</title>
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

            /*
            * jQuery에서 특정 태그를 검색 : contains(특정단어) , not(찾는 선택자)(범위)
            *  표현식)
            *   $('선택자').filter('찾는 조건에 해당하는 선택자(태그/속성선택자)')
            * */
            // $('h1:even').css({backgroundColor:'Black',color:'white'})
            // $('h1').filter(':even').css({backgroundColor:'Black',color:'white'})

            $('h1').filter(function (index) {
            //return index%2==1
                 return index%2==0
            }).css({backgroundColor:'yellow', color: 'black'})

            /*
            * 제어문 -> if 문 형식과 비슷 ($('선택자').is('찾을 조건') ---> true/false 값을 얻는다.
            * */
            $('h1').each(function () {
                // $(this) : each 함수는 현재 읽어들이는 태그 대상자를 지칭 시 this 를 써야함.
                if ($(this).is('.select')) {
                    $(this).css('background', 'pink').css('font-size', '16pt').css('color', 'blue');
                } else {
                    $(this).css('background', 'green');
                }
            })


        })
    </script>
</head>
<body>
  <h1>Item-0</h1>
  <h1 class="select">Item-1</h1>
  <h1 id="txt">Item-2</h1>
  <h1>Item-3</h1>
  <h1>Item-4</h1>

</body>
</html>
