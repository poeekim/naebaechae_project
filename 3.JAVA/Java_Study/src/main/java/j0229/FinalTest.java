package j0229;

class Parent{
    // 1. final + 멤버변수 or 지역변수 : 상수화(변수의 값고정.대문자로 작성)
    final int COUNT = 1;

    // 2. final + 메소드 : 상속은 허용하지만, 오버라이딩은 허용 X.
    public final void sum(int a, int b) {
        System.out.println("a+b = " + (a+b));
    }
}
    // 3. final + 클래스 명 : 상속 완전 금지. 내용을 변경하면 안되는 클래스에 부여(ex. System 클래스)
public class FinalTest extends Parent{

    // 오버라이딩
    //public  void sum(int a, int b) { // Parent 클래스 내 sum 메소드에 final을 붙일 시 오버라이딩 메소드에 오류 발생(final 은 오버라이딩 불가)
       // System.out.println("데이터 연습 중 sum = " + (a+b));
    //}

    public static void main(String[] args) {


        Parent p = new Parent();
        FinalTest ft = new FinalTest();

        //p.COUNT =2; // 에러 발생 : 이미 상수화가 됐기 때문에 값 변경 불가
        System.out.println("p = " + p.COUNT); // p = 1
        ft.sum(1, 2);



    }
}
