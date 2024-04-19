package studentdb;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
* RowMapper 인터페이스 : select 구문을 실행(mapRow()) 자동 호출. - callback method라 DTO 에 담아서 결과를 반환해 준다.
* */

public class StudentMapper implements RowMapper<Student> {

    // 1. ResultSet rs(테이블 정보)  2. 검색된 레코드 갯수 -> 갯수만큼 for문 돌려서 데이터 담아 반환
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("maprow() 호출됨 + " + rowNum);
        // while(rs.next()) {담아주는 구문}
        Student st = new Student();
        st.setId(rs.getInt("id"));
        st.setName(rs.getString("name"));
        st.setAge(rs.getInt("age"));
        return st;
    }

}
