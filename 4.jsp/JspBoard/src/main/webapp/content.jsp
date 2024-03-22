
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="kha.board.*, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글상세보기</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="script.js"></script>
    <!-- updateForm.html에서 스타일 가져올것(복사) -->
    <style>
        body{
            background-color:#e0ffff;
            text-align:center;
        }
        table{
            width:500px;
            background-color:#e0ffff;
            border:1px solid black;
            border-collapse:collapse;/* 이중선 제거 */
            margin:0 auto;
        }
        /* 같은 td인데 하나는 text-align:center이고 나머지는 다른 td는 가운데 정렬이 아니면 클래스로 구분
            input box는 가운데 정렬하면 어울리지 않는다.
        */
        tr{height:30px;}
        .td1,.td2,.td3,.td4,.td5,.td6{
            background-color:#e0ffff;
        }
        td{
            width:125px;
            border:1px solid black;
            background-color:#b0e0e6;
            text-align:center;
        }
    </style>
</head>
<%
    int num = Integer.parseInt(request.getParameter("num"));
    String pageNum = request.getParameter("pageNum");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    BoardDAO dbPro = new BoardDAO();
    BoardDTO article = dbPro.getArticle(num);
    System.out.println("dbPro = " + dbPro);
    System.out.println("article = " + article);

    // 링크 문자열을 줄이기 위함
    int ref = article.getRef();
    int re_step = article.getRe_step();
    int re_level = article.getRe_level();
    System.out.println("----- Variable from content.jsp -----");
    System.out.println("num = " + num);
    System.out.println("ref = " + ref);
    System.out.println("re_step = " + re_step);
    System.out.println("re_level = " + re_level);
%>
<body>
<span>글내용 보기</span>
<br>
<!-- form>table>tr*5>td*4 -->
<form>
    <table>
        <tr>
            <td>글번호</td>
            <td class="td1"><%=article.getNum()%></td>
            <td>조회수</td>
            <td class="td2"><%=article.getReadcount()%></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td class="td3"><%=article.getWriter()%></td>
            <td>작성일</td>
            <td class="td4"><%=sdf.format(article.getReg_date())%></td>
        </tr>
        <tr>
            <td>글제목</td>
            <td class="td5" colspan="3"><%=article.getSubject()%></td>
            <!--
            <td></td>
            <td></td> -->
        </tr>
        <tr>
            <td>글내용</td>
            <td class="td6" style="text-align:left;width:375px;" colspan="3">
                    <pre><!-- 형식유지 태그-->
                    <%=article.getContent()%>
                    </pre>
            </td>
            <!--
            <td></td>
            <td></td> -->
        </tr>
        <tr><!-- -->
            <td colspan="4" style="text-align:right">
                <input type="button" value="글수정"
                       onclick="document.location='updateForm.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'">
                <input type="button" value="글삭제"
                       onclick="document.location='deleteForm.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'">
                <input type="button" value="답글쓰기"
                       onclick="document.location='writeForm.jsp?num=<%=num%>&ref=<%=ref%>&re_step=<%=re_step%>&re_level=<%=re_level%>'">
                <input type="button" value="글목록"
                       onclick="document.location='list.jsp?pageNum=<%=pageNum%>'">
            </td>
            <!--
            <td></td>
            <td></td>
            <td></td> -->
        </tr>
    </table>
</form>
</body>
</html>