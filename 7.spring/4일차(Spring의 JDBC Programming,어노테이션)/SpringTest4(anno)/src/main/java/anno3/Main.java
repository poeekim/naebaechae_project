package anno3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app2.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        HomeController home = context.getBean("homeController", HomeController.class);
        System.out.println("home = " + home);

        context.close();
    }
}
