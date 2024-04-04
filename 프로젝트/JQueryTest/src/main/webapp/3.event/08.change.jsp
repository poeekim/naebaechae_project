<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-04-04
  Time: PM 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>Title</title>
    <script>
        $(function () {
        // $('#sel').on('change',function(event){})
            $('#sel').change(function (event){
                $('#sel').change(function(event){
                    $('#ig1').attr('src',$(event.target).val());
                })

                /*let imgSrc = $(event.target).val(); // 입력양식객체의 값 -> val()
                alert(imgSrc);
                $('#ig1').attr('src', imgSrc); // 뜯어온 imgSrc 를 아이디가 ig1 인 속성에 값을 넣어줌*/
        })
        })
    </script>
</head>
<body>
<form action="" name="frm">
    <table>
        <tr>
            <td>
                <select name="" id="sel">
                    <option value="../picCats/Persian.jpg">Persian</option>
                    <option value="../picCats/Abyssinian.jpg">Abyssinian</option>
                    <option value="../picCats/exoticShorthair.jpg">exoticShorthair</option>
                </select>
            </td>
            <td><img src="" alt="" id="ig1"></td>
        </tr>
    </table>
</form>
</body>
</html>
