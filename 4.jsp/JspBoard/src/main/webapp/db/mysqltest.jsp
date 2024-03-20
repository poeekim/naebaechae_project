

<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>MySQL DB 접속확인 예제</title>
</head>
<body>
<%-- 1. 오라클 접속  2. 테이블 생성  3. insert   4. select (테이블태그 사용) --%>
    <%
        Connection con = null; // 커넥션 객체(연결객체) 의 초기화.

        // 표현식) jdbc:oracle:thin:@상대방접속IP주소:접속포트번호:SID
        String url = "jdbc:mysql://localhost/mydb?characterEncoding=UTF-8&serverTimezone=UTC";

        // ------------- SQL -------------------
        Statement stmt = null; // create table
        PreparedStatement psmt = null; // insert into
        Statement stmt2 = null; // select
        ResultSet rs = null; // select 검색결과를 표형태로 저장
        String sql = ""; // sql 구문을 저장

        // --------------- DB 연결하기 -------------------
        try {
            // ---- 1. 접속할 드라이버를 메모리에 업로드(상위패키지명.하위패키지명...클래스명)
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.jdbc.Driver");//

            // ----- 2. con 얻어오기 (DriverManager.getConnection(접속할url, "아이디", "비번");
            con = DriverManager.getConnection(url, "root", "1234");
            System.out.println("con 주소값 = " + con);

            // ----- 3. 추가(테이블 생성) create table -> smt
            stmt = con.createStatement(); // 문장객체를 얻어온다.
            sql = "create table MyTest (name varchar(20),age int)";
            int create = stmt.executeUpdate(sql);//  실행이 되면 0을 반환
            System.out.println("테이블 성공? : " + create);

            // ---- 4. insert
            psmt= con.prepareStatement("insert into MyTest values(?,?)"); // 외부로부터 입력 받는 값이면 물음표로 표시한다.
            // 형식(pstmt 객체명.setString or setInt,setDouble... (?순서,입력할값)
            psmt.setString(1, "hong");
            psmt.setInt(2, 23);
            int insert = psmt.executeUpdate(); // 실행이 되면 0을 반환
            System.out.println("insert = " + insert); // 1 : 성공   0: 실패

            // ---- 5. select   -> 필드별로 출력해보기
            stmt2 = con.createStatement();
            String sql2 = "select * from MyTest";
            rs = stmt2.executeQuery(sql2);
            %>
            <table border="3" cellspacing="0" cellpadding="0">
                <tr bgcolor="pink">
                    <th>name</th>
                    <th>age</th>
                </tr>
                <%
                    while (rs.next() == true) { // 이동시킬 레코드가 계속 존재하는 한 웹에 뿌린다.
                %>
                <tr>
                    <td><%=rs.getString("name")%></td>
                    <td><%=rs.getString(2)%></td>
                </tr>
                <%
                    }
                    // --- 6. 메모리 해제 (에러유발과 상관없이 반드시 처리하고 프로그램 종료)
                    rs.close();
                    stmt2.close();
                    psmt.close();
                    stmt.close();
                    con.close();
                %>
       <% } catch (Exception e) {
            System.out.println("DB 접속 실패했거나 SQL 구문이 잘못되었다. 확인해라 " + e);
        }
        %>
            </table>

</body>
</html>