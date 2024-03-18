

<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>오라클 DB 접속확인 예제</title>
</head>
<body>
<%-- 1. 오라클 접속  2. 테이블 생성  3. insert   4. select (테이블태그 사용) --%>
    <%
        Connection con = null; // 커넥션 객체(연결객체) 의 초기화.
        // 표현식) jdbc:oracle:thin:@상대방접속IP주소:접속포트번호:SID
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";

        // --------------- DB 연결하기 -------------------
        try {
            //1. 접속할 드라이버를 메모리에 업로드(상위패키지명.하위패키지명...클래스명)
            Class.forName("oracle.jdbc.driver.OracleDriver"); //
            // 2. con 얻어오기 (DriverManager.getConnection(접속할url, "아이디", "비번");
            con = DriverManager.getConnection(url, "SCOTT", "tiger");
            System.out.println("con 주소값 = " + con);
            // 3.
        } catch (Exception e) {
            System.out.println("DB 접속 실패했거나 SQL 구문이 잘못되었다. 확인해라 " + e);
        }

    %>


</body>
</html>
