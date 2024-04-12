<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="kha.board.*, java.util.List, java.io.PrintWriter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>매개변수를 전달</title>
</head>
<body>
<%
   request.setCharacterEncoding("utf-8");
   String userid = request.getParameter("userid");
   System.out.println("userid = " + userid);

   // DB 연결
   BoardDAO dbPro = new BoardDAO();
   List<String> name = dbPro.getArticleId(userid);

   // 검색된 갯수만큼 <li> 태그에 담아서 전송
   for (int i = 0; i < name.size(); i++) {
      String sname = name.get(i); %>
   out.println("<li>"+ sname+"</li>");

<% } %>
<%--/*
   out.println("<li>testkim</li>");
   out.println("<li>test1</li>");
   out.println("<li>test2</li>");
   out.println("<li>test3</li>");
   out.println("<li>test4</li>");
*/--%>
</body>
</html>






