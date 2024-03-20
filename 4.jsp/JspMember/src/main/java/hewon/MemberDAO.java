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

    // ---------------------------------------- 1) 회원로그인 (id,passwd)
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

    // ------------------------------------------ 2) 중복 id체크
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


    // ----------------------------------------- 3) 우편번호 검색 : 직접테이블 생성, 입력, 찾기, OpenAPI 사용
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


    // ----------------------------------------------------------- 4) 회원가입
    /*
     * insert into member values(?,?,?,?,?...)
     * */
    public boolean memberInsert(MemberDTO mem) { // 8개 값이 넣어야되는데, 이미 MemberDTO 클래스 내부에 8개의 매개변수를
        // 선언했으므로 MemberDTO mem 으로 작성 가능하다.
        boolean check = false; // 회원가입 성공 유무
        try {
            con = pool.getConnection();
            // Oracle 일 경우 Transaction 처리(commit)를 필수로 해줘야함
            con.setAutoCommit(false); // 자동 commit 안되도록 설정
            // sql 구문
            sql = "insert into member values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mem.getMem_id());
            pstmt.setString(2, mem.getMem_passwd());
            pstmt.setString(3, mem.getMem_name());
            pstmt.setString(4, mem.getMem_email());
            pstmt.setString(5, mem.getMem_phone());
            pstmt.setString(6, mem.getMem_zipcode());
            pstmt.setString(7, mem.getMem_address());
            pstmt.setString(8, mem.getMem_job());

            int insert = pstmt.executeUpdate(); //  insert, update, delete, create, alter, drop 일 경우 executeUpdate 를 씀.
            con.commit();
            System.out.println("insert(데이터 입력유무) = " + insert); // 1 - 성공  | 0 - 실패
            if (insert > 0) {
                check = true;
                System.out.println("데이터 입력 완료");
            }

        } catch (Exception e) {
            System.out.println("memberInsert() - e = " + e);
        } finally {
            pool.freeConnection(con, pstmt); // rs 는 select 문에서만 사용하므로 해당 insert 구문에서는 메모리 해제할 필요가 없음.

        } return check;

    }

    // --------------------------------------------------------------- 5) 수정할 회원을 찾기
    // select * from member where id='nup'

    public MemberDTO getMember(String mem_id) {
        MemberDTO mem = null;

        try {
            con= pool.getConnection();
            sql = "select * from member where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, mem_id);
            rs = pstmt.executeQuery();
            System.out.println("sql 구문 = " + sql); // select 구문을 실행할 때 사용하는 메소드
            // id 값에 해당하는 레코드를 찾아야함
            if (rs.next()) {
                // 데이터가 있음 -> Setter Method의 매개변수로 저장 : 웹에 출력 Getter Method
                mem = new MemberDTO();
                mem.setMem_id(rs.getString("id"));
                mem.setMem_passwd(rs.getString("passwd"));
                mem.setMem_name(rs.getString("name"));
                mem.setMem_phone(rs.getString("phone"));
                mem.setMem_zipcode(rs.getString("zipcode"));
                mem.setMem_address(rs.getString("address"));
                mem.setMem_email(rs.getString("email"));
                mem.setMem_job(rs.getString("job"));
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            pool.freeConnection(con,pstmt,rs);
        }
        return mem; // MemberUpdate.jsp 에게 반환
    }

    // -------------------------------------------------------------------- 6) 회원수정
    public boolean memberUpdate(MemberDTO mem) {
        boolean check = false; // 회원수정 성공 유무
        try {
            con = pool.getConnection();
            // Oracle 일 경우 Transaction 처리(commit)를 필수로 해줘야함
            con.setAutoCommit(false); // 자동 commit 안되도록 설정
            // sql 구문
            sql = "update member set passwd=?, name=?, email=?, " +
                    "phone=?, zipcode=?, address=?, job=? where id=?";

            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, mem.getMem_passwd());
            pstmt.setString(2, mem.getMem_name());
            pstmt.setString(3, mem.getMem_email());
           // System.out.println("mem.getMem_email() = " + mem.getMem_email());
            pstmt.setString(4, mem.getMem_phone());
            pstmt.setString(5, mem.getMem_zipcode());
            pstmt.setString(6, mem.getMem_address());
            pstmt.setString(7, mem.getMem_job());
            pstmt.setString(8, mem.getMem_id());
            int update = pstmt.executeUpdate();
            con.commit();
            System.out.println("update(데이터 수정유무) = " + update); // 1 - 성공  | 0 - 실패
            if (update > 0) {
                check = true;
                System.out.println("데이터 수정 완료");
            }

        } catch (Exception e) {
            System.out.println("memberUpdate() - e = " + e);
        } finally {
            pool.freeConnection(con, pstmt, rs); // rs 는 select 문에서만 사용하므로 해당 insert 구문에서는 메모리 해제할 필요가 없음.

        } return check;
    }


    // -------------------------------------------------------------------- 7) 회원탈퇴
    /*
     1. SQL 문이 두개가 필요하다
        1) select passwd from member where id ='아이디명'
        2) delete from member where id = '아이디명'
     */

    public int memberDelete(String id, String passwd) {
        String dbpasswd = ""; // DB내에서 찾은 암호를 저장하기 위함. (매개변수 passwd와 비교해야하므로)
        int x = -1; // 회원탈퇴 유무 구별

        try {

            con = pool.getConnection();
            // 트랜잭션 처리
            con.setAutoCommit(false); // 자동 commit 안되도록 설정
            System.out.println("----------------------");
            sql = "select passwd from member where id =?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            // 암호를 찾았다면
            if (rs.next()) {
                dbpasswd = rs.getString("passwd");
                System.out.println("dbpasswd = " + dbpasswd);
                // dbpasswd (DB상의 암호) 와 passwd(웹상의 암호) 일치유무 -> 삭제 진행
                if (dbpasswd.equals(passwd)) { // 암호가 일치할시
                    sql = "delete from member where id = ?";
                    pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, id);
                    int delete = pstmt.executeUpdate();
                    System.out.println("회원탈퇴 성공 여부(delete) = " + delete); // 1 : 탈퇴 O
                    con.commit(); // 트랜잭션 완료
                    x = 1;
                } else { // 암호 일치 X
                    x = 0;
                    System.out.println("회원 탈퇴 실패. 비밀번호를 확인하십시오");

                }
            }else { // 암호가 존재하지 않는다면 (이 부분은 생략가능. why? 애초에 회원가입시 암호를 필수입력하므로, 암호가 존재하지 않는 케이스는 발생되지 않음)
                x = -1;
            }

        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            pool.freeConnection(con, pstmt, rs);
        }return x; // deletePro.jsp 에서 x값을 받아서 처리


    }


    // ------------------------------------------------------------------- 8) 회원리스트 : 게시판의 글목록보기 (관리자)

    }





