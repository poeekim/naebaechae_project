package j0228.test;

// 같은 패키지 내에 존재할 지라도 접근할 수 없음 = 값 저장X , 메소드 호출 X
public class B {
    public static void main(String[] args) {
        A a = new A();
        //a.i = 20; // private 이라서 접근 불가
        //a.print(); // private 이라서 접근 불가
        System.out.println("-------- default 권한 연습 --------");
        a.j = 350;
        a.print2();
    }
}
