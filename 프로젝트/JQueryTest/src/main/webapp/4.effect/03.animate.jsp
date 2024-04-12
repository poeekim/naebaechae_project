<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>03.animate.jsp</title>
    <script>
        $(function () {
            $('.btn1').on('click',function (){
                /*
                * 표현식) $('효과대상자').animate(스타일 속성, 유지시간, 가속도(늦게 또는 빠르게), 처리함수)
                *   swing -> 처음, 끝은 느리게, 중간은 빠르게 움직인다.
                * */
                $('.txt1').animate({
                    marginLeft:"500px",
                    fontSize: "30px",

                },2000,"swing",function (){
                    alert("모션효과 완료");
                })
            })

            $('.btn2').on('click',function (){
                $('.txt2').animate({
                    marginLeft:"50px",
                    fontSize: "30px",

                },2000,"linear",function (){
                    alert("모션효과2 완료");
                })
            })
        })
    </script>
</head>
<body>
    <p><button class="btn1">버튼1</button></p>
    <span class="txt1">500px 로 이동</span>

    <p><button class="btn2">버튼2</button></p>
    <span class="txt2">50px 로 이동</span>


</body>
</html>
