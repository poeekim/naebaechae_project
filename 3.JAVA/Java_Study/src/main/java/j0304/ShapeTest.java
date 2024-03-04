package j0304;

import java.util.Scanner;

// class 자식클래스명 extends 부모클래스명 implements 인터페이스명
public class ShapeTest extends Shape implements Drawable {

    @Override
    public double area(int r) {
        return (r*r*Math.PI);
    }

    @Override
    public void printArea() {
        super.printArea();
    }

    @Override
    public void draw() {
        System.out.println("원을 그려 원의 넓이를 구한다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원의 반지름 입력하시오");
        int r = sc.nextInt();

        ShapeTest st = new ShapeTest();
        st.res = st.area(r);
        st.printArea(); // 부모의 메소드를 호출한다.
    }
}
