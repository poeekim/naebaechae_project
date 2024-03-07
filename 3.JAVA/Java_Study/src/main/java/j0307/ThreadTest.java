package j0307;

public class ThreadTest {
    public static void main(String[] args) {

        // 현재 작동중인 쓰레드 객체 : Thread.currentThread()
        System.out.println(Thread.currentThread()); // Thread[main,5,main]\
        System.out.println(Thread.currentThread().getId()); // Thread 고유구분번호
        // 쓰레드 : 실시간으로 데이터전송(채팅), 게임, 주가 등에서 중요함

    }
}
