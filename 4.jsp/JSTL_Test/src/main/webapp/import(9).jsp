
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
  String url = "https://www.naver.com"
  <c:import url="접속할 사이트 주소" var = "접속해서 가져올 데이터를 저장할 변수명" />
  escapeXml="true" -> 태그 자체를 문자열로 인식하여 문자형태로 출력(디폴트값)
  escapeXml="false" -> 본문내용 그대로 (html을 실행한 결과 그대로) 메인 페이지를 화면캡처한 모습 그대로 출력

--%>
<c:set var="url" value="https://www.naver.com"/> <%-- 1. 변수선언 및 초기화--%>
<c:import url="${url}" var="u"/>
<c:out value="${url}"/> 가져온다 <p> <%-- 사이트 url 가져온다--%>
  <c:out value="${u}" escapeXml="false"/>

<h4>내부자원을 가져오기</h4>
<%--
chooseTag(5).jsp?name2=bk 접속한 실행결과를 가져와서 출력
--%>
<c:set var="url" value="chooseTag(5).jsp"/><%-- 2. 변수를 한번선언(수정을 의미)--%>
<%--<c:import url="${url}" var="u"/>  매개변수를 전달하지 않은 경우 --%>
<c:import url="${url}" var="u">
  <c:param name="name2" value="bk"/>
</c:import>
<c:out value="${u}" escapeXml="false"/>
</body>
</html>
