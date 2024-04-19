package spring6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.SystemMonitor;

public class Main {
    public static void main(String[] args) {

    // 1. 메모리관리 - xml 파일이 여러개 존재하므로 파일명을 부여해서 배열로 관리한다.( 여러개일 경우 {"abc.xml","aaa.xml","bbb.xml"..};
        String[] configLocation = new String[]{"applicationContext.xml"};

        // 2. xml 파일을 메모리에 올려서 작업(클래스) - 객체생성
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        // 3. 자바 프로그램이 종료되면 자동으로 context 객체의 메모리를 해제할 수 있도록 설정
        context.registerShutdownHook();

        // 4. xml 파일에서 만들어진 객체 불러오기(Method 호출)
        /*
        * spring 2.5 방식 : 객체를 먼저 생성하고, 원하는 자료형으로 형변환 시켜서 사용
        *
        * spring 3.n ~ 4.n 중반 방식 : 처음부터 형변환 시켜서 객체를 사용
        * 형식) getBean("의존성객체를 얻어올 id 값", 형변환 시킬 클래스명.class)
        *
        * */


        // SystemMonitor monitor = (SystemMonitor) context.getBean("monitor"); // 구버전
        PerformanceMonitor monitor = context.getBean("performanceMonitor", PerformanceMonitor.class);
        PerformanceMonitor monitor2 = context.getBean("performanceMonitor", PerformanceMonitor.class);
        PerformanceMonitor monitor3 = context.getBean("performanceMonitor", PerformanceMonitor.class);
        System.out.println("monitor = " + monitor);
        System.out.println("monitor2 = " + monitor2);
        System.out.println("monitor3 = " + monitor3);

        // 주소값 비교
        System.out.println("monitor==monitor2 -> "+ (monitor==monitor2));
        System.out.println("monitor==monitor2 -> "+ (monitor==monitor2));

        // 5. context 객체 메모리 해제 재 확인 (모든 빈즈 객체들의 메모리를 해제한다)
        context.close();

    }
}
