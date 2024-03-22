
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="kha.board.*, java.util.*, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<%!
    int pageSize = 5; // numPerPage : 페이지당 보여주는 게시물(레`코드)수
    int blockSize = 3; // pagePerBlock : 블럭당 보여주는 페이지수(기본값=10)
    // 작성날짜 : yyyy-MM-dd HH:mm (SimpleDateFormat)
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<%
    // 게시판을 처음 실행할 시 보여지는 화면은 무조건 1페이지(가장 최신글이 보이도록)
    String pageNum = request.getParameter("pageNum"); // 내가 클릭한 페이지 넘버
    if (pageNum == null) { // 맨처음 접속시에는 내가 클릭이 불가능하기 때문에, 1페이지 화면을 뿌려주기 위해서 pageNum 값을 1로 설정해준다.
        pageNum = "1";
    }
    // nowPage(현재 페이지(클릭해서 보고 있는 페이지))
    int currentPage = Integer.parseInt(pageNum); // "1" -> 1 (계산해야하므로)
    // 시작 레코드번호  -> (1-1)*10 +1 = 1
    int startRow = (currentPage - 1) * pageSize + 1;
    // 종료 레코드번호 1*10 =10
    int endRow = currentPage * pageSize;
    // 총 레코드 수
    int count = 0;
    // beginPerPage : 페이지별로 시작하는 맨처음에 나오는 게시물 번호 (ex. 2페이지의 가장 맨처음 게시물 번호는 11이다)
    int number = 0;
    List articleList = null; // 화면에 출력할 레코드를 저장할 변수

    BoardDAO dbPro = new BoardDAO();
    count = dbPro.getArticleCount(); // select count(*) from board;
    System.out.println("current record's count = " + count);
    if (count > 0) { // 레코드가 하나라도 존재한다면 ? -> (시작레코드, 페이지당 끊어서 보여줄 페이지 수)
        articleList = dbPro.getArticles(startRow, pageSize); // 왜 endRow가 아닌지 고민 -> endRow로 설정할시,
        // 1페이지당 보여지는 레코드수가 점점 커지므로(10, 20, 30..) pageSize 값(10)으로 고정시켜 줘야함.
        System.out.println("articleList = " + articleList);
    }
    // 만약 레코드수(count)가 122개면 -> 122-(1-1)*10 = 122 == 가장 최근 게시물의 번호는 122번임.
    number = count - (currentPage - 1) * pageSize;

%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1.글목록보기(list.jsp)</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <style>
        body{
            background:#e0ffff;
            text-align:center;
        }
        .t1{
            width:700px;
            margin:0 auto;
        }
        .td1{
            text-align:right;
            background-color:#b0e0e6;
        }
        span{
            font-weight:bolder;
            text-align:center;
        }
        .t2{ /*바깥테이블 선*/
            width:700px;
            border:1px solid black;
            border-collapse:collapse; /* 이중선 제거*/
            margin:0 auto;
        }
        tr {height:30px;}
        td{/*안쪽테이블의 선*/
            border:1px solid black;
            text-align:center;
        }
        img{ height:16px; }
    </style>
</head>
<body>
<span>글목록(전체 글:<%=count%>)</span>
<table class="t1">
    <tr>
        <td class="td1">
            <a href="writeForm.jsp">글쓰기</a>
        </td>
    </tr>
</table>
<%-- 데이터의 유무에 따라 홈페이지 표에 데이터를 출력할 것임.--%>
<%
    if (count == 0) { %>
<table class="t2">
    <tr>
        <td align="center"> 게시판에 저장된 글이 없습니다.</td>
    </tr>
</table>
    <% } else { %>
<!-- class="t2" table>tr*3>td*6-->
<table class="t2">
    <!-- 게시판의 타이틀 제목출력 -->
    <tr style="background:#b0e0e6">
        <td width="50">번호</td>
        <td width="250">제목</td>
        <td width="100">작성자</td>
        <td width="150">작성일</td>
        <td width="50">조회</td>
        <td width="100">ip</td>
    </tr>
    <!-- DB에서 데이터를 불러와서 출력하는 구문(for문) -->
    <%
        for (int i = 0; i < articleList.size(); i++) {
            BoardDTO article = (BoardDTO) articleList.get(i);
    %>
    <tr>
        <td width="50"><%=number--%></td>
        <td width="250">
            <%-- 답변 글일 경우, 답변 이미지를 먼저 부착시키자.--%>
            <%
                int wid = 0; //공백 계산을 위함.
                if (article.getRe_level() > 0) { //답변이 있을 경우
                    wid = 7 * article.getRe_level(); // 답변이 1개 있을 경우, 답변댓의 제목 들여쓰기의 정도를 계산
            %>
                <img src="images/level.gif" width="<%=wid%>" >
                <img src="images/re.gif" >
                <%
                } else { %> <%-- 게시판에서는 페이지 이동할 때마다 num 이라는 게시물번호와 pageNum 이라는 페이지번호가 항상 같이 가져간다(페이징 처리를 위함) --%>
                <img src="images/level.gif" width="<%=wid%>" >
                <% } %>
            <a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">
                <%=article.getSubject()%>
            </a>
                <%
                    if (article.getReadcount() >= 20) { %>
            <img src="images/hot.gif" ><!-- 조회수가 50이상이면 hot.gif를 출력하게 설정-->
                <% } %>
        </td>
        <td width="100"><a href="mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
        <td width="150"><%=sdf.format(article.getReg_date())%></td>
        <td width="50"><%=article.getReadcount()%></td>
        <td width="100"><%=article.getIp()%></td>
    </tr>
      <%  } %>
</table>
<% } %>
<p></p>
<%
    if (count > 0) {
        // 1. 총페이지 수 구하기
        int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
        // 2. 시작 페이지
        int startPage = 0;
        // 10의 배수가아니라면 10,20,30...
        if (currentPage % blockSize != 0) { // 1~9, 11~19, 20~29
            startPage=currentPage/blockSize*blockSize+1;
        } else { // 10의 배수인 경우 (10%10 = 0 )
            startPage = ((currentPage / blockSize) - 1) * blockSize + 1;
        }
        // 3. 종료페이지
        int endPage = startPage + blockSize - 1;
        System.out.println("startPage = " + startPage);
        System.out.println("endPage = " + endPage);
        if(endPage>pageCount) endPage = pageCount; // 마지막페이지 == 총페이지수
        //1) 이전블럭(11>10)
        if (startPage > blockSize) { %>
<!-- 페이징처리(페이지별로 나누어서 보여주는 기법) -->
<a href="list.jsp?pageNum=<%=startPage-blockSize%>">[이전]</a>
    <% }
    // 2) 현재블럭(1,2,3....10) 은 대괄호 [n] 표시할거임
    for(int i = startPage;i<=endPage;i++){ %>
<a href="list.jsp?pageNum=<%=i%>">[<%=i%>]</a>
        <% }
        // 3) 다음블럭
        if(endPage<pageCount) { %>
<a href="list.jsp?pageNum=<%=startPage+blockSize%>">[다음]</a>

        <% }
            } // if(count>0) %>
    <p></p>
    <!-- 검색어 추가(자주 검색이 되는 항목을 잘 선택) 제목,작성자,제목+본문 검색
        form>select>option*3+input:text+input:submit
    -->
    <%--
    <form name="test" action="#">
        <select name="search" >
            <option value="subject">제목</option>
            <option value="subject_content">제목+본문</option>
            <option value="writer">작성자</option>
        </select>
        <input type="text" name="searchtext" size="15">
        <input type="submit" value="검색">
    </form>
    --%>

</body>
</html>