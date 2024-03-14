<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String CONTROL = null; // 전달할 페이지명(=본문내용에 불러올 파일명)
    String PAGENUM = null; // 페이지 번호

    try {
        CONTROL = request.getParameter("CONTROL");
        PAGENUM = request.getParameter("PAGENUM");
        System.out.println("indexControl.jsp - CONTROL = " + CONTROL +" PAGENUM =" +PAGENUM);
        if (CONTROL.equals(null)) {
            CONTROL = "intro"; // 값이 들어오지 않았을 경우에, 정상구동을 위하여 값을 넣어준다.
        }
        if (PAGENUM.equals(null)) {
            PAGENUM = "01";
        }
    } catch (Exception e) {
        e.printStackTrace();
    }


%>

<jsp:forward page="/template/template.jsp">
    <jsp:param name="CONTROL" value="<%=CONTROL%>" />
    <jsp:param name="PAGENUM" value="<%=PAGENUM%>" />
</jsp:forward>
