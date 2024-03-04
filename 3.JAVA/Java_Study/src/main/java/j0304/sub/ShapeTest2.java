package j0304.sub;

// 상속관계(Shape -> Point -> Line -> Square)
public class ShapeTest2 {
    public static void main(String[] args) {

        System.out.println("객체자동형변환 연습");
        Shape s = new Shape();
        Point p = new Point();
        Line l = new Line();
        Square sq = new Square();
        System.out.println("------------------------");
        s.shapeDraw();
        p.pointDraw();
        l.lineDraw();
        sq.squareDraw();

        System.out.println("-----------객체 자동형 변환-------------");
        Shape sh[] = new Shape[4]; // 배열은 같은 유형인 Shape형 객체만 저장함.
        sh[0] = s;
        sh[1]= p; // 자식클래스의 객체는 자동으로 부모형으로 변환
        // sh[1] = new Point();   sh[2] = new Line();    sh[3] = new Square();  도 가능
        sh[2] = l;
        sh[3] = sq;

        for (int i = 0; i < sh.length; i++) {
            sh[i].draw(); // 메소드 명은 같지만, 객체가 다르기에 다른 기능을 구현한다 = 다형성
            whoAreYou(sh[i]);
        }
    }

    // 혈연관계 확인해보기
    // 표현식 ) 객체명 instanceof 부모클래스명 (true - 자식맞음 / false - 자식 아님)
    static void whoAreYou(Shape sh) {
        // Shape
        if (sh instanceof Shape) { // Shape 형의 객체가 맞는지
            System.out.println("Shape 가 맞음");
        }else {
            System.out.println("Shape 가 아님");
        }
        // Point
        if (sh instanceof Point) { // Point 형의 객체가 맞는지
            System.out.println("Point 가 맞음");
        }else {
            System.out.println("Point 가 아님");
        }
        // Line
        if (sh instanceof Line) { // Shape 형의 객체가 맞는지
            System.out.println("Line 가 맞음");
        }else {
            System.out.println("Line 가 아님");
        }
        // Square
        if (sh instanceof Square) { // Shape 형의 객체가 맞는지
            System.out.println("Square 가 맞음");
        }else {
            System.out.println("Square 가 아님");
            System.out.println("-----------------");
        }
    }
}

class Shape{
    // shape 는 도형을 뜻하며, 모든 도형(삼각형, 사각형...) 에서 공통으로 사용하는 메소드
    void draw() {
        System.out.println("Shape");
    }
    // Shape 클래스에서만 사용하는 메소드.
    void shapeDraw() {
        System.out.println("Shape 클래스에서만 사용하는 메소드.");
    }
}

class Point extends Shape{ // 상속으로 인하여 Shape 클래스의 메소드도 사용가능함

    @Override
    void draw() {
        System.out.println("point draw");
    }

    void pointDraw() {
        System.out.println("point 클래스에서만 사용하는 pointDraw 메소드");
    }
}

class Line extends Point{

    @Override
    void draw() {
        System.out.println("line draw");
    }

    void lineDraw() {
        System.out.println("line 클래스에서만 사용하는 lineDraw 메소드");
    }
}
class Square extends Line{
    @Override
    void draw() {
        System.out.println("square draw");
    }

    void squareDraw() {
        System.out.println("square 클래스에서만 사용하는 squareDraw 메소드");
    }
}
