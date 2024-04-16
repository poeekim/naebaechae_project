package spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//스프링 방식에서는 따로 객체를 관리(컨테이너)=>xml 환경설정파일(관리)->어노테이션
public class HelloApp {

	//xml을 불러와서 객체를 얻어온뒤 메서드 호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("initContext.xml");
		//2.BeanFactory(빈즈공장)을 만들어서 객체를 얻어오기
		BeanFactory factory=new XmlBeanFactory(resource);
		//3.factory에서 getBean("불러올 객체를 가져올 id값")
		MessageBeanDI bean=(MessageBeanDI)factory.getBean("mBean");
		System.out.println("bean=>"+bean);//객체생성(주소값 출력)
	    bean.sayHello();//outF.out(message)
	    /*
	     Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
	      No bean named 'mBean2' is defined=>mBean2이라는 id값이 없다는 에러메세지
	                                                           오타일 가능성이 있다.
	     */
	    
	}
}


