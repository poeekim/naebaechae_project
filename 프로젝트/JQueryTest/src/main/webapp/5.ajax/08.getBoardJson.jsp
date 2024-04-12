<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="kha.board.*, java.sql.*" %>


[
<%
    // 게시물 번호를 key로
    // [num:1 , writer:'홍길동', content:'~~~']
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    DBConnectionMgr pool = null;
    String sql = "";

    try {

        System.out.println();

    }
    catch (Exception e) {
        System.out.println("getBoardJson.jsp에 대한 에러 유발" + e);
    }
    finally {
        pool.freeConnection(conn, pstmt, rs);
    }

%>

]


</body>
</html>
