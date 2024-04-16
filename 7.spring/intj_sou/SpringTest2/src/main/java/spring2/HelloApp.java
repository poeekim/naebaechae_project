package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 스프링 방식에서는 따로 객체를 관리(컨테이너) => xml 환경설정파일(관리) => 요즘은 @를 이용한 어노테이션을 많이 사용
public class HelloApp {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:initContext.xml");
        MessageBeanImplDI myBean = context.getBean("myBean", MessageBeanImplDI.class);
       // MessageBeanDI2 myBean= (MessageBeanDI2) context.getBean("mBean");
        myBean.sayHello();


    }
}
