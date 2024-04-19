package anno1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app2.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

        Camera camera = context.getBean("camera", Camera.class);
        System.out.println("camera = " + camera);

        context.close();
    }
}
