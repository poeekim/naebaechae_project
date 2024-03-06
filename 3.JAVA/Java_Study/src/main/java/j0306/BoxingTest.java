package j0306;

/*
* Wrapper 클래스
* : 기본 자료형을 참조형 자료형처럼 사용하기 위한 클래스(기본 자료형의 값을 감싸 객체형태로 만든 것)
* byte->Byte
short->Short
int->Integer
long->Long
double->Double
char->Character
float->Float
boolean->Boolean
*
*
* */
public class BoxingTest {
    public static void main(String[] args) {
        System.out.println("자동 unboxing");
        // unboxing : 자바의 객체형(Wrapper)을 기본자료형으로 변환

        int obj = 10;
        int sum = obj + 20;
        System.out.println("sum = " + sum);

        Double d = new Double(123.45);
        printDouble(d);


    }

    static void printDouble(Double obj2) {
        System.out.println(obj2.toString()); // 소수점값을 문자열로 변환시켜서 출력

    }
}
