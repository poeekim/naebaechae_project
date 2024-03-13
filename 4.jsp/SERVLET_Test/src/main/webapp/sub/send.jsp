<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-03-12
  Time: PM 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사용자로부터 값을 입력(전송폼)</title>
</head>
<body>
<h1>요청을 받아서 처리해 주는 서블릿 예제2</h1>
<%--
method ="get" : get 방식으로 서버에서 요청  -> doGet()에 작성 (자동호출)
method ="post" : post 방식으로 서버에게 요청 -> doPost()에 작성(자동호출)
                                            service() 둘다처리(get or post)

표현식) action="/현재프로젝트명/실행시킬 서블릿명"
        action ="/SERVELET_Test/GetDate  -> GetDate 서블릿을 요청해서 실행시킨다는 의미
        GetDate?name=김현아&addr=서울
        요청문서?전달할 매개변수명=전달할 값&매개변수2=값&~

./SERVLET_Test/GetDate
--%>
<form method="post" action="/GetDate">
    이름 : <input type="text" name="name" size="20"><p>
    주소 : <input type="text" name="addr"><p>

    <input type="submit" value="보내기">
</form>
</body>
</html>
