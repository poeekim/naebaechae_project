package anno6;

/*
* xml 대신 bean class를 등록해, 환경설정을 해주는(@Configuration 사용) 파일
*
* */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    /*
    * <bean id="getBeanName" class="anno6.MyBeanImpl"/ > 과 동일
    *
    * @Bean : <bean> 태그를 이용하여 beans를 등록시켜주는 것과 동일하게 대신 등록을 도와주는 어노테이션
    *
    * 표현식) @Bean
    *       public 객체를 얻어올 자료형(type) 메소드명() {
    *       객체를 얻어오는 구문 작성
    *       return 객체명; }
    * */

    @Bean
    public MyBean getBeanName() {
        /*
        * MyBean my = new MyBeanImpl();
        * return my;
        * */
        return new MyBeanImpl();
    }
}
