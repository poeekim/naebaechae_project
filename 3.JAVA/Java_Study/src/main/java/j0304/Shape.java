package j0304;

// 원의 면적을 구해서 출력시켜주는 역할(=추상클래스) : 설계 + 메소드 제공
public abstract class Shape {

    public double res; // 모든 도형에서 공통적으로 사용할 result 변수

    public abstract double area(int r); // 추상메소드

    // 공통의 기능을 일반 메소드로 작성해서 상속받도록 한다
    public void printArea() {
        System.out.println("도형의 면적 : " + res + " 입니다.");
    }
}
