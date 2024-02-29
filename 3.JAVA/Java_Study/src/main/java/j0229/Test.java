package j0229;


// 추상메소드 : 메소드의 선언만 되어 있는 메소드
abstract class ImTest{ // 클래스 내 추상메소드가 하나라도 있으면 추상 클래스가 된다.

    /*
    * 추상클래스를 상속받은 자식 클래스는 무조건!!!!!!!!!!!!!!! 추상메소드를 오버라이딩 해야함1!!!!!!!!!!!!!!!
    * : 전체 프로그램의 설계를 목적으로 한다.
    * */

    public int sum(int x, int y) {
        return (x + y);
    }
    public abstract void draw(); // 일반메소드와 추상메소드를 구분하기 위해 abstract 를 붙인다.
    abstract public void go();

    public void go2() { // 일반 메소드

    }
}
public class Test extends ImTest { // 추창메소드를 오버라이딩 하지 않으면 오류 발생
    @Override
    public void draw() {
        int result = sum(10, 20); // this.sum 도 가능
        System.out.println("result = " + result);
    }
    @Override
    public void go() {
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.draw();
        //System.out.println(sum(30,40)); 오류 발생 : sum은 ImTest내 일반메소드이므로 main 내에서 호출 시 객체를 생성하고 호출해야함.
        System.out.println(t.sum(30,40));




    }
}
