package j0307;

// 급여통장(공유데이터) -> ATM(쓰레드) -> 공과금, 보험금, 대출이자..
class ATM implements Runnable {

    private long money = 10000;


    @Override
    public void run() {
        // 표현식) sychronized (공유할 데이터){ 처리 해야할 구문}; -> DB연동(SingleTon패턴 적용)
        synchronized (this) {// this 는 ATM 객체를 뜻함
            for (int i = 0; i < 5; i++) { // 먼저 도착한 스레드가 5번 반복 행위를 끝낼 때 까지 남은 스레드는 대기.
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println("에러 발생 : "+e);
                }
                if (getMoney() <= 0) {
                    System.out.println("잔액 부족으로 출금 불가.");
                    break;
                }
                withDraw(1000); // 한번에 1000원씩 돈빼기
            }
        }
    }
    // 돈 인출
    public void withDraw(long howmuch) {
        if (getMoney() > 0) {
            money -= howmuch;
            System.out.println(Thread.currentThread().getName() + " : " + howmuch + " 인출함. 남은 금액 : " + getMoney());

        } else {
            System.out.println("잔액 부족");
        }
    }

    // 잔액 조회(저장된 데이터 꺼냉오기 -> getXXXX(){return 멤버변수;}
    public long getMoney() {
        return this.money;
    }
}

public class SyncTest {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread t1 = new Thread(atm, "보험금"); // Thread 이름
        Thread t2 = new Thread(atm, "공과금");

        t1.start(); t2.start(); // 내부의 run 을 호출. run은 withDraw()를 호출.


    }
}
