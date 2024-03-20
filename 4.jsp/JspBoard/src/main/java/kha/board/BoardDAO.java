package kha.board;
import java.sql.*;
import java.util.*;

// DBConnectionMgr(DB접속)
// BoardDTO : 매개변수, 반환형으로 사용 또는 데이터를 담는 역할을 한다.
// BoardDAO : DBConnectionMgr 을 이용하여, 실제 DB에 데이터를 select, insert, update등 할 수 있도록 하는 역할을 한다.
public class BoardDAO {
    // 10개의 연결 객체(커넥션 pool 객체)

    // ---------------  1. 연결할 클래스 객체를 선언한다(멤버변수)
    private DBConnectionMgr pool = null;
    // 공통
    private Connection con = null;
    private PreparedStatement pstmt = null; // 속도향상
    private ResultSet rs = null; // select 구문 시 필요
    private String sql = ""; // 실행시킬 sql 구문 저장용 변수


    // ---------------  2. 생성자를 통해서 연결한다


    public BoardDAO() {
        try {
            pool = DBConnectionMgr.getInstance();
            System.out.println("pool = " + pool);

            System.out.println("-------DB Connection Success--------");
        } catch (Exception e) {
            System.out.println("DB 접속 오류 - e = " + e);
        }
    }

    // --------------- 3. 웹 페이지 상에서 호출할 메소드를 요구분석에 따라서 작성

    // 1) 페이징 처리를 위한 전체 레코드수가 반드시 필요.
    public int getArticleCount() {
        int x = 0; // 총레코드 수를 저장할 변수

        try {
            // DB 접속 및 sql 구문 실행
            con= pool.getConnection();
            sql = "select count(*) from board";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                x = rs.getInt(1); // select count = 필드명이 없다. == rs.getString("필드명")을 사용할 수 없으므로, rs.getInt(인덱스번호)를 사용함.
            }
            //System.out.println();
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            // sql 객체의 메모리 해제
            pool.freeConnection(con, pstmt, rs);
        }
        return x;
    }


    // 2) 페이지 번호에 따라서 한페이지에 몇번째 레코드부터 몇개씩 출력할 것인지 지정해주는 메소드
    // ex. 한페이지당 게시물은 10개씩 보여주되, 전체 레코드 수는 500개 이므로 1페이지에 500번째 게시물~490번째 게시물만 보이도록 설정

    public List getArticles(int start, int end) {
        List articleList = null; // ArrayList<BoardDTO> articleList = null; 과 동일

        try {
            con = pool.getConnection();
            /*
            * ref : 그룹번호 -> num과 같은 기능??
            * re_step : 답변글..?
            * ---> 그룹번호 최근순으로 정렬하되, 만약에 답변글이 나오는 순서는 오름차순으로 정렬하라
            * == 몇번째 레코드번호를 기준으로, 몇개까지 정렬할 것인가를 지정하는 sql 구문.
            * */
            sql = "select * from board order by ref desc, re_step limit ?,?"; // limit ?,? == between ? and ?;
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, start - 1); // MySQL 은 레코드 순번이 0부터 시작하므로 start 에서 -1 해줌.
            pstmt.setInt(2, end); // 최대 몇개까지 담을지 .. (10, 15, 20...)
            rs = pstmt.executeQuery();
            // 누적의 개념 : do~while 구문 사용
            if (rs.next()) { // 보여줄 레코드가 있을 시
                articleList = new ArrayList(end); // ~ArrayList(10) : end 갯수만큼 데이터 공간 생성하라
                do {
                    BoardDTO article = new BoardDTO();

                    article.setNum(rs.getInt("num")); // 게시물 번호 
                    article.setWriter(rs.getString("writer")); // 작성자 
                    article.setEmail(rs.getString("email")); // 이메일 
                    article.setSubject(rs.getString("subject")); // 글제목
                    article.setPasswd(rs.getString("passwd")); // 작성자

                    article.setReg_date(rs.getTimestamp("reg_date")); // 게시날짜  
                    article.setReadcount(rs.getInt("readcount")); // 조회수  
                    article.setRef(rs.getInt("ref")); // 글 그룹번호
                    article.setRe_step(rs.getInt("re_step")); // 답변글의 순서
                    article.setRe_level(rs.getInt("re_level")); // 답변글의 답변에 대한 깊이 (들여쓰기)

                    article.setContent(rs.getString("content")); // content
                    article.setIp(rs.getString("ip")); // ip

                    articleList.add(article); // 필수!!!!

                } while (rs.next());

            }

            System.out.println("");
        } catch (Exception e) {
            System.out.println("getArticles() - e = " + e);
        } finally {
            pool.freeConnection(con, pstmt, rs);
        }
        return articleList; // 최대 10개가 들어가니, list.jsp 내에서 for 문을 이용해 필드별로 출력할 예정.
    }
















}
