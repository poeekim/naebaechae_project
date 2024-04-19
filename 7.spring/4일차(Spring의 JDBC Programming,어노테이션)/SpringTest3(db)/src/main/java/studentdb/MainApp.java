package studentdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        // 1. xml 파일을 메모리에 올리기
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


        // 2. xml -> getBean(id or name)
        StudentJDBCTemplate st = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("st = " + st); // null 인 경우 Bean.xml 오타 확인.

        // 3. DB 연동하기
        st.create(1, "홍길동", 23);
        st.create(2, "test", 22);
        st.create(3, "박영진", 43);
        st.create(4, "이준혁", 93);
        st.create(5, "김지연", 63);

        System.out.println("전체 데이터 검색 중..");
        List<Student> sts = st.listStudents();
        for (Student re : sts) { // for(객체자료형 객체명:컬렉션객체명)
            System.out.println(re.getId() + ", " + re.getName() + ", " + re.getAge());
        }

        // 만약 id 값이 2인 데이터의 age 값을 37로 수정하고 싶을 경우
        System.out.println("수정 중..");
        st.update(2, 37);

        // 삭제하고 싶을 경우
        System.out.println("삭제 중..  id값이 3인 데이터 삭제.");
        st.delete(3);
        

    }
}
