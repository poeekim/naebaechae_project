package studentdb;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {

    private DataSource ds; // Bean.xml 에서 불러다 사용
    // 접속 후 sql 실행을 위해 필요 (pstmt 객체 대신 사용하는 클래스 객체라고 생각하면 됨)
    // select : 쿼리   | insert, update, delete : update() 를 사용
    private JdbcTemplate jt;
    private String sql;


    @Override
    public void setDs(DataSource ds) {
        this.ds = ds;
        System.out.println("ds = " + ds);
        jt = new JdbcTemplate(ds); // JdbcTemplate(db정보객체)
        System.out.println("setDs - jt = " + jt);
    }

    @Override
    public void create(Integer id, String name, Integer age) {
        // jt.update(sql, 입력받을 매개변수명)
        sql = "insert into student values(?,?,?)";
        jt.update(sql, id, name, age);
        System.out.println("--------------------");
        System.out.println(" id = "+ id + ",  name = "+name +", age = " + age);
    }

    @Override
    public void delete(Integer id) {
        sql = "delete from student where id =?";
        jt.update(sql, id);
        System.out.println("--------------------");
        System.out.println("delete - id = "+ id);

    }

    @Override
    public void update(Integer id, Integer age) {
        sql = "update student set age=? where id=?";
        jt.update(sql, age,id);
        System.out.println("--------------------");
        System.out.println("update - age = " + age);

    }

    @Override
    public Student getStudent(Integer id) {
        sql = "select * from student where id=?";
        /* select 구문은 반환값이 있으므로 queryForObject 를 사용함
        * 표현식) 반환값 = jt객체명.queryForObject(sql, 매개변수명(배열표시),rowmapper 객체명)
        * */
        Student st = jt.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return st;
    }

    @Override
    public List<Student> listStudents() {
        sql = "select * from student";
        // 1. 실행시킬 sql 문, RowMapper객체명
        List<Student> sts = jt.query(sql, new StudentMapper());
        return sts;
    }


}
