package j0305;

import java.io.*;
/*
* 입출력을 하기 위해선 반드시 예외처리를 해줘야함(Checked 계열의 클래스)
* 
* 
* */
// 입출력의 개요 파악
public class WriteHello {
    public static void main(String[] args) throws IOException {


        /*
        * print 와 write 의 차이점 :
        * print -  변수의 저장된 값을 있는 그대로 출력
        * write - 데이터의 값을 변환시켜서 출력
        * */
        byte hello[] = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10};
        byte a = 72;
        try {
            System.out.println(a); // 72
            System.out.println(hello); // 배열은 객체 (배열의 주소값이 출력됨) // Hello World!
            System.out.println("--------------");
            System.out.write(a);
            System.out.write(hello);
            System.out.println("--------------");
            System.out.flush();// 데이터를 출력시키기 전 저장되는 버퍼
        } catch (IOException e) {
            System.out.println("에러 발생");
            System.out.println(e);
        }
    }
}
