<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <title>04.json.jsp</title>
    <%--
    관련 자료 : https://sidepower.tistory.com/234
    json 표기법
    - object
    {키명:저장할값, 키명2:저장할값2, 키명3:저장할값3...}

    let or const 객체명 = {키명:저장할값, 키명2:저장할값2, 키명3:저장할값3...};
    --%>
    <script>
        let myjson = {name: "홍길동",
            age: 23,
            gender: "남",
            func: "funciton(){alert('test')}"}; // 객체명.키명(myjson.name) 으로 값을 가져올 수 있다.

        let myjson2 = {"number": 150};
        let myjson3 = {temp: true};
        let myjson4 = {temp: ["aaa", "bbb", "ccc", "ddd"]};
        let myjson5 = {name:"최민호", fColor: ["파랑", "초록","빨강"]};


        // json 객체의 특정값을 불러와서 출력시키는 함수 호출
        function print1() {
            let msg = myjson5.name + "님이 좋아하는 색깔은 "+ myjson5.fColor.length + "개 입니다.";
            msg+= " 그 중에서 가장 좋아하는 색깔은 " + myjson5.fColor[2] + "입니다."

            alert(msg);
        }

    </script>
</head>
<body>
<input type="button" value="text" onclick="print1()">
<input type="button" value="이름변경" onclick="myjson.name='테스트'; alert(myjson.name);">
<%--
    eval() 함수 : 문자열로 구성된 자바스크립트 구문을 실제 자바스크립트 구문으로 변환이 가능하다.
    1) 자바스크립트 코드로 변환
    2) 사용자로부터 값을 입력받을 때 사용

    "let re" + "sult=123"  == eval("let result = 123")
    let resutlt = 123 ( 변수 result 에 값 123을 저장한다)
    let a = function({alert('test')}  a() -> alert('test')

--%>
<input type="button" value="함수호출" onclick=" alert(myjson.func); eval('a='+myjson.func)+ a()">
</body>
</html>
