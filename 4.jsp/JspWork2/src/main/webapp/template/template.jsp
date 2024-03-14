<%-- 실질적 메인 페이지--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title> 실질적 메인 페이지 </title>
</head>
<%
    // index.jsp -> /view/indexControl.jstp -> template.jsp
    String CONTROL = request.getParameter("CONTROL");
    String PAGENUM = request.getParameter("PAGENUM");
    System.out.println("template.jsp - CONTROL = " + CONTROL +" PAGENUM =" +PAGENUM);

    // 왼쪽메뉴(jsp 조합) : /module/introLeft.jsp
    String left = "/module/" + CONTROL + "Left.jsp";
    // 본문내용 : /view/intro_01.jsp
    String content = "/view/" + CONTROL + "_"+ PAGENUM+".jsp";

    System.out.println("left = " + left);
    System.out.println("content = " + content);

%>
<body>
<center>
    <table width="800" height="600" border="1" cellpadding="0" cellspacing="0">
        <%-- 상단메뉴(top.jsp)   3행 2열--%>
        <tr height="50">
            <td colspan="2"> <%-- 모든 jsp 파일들을 합쳐서 최종 출력하기 위해 buffer 에 그대로 저장한다(flush="false" 의 이유)--%>
                <jsp:include page="/module/top.jsp" flush="false" />
            </td>
        </tr>

        <%-- 왼쪽메뉴, 가운데(본문) intro_01.jsp--%>
        <tr height="500">
            <td width="150" valign="top">
                <jsp:include page="<%=left%>" flush="false" />
            </td>
            <td width="650" valign="top">
                <jsp:include page="<%=content%>" flush="false" />
            </td>
        </tr>

        <%-- 하단(bottom.jsp)--%>
            <tr height="50">
                <td colspan="2"> <%-- 모든 jsp 파일들을 합쳐서 최종 출력하기 위해 buffer 에 그대로 저장한다(flush="false" 의 이유)--%>
                    <jsp:include page="/module/bottom.jsp" flush="false" />
                </td>
            </tr>
    </table>
</center>
</body>
</html>
