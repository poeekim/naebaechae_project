
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
 //  response.sendRedirect("https://www.naver.com"); // 외부 공유 X. URL 경로가 변경이 되면서 화면이 바뀜
    //response.sendRedirect("chooseTag(5).jsp?name2=bk"); // 액션태그로 이동

    /*  response.sendRedirect("이동할 페이지명"); 과 같은 명령문 ->
     <c:redirect url="이동할 페이지명" />   ---> 단순히 페이지 이동만 할 때


    * <c:redirect url="이동할 페이지명">
        <c:param name="전달할 매개변수명" value="전달할값">
        <c:param name="전달할 매개변수명2" value="전달할값2">
        <c:param name="전달할 매개변수명3" value="전달할값3">
        ,,,
        </c:redirect/>

        == response.sendRedirect("chooseTag(5).jsp?age2=20");
    *
    * */
%>
<c:redirect url="chooseTag(5).jsp">
    <c:param name="age2" value="20"/>
</c:redirect>
