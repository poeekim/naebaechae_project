package j0228.test;

//public class C {
public class C extends A{
    public static void main(String[] args) {

        A a = new A();
        //a.i = 20;
        //a.print();

        System.out.println("-------- default 권한 연습 --------");
/*        a.j = 4000;
        a.print2();*/
        System.out.println("====상속을 받은 자식 르래스의 객체도 접근 X====");
        C c = new C();
        c.j=600;
        c.print2();
    }
}
