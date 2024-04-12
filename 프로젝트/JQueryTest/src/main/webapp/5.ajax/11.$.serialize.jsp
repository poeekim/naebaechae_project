<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>$.serialize().jsp</title>
    <script>
        $(function () {
            $('#submit').click(function (){
                $('#result').empty(); // 이전의 내용은 지우고, 새로운 내용 추가

/*                1) serialize() 함수 이용하기

                let form_data = $('form').serialize(); // form 태그 안에 모든 태그들의 값들을 가져올 수 있음.
                $('#result').text(form_data);
                // userid=nup&username=123&password=123&hobby=music&hobby=yoga&hobby=sports*/

/*                // 2) json 표기법 형식으로 데이터 전달하기
                let form_data = $('form').serializeArray(); // 배열형태로 데이터를 전송(입력 받은 순서대로 인덱스 번호를 구분한다)
                $.each(form_data, function (index,items){
                    $('#result').append(items.name + " = " + items.value + "<br>");
                })*/

                // 3. serialize() 함수를 이용하되, post 방식
                let form_data = $('form').serialize(); // form 태그 안에 모든 태그들의 값들을 가져올 수 있음.
                $.post('form.jsp',form_data,function(data){
                    $('#result').html(data);
                })
            })
        })

    </script>
</head>
<body>
<%--
    String userid= (String)session.getAttribute("idKey);
--%>
<form action="">
    <input type="hidden" name="seq" value="nup">
    <label>이름을 입력 : </label>
    <input type="text" name="username"><br>
    <label>암호을 입력 : </label>
    <input type="password" name="password"><br>
    <input type="checkbox" name="hobby" value="music">music
    <input type="checkbox" name="hobby" value="yoga">yoga
    <input type="checkbox" name="hobby" value="sports">sports
    <input type="button" id="submit" value="전송">

</form>
<hr>
<div id="result"></div>
</body>
</html>
