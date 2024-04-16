package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//스프링 방식에서는 따로 객체를 관리(컨테이너)=>xml 환경설정파일(관리)->어노테이션
public class HelloApp {

	//xml을 불러와서 객체를 얻어온뒤 메서드 호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.xml파일의 위치를 불러오는 방법->절대경로
		/*
		Resource resource=new 
				FileSystemResource
		("C:\\webtest\\7.spring\\sou\\SpringTest\\src\\spring\\applicationContext.xml");
		*/
		Resource resource=new ClassPathResource("applicationContext.xml");

		//2.BeanFactory(빈즈공장)을 만들어서 객체를 얻어오기
		BeanFactory factory=new XmlBeanFactory(resource);
		//3.factory에서 getBean("불러올 객체를 가져올 id값")
		//Message1 me=new Message1();
		//Message1 me=(Message1)factory.getBean("test");//Object->(Message1) or (Message2)
		//Message2 me=(Message2)factory.getBean("test2");
		MessageBeanDI me=(MessageBeanDI)factory.getBean("test2");
		System.out.println("me=>"+me);//객체생성(주소값 출력)
	    me.sayHello("테스트");
	}
}


