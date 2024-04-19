package studentdb;

// 결합도가 낮은 프로그램을 위해서 인터페이스로 설계(업무에 따른 메소드 선언)

import javax.sql.DataSource; // DB 연결할 때 필요
import java.util.List; // Select 할 떄 필요

public interface StudentDAO {

    // 1. DB 연결시켜주는 메소드 (DataSource 객체)
    public void setDs(DataSource ds);

    // 2. insert
    public void create(Integer id, String name, Integer age);

    // 3. select * from student where id=1;
    public Student getStudent(Integer id);

    // 4. select * from student;
    public List<Student> listStudents();

    // 5. 학생정보 삭제 delete from student where id=2;
    public void delete(Integer id);

    // 6. 학생정보 수정 update student set 수정할 필드명 = 값 where 조건식
    public void update(Integer id, Integer age);
}
