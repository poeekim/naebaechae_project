package j0228;

public class SuperTest {

    /*
    * this(); : 자식클래스의 기본생성자를 호출
    * super() : 인수가 없는 부모클래스의 생성자를 호출. 기본생성자가 없으면 만들어 준다.
    *           (이미 다른 생성자가 존재하면 만들지 않는다.)
    *
    *
    * class B extends A{
    public B() {
    * // super(); 가 생략되어 있다.
        System.out.println("B의 생성자 호출~");
    }
}       -> B클래스는 A클래스를 상속 받는다. 기본생성자인 public B()의 실행블록에는
*           부모 생성자를 호출하는 super(); 가 생략되어 있다. (상속관계시 인수와는 관련없이 super() 가 항상 숨겨져있다.)
*           B 클래스의 생성자를 호출할 때, "B의 생성자 호출" 이 먼저 나오는게 아니라,
*           super(); 가 먼저 실행되어 A 클래스의 생성자 A 가 먼저 실행되어 "A의 실행자 호출" 이 가장 먼저 출력된다.
* 

* 

    * */

    public static void main(String[] args) {

        C c = new C("홍길동"); // 객체 c를 생성하면서 문자열을 처리하는 생성자 호출

    }

}

// A 클래스
class A{
    public A() {
        System.out.println("A의 생성자 호출~");
    }
}

// B 클래스
class B extends j0228.test.A {
    public B() {
        System.out.println("B의 생성자 호출~");
    }
}

// C 클래스
class C extends B{
    public C() {
        System.out.println("C의 생성자 호출~");
    }

    public C(String s) { // 생성자 오버로딩
        // super();   가 생략되어 있다.
        System.out.println("s = " + s);
    }
}