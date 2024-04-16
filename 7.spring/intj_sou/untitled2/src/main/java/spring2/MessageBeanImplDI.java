package spring2;

//인터페이스를 상속받은 자식클래스
public class MessageBeanImplDI implements MessageBeanDI {

	//DI를 이용해서 객체를 가져오는 방법=>멤버번수에 저장
	private String name1,name2;//생성자(Constructor Injection)(주입)
	private String greeting;//Setter Injection(메서드를 통해서 객체를 넣어주는 방법)
	//다른 생성자가 이미 존재하면 기본생성자는 안만들어준다. 생성자를 호출X
	//--------------has a 관계(의존관계)----------------------
	private OutFile outF;//private OutFileImpl outF;
	//수정=>연결된 다른 클래스의 내용을 가능한 덜 수정할 수 있도록 설계
	
	public void setOutF(OutFile outF) {
		this.outF = outF;
		System.out.println("setOutF() 호출됨(outF)=>"+outF);
	}
	//----------------------------------------------------------
	//1.<constructor-arg>태그를 이용해서 값을 임의로 지정해서 값을 전달(생성자 호출해서)
	public MessageBeanImplDI(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
		System.out.println("MessageBeanImplDI 생성자 호출됨!!");
	}
    
	//2.<property>태그를 이용해서 Setter Method호출=>임의의 값을 전달
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("setGreeting()호출됨(greeting)=>"+greeting);
	}

	@Override
	public void sayHello() { //out(message) 호출
		// TODO Auto-generated method stub
		String message=greeting+name1+","+name2+"!";
		System.out.println("message=>"+message);
		//OutF객체를 이용해서 out(message) 호출
		try {
			outF.out(message);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------
	}

}
