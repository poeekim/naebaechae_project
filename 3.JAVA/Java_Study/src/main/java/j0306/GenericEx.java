package j0306;

/*
* 자주 사용이 되는 클래스도 import 형태로 등록.
*
* 제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미
*
* */
import static java.lang.System.out; // 메모리에 로딩..??????

public class GenericEx<T> {
    // <T> 를 적지않고  GenericEx 로만 진행하면 모든 타입에 대해서 다 선언을 해줘야하므로 불편함.
    // type에 대한 자료형만 받아서 처리하겠다.

    T v[];
    /*String v[];
    Double v2[];
    Integer v3[];
*/

    // 1. 배열에 값을 저장(Setter)
    public void set(T n[]) {
        v=n;
    }
/*    public void set(String n[]) {
        v=n;
    }

    public void set(Double n[]) {
        v2 = n;
    }

    public void set(Integer n[]) {
        v3 = n;
    }*/



    // 2. 배열의 값을 꺼내와서 출력(Getter)

    public void print() {
        for (T s : v) {
            out.println(s);
        }
    }

    /*public void print1() {
        for (String s : v) {
            out.println(s); // 이미 import 로 System을 올렸기 때문에 out.println(); 만 써도 됨.
        }
    }
    public void print2() {
        for (Double s : v2) {
            out.println(s); //
        }
    }
    public void print3() {
        for (Integer s : v3) {
            out.println(s); //
        }
    }*/
    public static void main(String[] args) {

       // GenericEx ge = new GenericEx();
        GenericEx<String> ge = new GenericEx<String>();
        GenericEx<Double> ge2 = new GenericEx<Double>();
        GenericEx<Integer> ge3 = new GenericEx<Integer>();

        // String
        String ss[] = {"Generic", "종류", "예제만들기"};
        ge.set(ss);
        ge.print();

        //Double
        Double ss2[] = {3.4, 5.6, 9.8};
        ge2.set(ss2);
        ge2.print();

        //Integer
        Integer ss3[] = {1, 2, 3, 4, 5};
        ge3.set(ss3);
        ge3.print();

    }
}
