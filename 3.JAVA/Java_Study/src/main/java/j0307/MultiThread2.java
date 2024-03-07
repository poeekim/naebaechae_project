package j0307;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 2. Thread 객체를 생성하는 방법 2 -> Runnable 인터페이스를 상속
*
* start() -> run() : 메인쓰레드를 정상적으로 실행시키면서 우리가 원하는 다른 쓰레드를 실행 시킬 수 있다.(안정성 높음)
* run() : 먼저 메인스레드 보다 원하는 쓰레드를 실행시키기 땨문에 메인스데르에 문제가 발생할 수 있음(안정성 낮음)
*
* */
public class MultiThread2 {
    public static void main(String[] args) throws IOException {
        System.out.println("실행시킬 단");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dan = Integer.parseInt(br.readLine());


        //Runnable 사용하는 방법
        GooGoo g = new GooGoo(dan);
        // 2. Thread 객체를 생성 -> Runnable 객체를 생성자의 매개변수로 전달하라
        Thread t = new Thread(g);
        // 3. Thread 객체의 start() 메소드 호출

        PrintThread pt = new PrintThread();
        t.setPriority(10);
        t.setPriority(Thread.MIN_PRIORITY); // 1

        t.start();  pt.start(); // 가능한 동시에 실행할 수 있도록

    }
}
// 2. 구구단 출력하기
class GooGoo implements Runnable{
    private int dan; // 단 저장

    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(dan + "단 : " + dan + "*" + i +"="+ (dan * i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public GooGoo(int dan) {
        this.dan=dan;

    }
}

// 1. Thread 를 직접 상속받아서 사용
class PrintThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 9; i++) {
            try {
                /*long sleeptime = (int) (Math.random() * 1000 + 1);
                System.out.println(sleeptime);
                Thread.sleep(sleeptime);*/
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}