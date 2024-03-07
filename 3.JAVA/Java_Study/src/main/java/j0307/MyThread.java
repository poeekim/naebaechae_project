package j0307;

class Test2{
	String name;
}
//2.Runnable 인터페이스를 상속받아서 작성=>run() 기능
/*
* - Thread 상속받는 경우 : Thread 가 가지고 있는 멤버 변수, 메소드 그대로 사용이 가능하다.
* - Runnable 인터페이스를 상속받는 경우 : run()이라는 기능을 오버라이딩하는 것이기 때문에, 기본적인 기능이 없음.
* 										 최소한의 스레드 기능만 실행할 수 있는 정도.
*
* */
public class MyThread extends Test2 implements Runnable {

	//Thread의 기능을 작성
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//A~Z 65
		while(true) {
			System.out.println("is Running");
		   try {
				Thread.sleep(1000);//1000=>1초동안 멈췄다가 다시 실행
				System.out.println
				("쓰레드 이름=>"+Thread.currentThread().getName()); // Runnable 을 상속받기 때문에 Thread.getName()을 사용하지 못하여
			   // Thread.currentThread().getName() 으로 이름을 가져온다.
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		}
	}
	public static void main(String[] args) {
      //1.Runnable인터페이스를 상속받은 자식클래스의 객체를 생성
	  MyThread mt=new MyThread();
	  //2.Thread객체를 생성->생성자내부에 매개변수로 자식클래스객체 전달
	  Thread t=new Thread(mt,"테스트");//1.자식객체명 2.쓰레드이름부여
	  //t.setName("테스트") 도 가능
	  //3.start()->run()호출
	  t.start();
	}
}








