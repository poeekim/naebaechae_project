package spring;

//                  LgTV                           TV
public class Message1 implements MessageBeanDI {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕 "+name+"씨!");
	}
}
