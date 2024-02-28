package j0228;

public class SuperTest2 {

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
** !!!!!!! 부모의 기본생성자가 존재하지 않고, 파라미터를 받는 생성자만 존재하는 경우,
* 자식 클래스에서도 super()를 호출함에 있어 반드시 파라미터를 남겨야 한다.ㄴ

    * */

    public static void main(String[] args) {

        C c = new C("홍길동"); // 객체 c를 생성하면서 문자열을 처리하는 생성자 호출

    }

}

// A 클래스
class AA{
    public AA()
    {   super();
        System.out.println("A의 생성자 호출~");
    }
}

// B 클래스
class BB extends AA {
    public BB() {
        super();
        System.out.println("B의 생성자 호출~");
    }


    // 인수가 있는 부모 생성자를 호출하는 경우에는 반드시!! 반드시 !! 부모클래스에 인수에 따른 생성지가 반드시 있어야 한다.
    public BB(String s) {
        super(); // A의 기본생성자 불르러간다
        System.out.println("BB - s = " + s);
    }
}
// C 클래스
class CC extends BB {
    public CC() {
        super();
        System.out.println("C의 생성자 호출~");
    }

    public CC(String s) { // 생성자 오버로딩
        super(s);
        System.out.println("s = " + s);
    }
}
