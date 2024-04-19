package anno6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // 환경 설정 자바파일(AppConfig.java) 을 불러오는 컨텍스트 객체를 생성해야 한다(환경설정파일명.class)

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
        * 2가지 옵션
        * 1) context객체명.getBean(객체를 얻어올 클래스명.class)
        * 2) context객체명.getBean("빈즈클래스 구분id", 객체를 얻어올 클래스명.class)
        * */

        MyBean b = context.getBean("getBeanName()",MyBean.class);
        System.out.println("bean = " + b);
        System.out.println("b.getBeanName() = " + b.getBeanName());

        context.close();



    }
}
