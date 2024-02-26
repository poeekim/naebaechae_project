package j0226;


// 생성자 & 오버로딩 + 메소드 오버로딩 종합 예제

// 객체를 생성하는 이유는 ??? -> 데이터를 저장하기 위함. , 메소드를 호출하기 위함.

    class Test2{
        void test(){
            System.out.println("다른 클래스의 객체명은 사용이가능(생성자)");
        }
    }
public class PrintTest {

    PrintTest(){} //: 기본 생성자가 없으면 내부에서 자동으로 기본생성자를 생성, 호출 해줌.
    // 기본 생성자가 자동으로 안만들어 지는 경우가 있음 : 이미 자기 클래스에 다른 생성자가 존재할 경우. 그래서 기본생성자가 필요로 하면 수동으로 작성해야함.

    // 세번째 방법 생성자 오버로딩
    PrintTest(char a){
        // pt.print(a);  원래 이런식으로 호출을 해야하는데 같은 클래스 내부에서는 객체명을 사용할 수 없다.
        print(a);

        Test2 t2 = new Test2();
        t2.test();





        //================================================
        System.out.println("char 매개변수 받아서 처리");
    }

    PrintTest(int a){
        print(a);
    }
    PrintTest(boolean a){
        print(a);
    }

    // 두번째 방법 오버로딩
    void print(char a) {
        System.out.println("char a = " + a);
    }

    void print(int a) {
        System.out.println("int a = " + a);
    }

    void print(boolean a) {
        System.out.println("boolean a = " + a);
    }


/*  // 첫번째 방법
    void charPrint(char a){
        System.out.println("char a = " + a);
    }

    void intPrint(int a){
        System.out.println("int a = " + a);
    }

    void booleanPrint(boolean a){
        System.out.println("boolean a = " + a);
    }*/


        public static void main (String[]args){



/*      첫번째 방법
        PrintTest pt = new PrintTest(); // 기본 생성자 호출
        pt.charPrint('b'); // charPrint 메소드를 호출하면서 b 매개변수를 전달함.
        pt.booleanPrint(4<1);
        pt.intPrint(123456);
        */

            /* 두번째 방법 : 메소드 오버로딩
            PrintTest pt = new PrintTest();
            pt.print(2486);
            pt.print('t');
            pt.print(2 > 3);
*/

            // 생성자 오버로딩 기법을 이용하여 클래스의 다른 메소드를 호출한다.
            PrintTest pt0 = new PrintTest(); // 기본생성자 호출
            PrintTest pt1 = new PrintTest('n');
            PrintTest pt2 = new PrintTest(789456);
            PrintTest pt3 = new PrintTest(1<10);

        }
    }

