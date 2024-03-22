
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="kha.board.*" %>


<%
    request.setCharacterEncoding("utf-8");
    // BoardDTO -> Setter Method(5개) + hidden(2개)
    // BoardDAO -> insertArticle(DTO객체) 호출
%>
<jsp:useBean id="article" class="kha.board.BoardDTO" />
<jsp:setProperty name="article" property="*"/>

<%
    // 삭제한 게시물이 있는 페이지로 이동하기 위함
    int num = Integer.parseInt(request.getParameter("num")); // hidden
    String pageNum = request.getParameter("pageNum");
    //추가
    String passwd = request.getParameter("passwd");

    BoardDAO dbPro = new BoardDAO();
    int check = dbPro.deleteArticle(num,passwd);// 1 : 성공
    if (check == 1) { // 글 삭제에 성공
        // meta 태그 : http-equiv="Refresh" content="새로고침 초;url=이동할페이지명"
%>
<script>
    alert("성공적으로 삭제 처리 되었습니다.");
</script>
<meta http-equiv="refresh" content="0; url=list.jsp?pageNum=<%=pageNum%>">
<% }else{%>
<script> alert("비밀번호가 일치하지 않습니다. \n 비밀번호를 다시 입력하시오.")
history.go(-1); // history.back() 이랑 같음
</script>
<% } %>




