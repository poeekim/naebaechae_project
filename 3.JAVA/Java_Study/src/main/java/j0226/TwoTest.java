package j0226;
/*
*   1. 사용자로부터 2개의 값을 입력 받아 큰값을 구하시오 <-> 작은 값
*   2. 최대값을 구해주는 메소드(max)를 이용해서 최대값을 구하시오.
*   3. 최소값을 구해주는 메소드(min)를 이용해서 최소값을 구하시오.
* */
public class TwoTest {

    public static void main(String[] args) {
        
        int x = 12;
        int y = 67;
//        System.out.println("---------------------------");
/*        if(x<y){
            System.out.println("더 큰 값은 y. y = " + y);
        }else {
            System.out.println("더 큰 값은 x. x = " + x);
        }*/
        System.out.println("---------------------------");


        TwoTest tt = new TwoTest(); // max, min 함수를 호출하기 위해 객체를 만든다.
        tt.max(x, y);
        tt.max(24,45);
        tt.min(10,75);


    }

    void max(int x, int y){
        System.out.println("---------------------------");
        if(x<y){
            System.out.println("더 큰 값은 y. y = " + y);
        }else {
            System.out.println("더 큰 값은 x. x = " + x);
        }
        System.out.println("---------------------------");
    }

    void min(int x, int y){
        System.out.println("---------------------------");
        if(x<y){
            System.out.println("더 작은 값은 x. x = " + x);
        }else {
            System.out.println("더 작은 값은 y. y = " + y);
        }
        System.out.println("---------------------------");
    }
    }

