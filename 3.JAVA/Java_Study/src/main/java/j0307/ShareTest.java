package j0307;

// 입출력(RandomAccessFile) + 쓰레드 예제
// RandomAccessFile : 특정위치에 접근해서 정해진 파일을 생성해주는 클래스

// 실행해보면 뒤죽박죽 순서 정리가 안되어 있음 = 동기화가 안되어 있다.
// -> 메소드에 synchronized 를 붙여주면 된다. 한 스레드가 끝날 떄까지 다른 스레드는 대기후 실행 된다.

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ShareTest implements Runnable{

    RandomAccessFile raf = null;

    public ShareTest() { // 기본생성자
        try {
            // 1. 경로가 포함된 생성할 파일명    2. 모드(읽기모드 - r, 쓰기모드 - w, 읽기쓰기모드 - rw)
            // rw - 파일이 없으면 생성하고, 이미 파일이 존재하면 덮어쓴다.
            raf = new RandomAccessFile("c:/webtest/3.JAVA/result.txt","rw");

            // 2. Thread 객체를 생성해서 Runnable 객체로 매개변수를 전달해야한다.
            Thread t1 = new Thread(this,"Kim");
            Thread t2 = new Thread(this,"Test");

            // 3. Thread 실행
            t1.start();
            t2.start();

        } catch (IOException e) {
            System.out.println("파일 생성에 실패. 오류 내용 : " + e);
        }
    }

    @Override
    //public synchronized void run() {
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                // getFilePointer : 파일의 포인터의 위치를 알려준다
                raf.writeBytes(Thread.currentThread().getName() + "[" + i + "]"+ raf.getFilePointer()+"\n");
            }

        } catch (Exception e) {
            System.out.println("파일 데이터 출력 오류 : " +e);
        }
    }

    public static void main(String[] args) {
        // 1. Runnable 객체 생성
        //ShareTest st = new ShareTest(); // 기본생성자
        // 2. Thread 객체 생성 : 생성자의 매개변수를 전달하면됨(st)
        new ShareTest(); // 익명객체로 생성 -> 기본생성자를 호출한다(ShareTest 클래스 내 기본생성자)

    }
}
