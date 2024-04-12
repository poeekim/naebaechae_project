
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>05. largeimage.jsp</title>
    <style>
        .small img {
            border: none;
            margin: 10px;
            width: 80px;
            height: 60px;
        }
    </style>
    <script>
        $(function () {
            $('.small a').hover(function (){
                    let imgname = $(this).attr('href');
                    //alert(imgname);
                // fadeIn, fadeOut, -> fadeTo(유지시간, 투명도(0 or 1), 콜백함수)
                    $('.large').fadeTo("slow", 0, function () { // 0: 안보이게 설정
                        $('.large').attr('src', imgname);

                    }).fadeTo("slow", 1); // 서서히 보이도록
            },
                function (){ // mouseout을 쓰지 않아도 되는 이유 = mouseover로도 충분히 각 이미지가 변경이 자유로움.


            })

        })
    </script>
</head>
<body>
<div class="small">
    <a href="../img/photo1.jpg"><img src="../img/photo1.jpg"></a>
    <a href="../img/photo2.jpg"><img src="../img/photo2.jpg"></a>
    <a href="../img/photo3.jpg"><img src="../img/photo3.jpg"></a>
    <a href="../img/photo4.jpg"><img src="../img/photo4.jpg"></a>
    <a href="../img/photo5.jpg"><img src="../img/photo5.jpg"></a>
    <a href="../img/photo6.jpg"><img src="../img/photo6.jpg"></a>
</div>
<img src="../img/photo1.jpg" class="large" alt="">
</body>
</html>
