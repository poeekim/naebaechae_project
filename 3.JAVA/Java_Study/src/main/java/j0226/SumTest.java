package j0226;
/* 메소드 사용하는 이유 : 중복 코드를 제거. 높은 재사용성. 프로그램의 구조화.
*  !!!! 메소드 작성하는 tip !!!!!
*
*   1. 무조건 매개변수 X , 반환형 X 을 먼저 작성한다.
*   2. 메인 -> 작업한 내용 ->
*
* */

// 2개의 값을 입력 받아서 사친연산을 해주는 프로그램을 작성하시오.


public class SumTest {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
//        System.out.println("-----------단순 반복---------");
/*        System.out.println("a+ b = "+ (a+b));
        System.out.println("a- b = "+ (a-b));
        System.out.println("a* b = "+ (a*b));
        System.out.println("a/ b = "+ (a/b));*/
        System.out.println("---------------------------");

        SumTest st = new SumTest();
        st.Calculate(a, b);
        st.Calculate(78,90);
        st.Calculate(23,45);
        st.Calculate(12,78);


    }

    void Calculate(int a, int b){
        // 변수 a,b 는 지역변수이므로 Calculatoe에서는 사용할 수 없다.그러므로 매개변수로 두 변수를 받자.
        //그리고 main 안에서 객체를 생성하고 값을 할당하자.

        System.out.println("a+ b = "+ (a+b));
        System.out.println("a- b = "+ (a-b));
        System.out.println("a* b = "+ (a*b));
        System.out.println("a/ b = "+ (a/b));
        System.out.println("---------------------------");
    }

}
