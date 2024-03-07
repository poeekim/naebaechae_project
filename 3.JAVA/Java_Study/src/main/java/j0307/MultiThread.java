package j0307;

// 1. Thread 만드는 방법 : Thread 클래스를 상속받아서 run()을 오버라이딩하면 된다.

public class MultiThread extends Thread{

    MultiThread(String s) {
        // this.setName(s); <-> getName() 쓰레드이름
        super(s);
    }
    @Override
    public void run() {
        for (char i = 'A'; i <= 'Z';i++) {
            try {
                Thread.sleep(500); // 1000 : 1초
                System.out.println(i);
                System.out.println("Thread 이름 : " + getName());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        // 1. 상속 받기 -> run() 기능 작성 -> Thread 객체생성 -> start() 호출 -> 쓰레드 가동
        MultiThread mt = new MultiThread("쓰레드이름");
        mt.start(); // 내부적으로 run() 메소드를 호출하는 명령어가 start()임. (run() 으로 직접 호출 할 수 있지만, 안정성 이슈로 사용하지않음)
        /*
        * CallBack method : 운영체제가 내부적으로 불러다 사용하는 메소드.
        *
        * */
        System.out.println("main() 쓰레드를 계속 사용할 수 있는지 없는지 판단");

    }
}
