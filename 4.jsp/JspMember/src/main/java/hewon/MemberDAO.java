package hewon;
/*
* 웹상에서 호출할 메소드를 작성(업무분석) -> DB 연결 된 후 호출(has a  관계)
*       : 비즈니스 로직 빈
* */

import java.sql.*;
import java.util.*;

public class MemberDAO {

    // 1. 멤버변수에 연결할 클래스의 객체를 선언한다(DB 연결하기 위해)
    private DBConnectionMgr pool = null;
    // getConnection() ->> connection 필요 freeConnection 해제

    // 1-1 공통으로 접속할 경우(필요로 하는 멤버변수
    private Connection con = null;
    private PreparedStatement pstmt = null; // sql 실행목적
    private ResultSet rs = null; // select
    private String sql = "";

    // 2. 생성자를 통해서 자동으로 객체를 얻어올 수 있도록 설계
    public MemberDAO() {
        try {
            pool = DBConnectionMgr.getInstance();
            System.out.println("pool = " + pool);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    // 3. 요구분석에 따라서 웹상에 호출할 메소드를 작성 -> flow-chart

    // ----- 1) 회원로그인 (id,passwd)
    // select id, passwd from member where id = 'nup' and passwd = '1234';
    public boolean loginCheck(String id, String passwd) { // LoginProc.jsp 호출
        // 1-1) DB 연결
        boolean check = false; // 로그인 인증 여부

        // 1-2) SQL 구문 처리
        try {
            con = pool.getConnection();
            System.out.println("con = " + con);
            sql = "select id, passwd from member where id = ? and passwd = ?"; // 웹 상에서 입력받는 값들은 물음표로 설정해준다.
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, passwd);
            rs = pstmt.executeQuery();
            check = rs.next(); // DB 내 데이터 값이 있으면 true, 없으면 false


        } catch (Exception e) {
            System.out.println("loginCheck() 실행 중 에러 발생. " + e); // DB 연결 오류 발생 시 처리해주는 클래스
        } finally {
            // 1-3) 메모리 해제
            pool.freeConnection(con, pstmt, rs);

        }
        return check;
    }

    // ----- 2) 중복 id체크
    // select id from member where id='kkk';
    public boolean checkId(String mem_id) {

        boolean check = false; // 중복아이디 체크 여부

        // 1-2) SQL 구문 처리
        try {
            con = pool.getConnection();
            sql = "select id from member where id = ?"; // 웹 상에서 입력받는 값들은 물음표로 설정해준다.
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mem_id);
            rs = pstmt.executeQuery();
            check = rs.next(); // DB 내 데이터 값이 있으면 true, 없으면 false
            System.out.println("MemberDAO - checkId - check = " + check);


        } catch (Exception e) {
            System.out.println("checkId() 실행 중 에러 발생. " + e); // DB 연결 오류 발생 시 처리해주는 클래스
        } finally {
            // 1-3) 메모리 해제
            pool.freeConnection(con, pstmt, rs);

        }
        return check;
    }


    // ----- 3) 우편번호 검색 : 직접테이블 생성, 입력, 찾기, OpenAPI 사용
   /*
   select * from zipcode where area3 like '미아2동%'; -- 14개
*
* ★★★★★★★★ select zipcode,area1 from zipcode where area3 like '%미아2동%'; ★★★★★★★
* ★★★★★★★★반환형(필드 한개이상 담을려면 어떤 자료형?)=> DTO형으로 데이터를 담아야 된다. ★★★★★★★
* 14개를 하나의 객체로 만들어야 하므로 ArrayList를 사용한다.

 반환형 -> 필드 한개 (필드에 맞는 자료형), 필드2개이상(DTO클래스형)  레코드 한개이상(=> ArrayList)
 */

    public ArrayList<ZipcodeDTO> zipcodeRead(String area3) {
    // 1. 한개 이상의 레코드를 담을 객체 선언
        ArrayList<ZipcodeDTO> ziplist = new ArrayList<>();
        try {
            con = pool.getConnection();
            // sql 구문
            sql="select * from zipcode where area3 like '"+area3+"%'";
            // 물음표를 안쓰는 이유 : sql 구문이 제대로 쓰여졌는지 확인하기 어려움.(system.out.println(sql) 했을 때 물음표가 들어가있으면 물음표로 나옴)
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            System.out.println("sql 구문 = " + sql);
            // 검색된 레코드의 값을 필드별로 담는 소스 코드를 작성해야 함. (레코드의 갯수가 정해져 있지 않으므로, for 문을 쓰지 않고 while 문을 쓴다.)

            while (rs.next()==true) { // 찾은 레코드가 존재할 경우
                // DB 에서 찾은 데이터를 필드별로 저장? 담는다.
                ZipcodeDTO tempZipcode = new ZipcodeDTO(); // 필드별로 저장할 객체를 생성
                tempZipcode.setZipcode(rs.getString("ZIPCODE"));
                tempZipcode.setArea1(rs.getString("AREA1"));
                tempZipcode.setArea2(rs.getString("AREA2"));
                tempZipcode.setArea3(rs.getString("AREA3"));
                tempZipcode.setArea4(rs.getString("AREA4"));

                // ArrayList 에 담는 구문을 꼭 작성할 것.
                ziplist.add(tempZipcode);
            }
            //check = rs.next();
        } catch (Exception e) {
            System.out.println("zipcodeRead() - e = " + e);
        } finally {
            pool.freeConnection(con, pstmt, rs);
        }
        return ziplist;
    }


    // ---- 4) 회원가입

    // ---- 5) 수정할 회원을 찾기

    // ---- 6) 회원수정

    // ---- 7) 회원탈퇴

    // ---- 8) 회원리스트 : 게시판의 글목록보기 (관리자)


}
