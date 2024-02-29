package j0229;

/*
* static (정적의) : 1. 정적멤버변수  2. 정적메소드    3. 초기화블럭(static {})
*
* 멤버변수(=인스턴스변수) : 클래스 내부에 선언된 변수. 공유하지못하고 독립적으로 존재한다.
* 정적멤버변수(=클래스변수) : 모든 객체가 공유할 수 있도록 만들어진 변수(클래스명.정적멤버변수명 | 객체명.정적멤버변수명  으로 호출할 수 있음)
*
* */

class Car{
    String color;
    String model;
    String owner;

    // 차종 상관없이 차의 생산량의 합을 계산하라.
    static int SerialNum; // 공유값
}
public class CarFactory {
    public static void main(String[] args) {



    }
}
