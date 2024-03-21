
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.sql.Timestamp, kha.board.*" %>


<%
    request.setCharacterEncoding("utf-8");
    // BoardDTO -> Setter Method(5개) + hidden(4개)
    // BoardDAO -> insertArticle(DTO객체) 호출
%>
<jsp:useBean id="article" class="kha.board.BoardDTO" />
<jsp:setProperty name="article" property="*"/>

<%
    // 9개 -> 12개(readcount(0), default, 작성날짜, 원격  ip 주소)
    Timestamp temp = new Timestamp(System.currentTimeMillis()); // 윈도우... 컴퓨터 시간 할당
    article.setReg_date(temp); // 오늘 날짜 계산해서 수동으로 저장
    article.setIp(request.getRemoteAddr());

    BoardDAO dbPro = new BoardDAO();
    dbPro.insertArticle(article); // 입력받은 값 + 계산한 값 을 전부 저장한 article 변수를 전달
    response.sendRedirect("list.jsp"); // 새로고침 역할을 함

%>




