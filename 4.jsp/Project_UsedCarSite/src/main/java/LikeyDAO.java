import java.sql.*;
import java.util.*;


public class LikeyDAO {
    // 1. 멤버변수에 연결할 클래스의 객체를 선언한다(DB 연결하기 위해)
    private DBConnectionMgr pool = null;
    // getConnection() ->> connection 필요 freeConnection 해제

    // 1-1 공통으로 접속할 경우(필요로 하는 멤버변수
    private Connection con = null;
    private PreparedStatement pstmt = null; // sql 실행목적
    private ResultSet rs = null; // select
    private String sql = "";

    // 2. 생성자를 통해서 자동으로 객체를 얻어올 수 있도록 설계
    public LikeyDAO() {
        try {
            pool = DBConnectionMgr.getInstance();
            System.out.println("pool = " + pool);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    public int like(String userID, int bbsID) {
        String SQL = "insert into likey values (?, ?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, userID);
            pstmt.setInt(2, bbsID);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;// 추천 중복 오류
    }


}
