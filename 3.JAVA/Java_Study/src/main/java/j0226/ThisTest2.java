package j0226;




/*
* 1. 메소드(=생성자포함)를 작성할 떄
* 멤버변수와 매개변수가 서로 같을때 구분하는 목적으로 사용한다.
*
* */
public class ThisTest2 {

    ThisTest2(){
        // 자바 내부에서 어떠한객체든지대신 받아서 처리해주는 래파런스 open
        System.out.println("현재 생성된 객체 : tt "+this);
    }

   public static void main(String[] args) {
    // ThisTest2 클래스의 객체 tt를 생성하면서 기본 생성자를 호출
    ThisTest2 tt = new ThisTest2();






    }
}
