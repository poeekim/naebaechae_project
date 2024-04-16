package spring;

//                  Samsung TV                           TV
public class Message2 implements MessageBeanDI {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("반가워요 "+name+"님!");
	}
}
