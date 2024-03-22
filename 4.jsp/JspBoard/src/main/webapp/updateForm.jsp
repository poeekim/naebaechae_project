
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="kha.board.*" %>
<%
    // content.jsp 에서 '글수정' 버튼을 눌렀을 시 updateForm.jsp?num=?&pageNum=1 파라미터 값이 넘어옴.
    int num = Integer.parseInt(request.getParameter("num"));
    String pageNum = request.getParameter("pageNum");

    BoardDAO dbPro = new BoardDAO();
    BoardDTO article = dbPro.updateGetArticle(num);
    System.out.println("------ updateForm.jsp's variable check");
    System.out.println("dbPro = " + dbPro); System.out.println("article = " + article);

%>
<html>
<head>
    <title>게시판</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="script.js"></script>
    <style>
        body{
            background-color:#e0ffff;
            text-align:center;
        }
        table{
            width:400px;
            background-color:#e0ffff;
            border:1px solid black;
            border-collapse:collapse;/* 이중선 제거 */
            margin:0 auto;
        }
        /* 같은 td인데 하나는 text-align:center이고 나머지는 다른 td는 가운데 정렬이 아니면 클래스로 구분
            input box는 가운데 정렬하면 어울리지 않는다.
        */
        .td1,.td2,.td3,.td4,.td5,.td6{
            text-align:center;
            width:70px;
            background-color:#b0e0e6;
        }
        td{
            width:330px;
            border:1px solid black;
            background-color:#e0ffff;
        }
    </style>
</head>
<body>
<span style="font-weight:bolder;color:blueviolet">글수정</span>
<br>
<form method="post" name="writeform" action="updatePro.jsp?pageNum=<%=pageNum%>" onsubmit="return writeSave()">
    <table>
        <!-- 글수정폼과 글삭제폼은 암호를 먼저 입력(암호가 맞으면 수정,삭제 가능하게 설정) -->
        <%--
        form 태그 action 속성값에 직접 pageNum을 넣어서전달하거나
        <input type="hidden" name="pageNum" value="<%=pageNum%> 를 사용하거나 둘중 하나로 진행하면 됨.
        --%>
        <input type="hidden" name="num" value="<%=num%>">
        <tr>
            <td  class="td1">이 름</td>
            <td>
                <input type="text" size="10" maxlength="10" name="writer" value="<%=article.getWriter()%>"></td>
        </tr>
        <tr>
            <td  class="td2" >제 목</td>
            <td>
                <input type="text" size="40" maxlength="50" name="subject" value="<%=article.getSubject()%>"></td>
        </tr>
        <tr>
            <td  class="td3" >Email</td>
            <td>
                <input type="text" size="40" maxlength="30" name="email" value="<%=article.getEmail()%>"></td>
        </tr>
        <tr>
            <td  class="td4">내 용</td>
            <td>
     <textarea name="content" rows="13" cols="40">
        <%=article.getContent()%>
     </textarea> </td>
        </tr>
        <tr><!-- 암호는 수정이 가능한 사람인지 확인절차이기때문에 출력X-->
            <td  class="td5">비밀번호</td>
            <td>
                <input type="password" size="8" maxlength="12" name="passwd">
            </td>
        </tr>
        <tr>
            <td colspan=2  class="td6">
                <input type="submit" value="글수정" >
                <input type="reset" value="다시작성">
                <input type="button" value="목록보기" OnClick="window.location='list.jsp?pageNum=<%=pageNum%>'">
            </td></tr>
    </table>
</form>
</body>
</html>
