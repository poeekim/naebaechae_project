package spring;

//결합도를 낮추기위해서 유연성때문에 인터페이스 작성(공통의 메서드를 작성)
public interface MessageBeanDI {
	public void sayHello(String name);
}
