package anno2;

import anno1.Camera;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app2.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        SystemMonitor monitor = context.getBean("monitor", SystemMonitor.class);
        System.out.println("monitor = " + monitor);

        context.close();
    }
}
