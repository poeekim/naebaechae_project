package spring11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring10.SystemMonitor;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        /* app.xml 내에서 선언한 자식 클래스와 오버라이딩한 자식 클리스의 값을 출력 */
        SystemMonitor monitor = context.getBean("doorMonitor", SystemMonitor.class);
        System.out.println("monitor = " + monitor);
        SystemMonitor monitor2 = context.getBean("lobbyMonitor", SystemMonitor.class);
        System.out.println("monitor2 = " + monitor2);
        SystemMonitor monitor3 = context.getBean("roomMonitor", SystemMonitor.class);
        System.out.println("monitor3 = " + monitor3);

        context.close();
    }
}
