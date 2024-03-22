
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 글쓰기</title>
    <link href="style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="script.js?ver=1"></script>
    <style>
        body{
            background:#e0ffff;
            text-align:center;
        }
        table{
            width:400px;
            background-color:#e0ffff;
            border:1px solid black;
            border-collapse:collapse;/*이중선 제거*/
            margin:0 auto;
        }
        /* 같은 태그면서 서로 다른 스타일 적용->클래스선택자 부여   */
        .td1,.td2,.td3,.td4,.td5,.td6{ /* 타이틀 제목 */
            text-align:center;
            width:70px;
            background-color:#b0e0e6;
        }
        td{ /*본문 */
            width:330px;
            border:1px solid black;
            background-color:#e0ffff; /* text-align:left */
            text-align:left;/* default 반영 만약에 반영X 강제 left 부여 O */
        }
    </style>
</head>
    <%
        // list.jsp(글쓰기) : 신규글    |   content.jsp(글상세보기) : 답변글
        int num = 0, ref = 1, re_step = 0, re_level = 0;
        // content.jsp 에서 매개변수가 전달
        if (request.getParameter("num")!=null) { //전달 받았을 경우
            num = Integer.parseInt(request.getParameter("num"));
            ref = Integer.parseInt(request.getParameter("ref"));
            re_step = Integer.parseInt(request.getParameter("re_step"));
            re_level = Integer.parseInt(request.getParameter("re_level"));
            System.out.println("----- Variable from content.jsp -----");
            System.out.println("num = " + num);
            System.out.println("ref = " + ref);
            System.out.println("re_step = " + re_step);
            System.out.println("re_level = " + re_level);
        }
    %>
<body>
<span style="font-weight:bolder;color:blueviolet;">글쓰기</span>
<br>
<!-- form>table>tr*7>td*2 -->
<%--
    onsubmit 이벤트 = "return 호출할 함수명()"
    -> return true 인 경우에만 action 속성값으로 이동한다. -> 자동으로 writePro.jsp로 데이터 전송
    (정보를 제대로 입력하지 않고 <input type="submit" value="글쓰기"> 를 눌렀을 경우를 대비)

    입력 받는 데이터 5개 + 입력받지 않는 데이터 4개(hidden 속성 사용)

--%>
<form action="writePro.jsp" method="post" name="writeform" onsubmit="return writeSave()">
    <%-- 입력 받지 않는 데이터들을 hidden 속성값으로 설정--%>
    <input type="hidden" name="num" value="<%=num%>">
    <input type="hidden" name="ref" value="<%=ref%>">
    <input type="hidden" name="re_step" value="<%=re_step%>">
    <input type="hidden" name="re_level" value="<%=re_level%>">

    <table>
        <tr>
            <td style="background-color:#b0e0e6;text-align:right" colspan="2">
                <a href="http://192.168.0.109:8090/JspBoard/list.jsp">글목록</a>
            </td>
            <!-- <td></td> -->
        </tr>
        <tr>
            <!-- 이름 -->
            <td class="td1">이름</td>
            <td>
                <input type="text" name="writer" size="10" maxlength="10">
            </td>
        </tr>
        <!-- 제목 -->
        <tr>
            <td class="td2">제목</td>
            <td>
                <input type="text" name="subject" size="40" maxlength="40">
            </td>
        </tr>
        <!-- Email -->
        <tr>
            <td class="td3">Email</td>
            <td>
                <input type="text" name="email" size="40" maxlength="40">
            </td>
        </tr>
        <!-- 내용 -->
        <tr>
            <td class="td4">내용</td>
            <td>
                <textarea name="content"  cols="42" rows="13"></textarea>
            </td>
        </tr>
        <!-- 비밀번호 -->
        <tr>
            <td class="td5">비밀번호</td>
            <td>
                <input type="password" name="passwd" size="8" maxlength="8">
            </td>
        </tr>
        <!-- 버튼의 종류(글쓰기,다시작성,목록보기) -->
        <tr>
            <td colspan="2" class="td6">
                <!--  input:submit+input:reset+input:button -->
                <input type="submit" value="글쓰기">
                <input type="reset" value="다시작성">
                <input type="button" value="목록보기"  onclick="document.location='list.jsp'">
            </td>
            <!-- <td></td> -->
        </tr>
    </table>
</form>
</body>
</html>
