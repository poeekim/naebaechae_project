<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kim.*" %>
<%
  Board data = (Board) request.getAttribute("data"); //  == ${data}

  // 웹상에 출력
  int num = data.getNum();
  String title = data.getTitle();
  String author = data.getAuthor();
  String content = data.getContent();

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내용보기 및 수정</title>
</head>

<%--
 게시물 번호를 매개변수로 전달하는 방법 tip
 1) hideen 객체를 이용할 것(입력X). 추천
 2) hidden 객체를 사용하지 않을 것 (입력상자를 사용 : readonly="readonly"로 설정하여 수정불가하도록 해야함)

url 에 데이터들 안보이고 싶으면 form 태그 속성값에 method="post" 를 적으면 됨.
--%>
<body>
  <form action="update.do">
  번 호 : <input type="text" name="num" value="<%= num %>" readonly="readonly" /><br>
  제 목 : <input type="text" name="title" value="<%= title %>"><br>
  작성자:<input type="text" name="author" value="<%= author %>"><br>
  내 용 : <textarea name="content" rows="5" cols="30"><%= content %></textarea><p/>
  <input type="submit" value="수정완료" />&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="delete.do?num=<%= num %>">삭제</a>
  &nbsp;&nbsp;<a href="list.do">목록보기</a>
</form>
</body>
</html>