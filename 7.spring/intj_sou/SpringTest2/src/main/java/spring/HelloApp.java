package spring;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

// 스프링 방식에서는 따로 객체를 관리(컨테이너) => xml 환경설정파일(관리) => 요즘은 @를 이용한 어노테이션을 많이 사용
public class HelloApp{
    public static void main(String[] args) {

    }
}
