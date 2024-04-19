package spring10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring9.ProtocolHanderFactory;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        SystemMonitor monitor = context.getBean("systemMonitor", SystemMonitor.class);
        System.out.println("monitor = " + monitor);

        context.close();
    }
}
