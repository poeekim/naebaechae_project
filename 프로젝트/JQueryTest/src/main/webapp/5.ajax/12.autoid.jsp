<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="autoid.css" type="text/css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>12.autoid.jsp</title>
    <script>
        $(function () {
            $('.listbox').hide(); // 검색어 입력을 하지 않을 때는 목록상자가 보이지 않음.
            $('.userid').keyup(function (){ // 검색어 입력을 했을시
                let uid = $('.userid').val();
                let param = "userid=" + uid;

                // $.ajax() : $.post() | $.get()
                $.ajax({
                    type:'post',// 요청방식
                    url:'autoid.jsp', // 스프링에서는 url:'autoid.do' 라고 쓴다
                    data:param, // data: 전달할 매개변수명
                    success:function (args){ // args : DB에서 보내준 값'
                        $('.listbox').show(); // 검색목록을 보여주는 테두리를 보이게 한다
                        $('.namelist').html(args); // <li> 태그로 찾은 값을 보여줄 것이므로 text() 가 아닌 html()을 사용한다.
                        // <li> 찾은 값 </li> 태그에 하이라이트 효과 주기
                        $('li').hover(function (){ // mouseover
                            $(this).addClass('hover'); // this 는 마우스 hover 해놓은 li 태그를 뜻함
                            },function (){ // mouseout
                            $(this).removeClass('hover');
                        })
                        // 검색할 목록 중에서 원하는 하나의 항목을 클릭
                        $('li').click(function (){
                            $('.userid').val($(this))
                            $('.listbox').hide();
                        })

                    }

                })
                return false;
            })
        })
    </script>
</head>
<body>
    <h2>검색할 id 를 입력하시오</h2>
    <form action="">
        검색어 : <input type="text" name="userid" class="userid"> <br>
        <div class="listbox">
            <div class="namelist">

            </div>
        </div>
    </form>
</body>
</html>
