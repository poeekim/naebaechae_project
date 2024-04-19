package com.spring.anno5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String[] configLocation = new String[]{"app2_Scan.xml"};

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.registerShutdownHook();

//        HomeController2 home = context.getBean("homeController2", HomeController2.class);
        HomeController2 home2 = context.getBean("home", HomeController2.class); // Camera.java 15row 에서 @Component(name="home")으로 id명을 지정해놓음.
        System.out.println("home2 = " + home2);

        context.close();
    }
}
