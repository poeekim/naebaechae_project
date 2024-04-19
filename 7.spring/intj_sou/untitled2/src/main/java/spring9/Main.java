package spring9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring7.Customer;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"applicationContext.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        // 4. xml 파일에서 만들어진 객체 불러오기(Method 호출)
        /*
        * spring 2.5 방식 : 객체를 먼저 생성하고, 원하는 자료형으로 형변환 시켜서 사용
        *
        * spring 3.n ~ 4.n 중반 방식 : 처음부터 형변환 시켜서 객체를 사용
        * 형식) getBean("의존성객체를 얻어올 id 값", 형변환 시킬 클래스명.class)
        *
        * */

        ProtocolHanderFactory factory = context.getBean("protocolHanderFactory", ProtocolHanderFactory.class);
        System.out.println("factory = " + factory);

        // 5. context 객체 메모리 해제 재 확인 (모든 빈즈 객체들의 메모리를 해제한다)
        context.close();
    }
}
