
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.Date"
         buffer="16kb"

%>
<html>
<head>
    <%--
        2.. 조건에 따라서 페이지를 이동할 수 있도록 해주는 검증용 페이지역할을 해준다.

    --%>
    <title> 페이지를 이동시키는 역할 </title>
    <h2> 페이지 이동(공유) move2.jsp </h2>
    <%
        // 추가할 내용
        // a.jsp, b.jsp 에게 줄 변수 값을 미리 설정한다 = 서버메모리에 저장
        int su = 100; // a.jsp 가 공유해서 사용?
        Date d = new Date(); // b.jsp 가 공유할 예정

        // 서버 메모리에 저장하기(객체만 저장됨 = collection -> HashMap(키, 값))
/*        request.setAttribute("키명",저장할값); -> 한페이지만 사용할 때
        session.setAttribute("키명",저장할값); -> 여러 페이지를 사용할 때
        application.setAttribute("키명",저장할값); -> 모든 페이지를 사용할 때 */

        request.setAttribute("total",su);
        request.setAttribute("cal", d);

        //-------------------------------------
        String move = request.getParameter("move");
        System.out.println("move = " + move);

        if (move.equals("a.jsp")) {

    %>


    <jsp:forward page='a.jsp' />
    <% } else if (move.equals("b.jsp")) {%>
    <jsp:forward page='b.jsp' />
    <% } else {%>
        <script>
            alert("당신이 요청한 페이지는 존재하지 않습니다.\n 다시 확인 후 실행하시기 바랍니다.");
            location.href = "forward.jsp"; // 홈화면 보여주기
        </script>
    <%}%>


</head>
<body>

</body>
</html>
