package spring3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

    // 1. 메모리관리 - xml 파일이 여러개 존재하므로 파일명을 부여해서 배열로 관리한다.( 여러개일 경우 {"abc.xml","aaa.xml","bbb.xml"..};
        String[] configLocation = new String[]{"applicationContext.xml"};

        // 2. xml 파일을 메모리에 올려서 작업(클래스) - 객체생성
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        // 3. 자바 프로그램이 종료되면 자동으로 context 객체의 메모리를 해제할 수 있도록 설정
        context.registerShutdownHook();

        // 4. xml 파일에서 만들어진 객체 불러오기(Method 호출)
        SystemMonitor monitor = (SystemMonitor) context.getBean("monitor");
        System.out.println("monitor = " + monitor);

        // 5. context 객체 메모리 해제 재 확인 (모든 빈즈 객체들의 메모리를 해제한다)
        context.registerShutdownHook();
    }
}
