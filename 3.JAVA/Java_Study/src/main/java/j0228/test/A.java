package j0228.test;

public class A {

    // !!!!!!!!! Private : 자기 클래스에서만 접근 가능.
    // 외부(같은 패키지 내 다른 클래스 or 다른 패키지)에서 접근 X. 자식에게 상속도 불가. !!!!!!!!!

    // 1. 멤버변수에 부여
    private int i =10;

    // 2. 메소드에 부여하기
    private void print() {
        System.out.println("private i = " + i);
    }

    // default : 접근권한이 없으면 default 접근권한자로 부여 가능
    int j;

    void print2() {
        System.out.println("default j = " + j);
    }

    public static void main(String[] args) {

        A a = new A();
        a.i = 20;
        a.print();
        System.out.println("-------- default 권한 연습 --------");
        a.j = 200;
        a.print2();
    }
}
