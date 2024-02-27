package practice;

import java.util.Scanner;

public class ThreeTest {
    public static void main(String[] args) {
        /*
        * 세개의 값을 입력받아서 최대값을 구해주는 프로그램작성

          int x,y,z or int a,b,c

          12,4,19

         최대값은 19 입니다.  =>main() 작성

        (단 getMaxPrint메서드를 작성해서 구현할 것.) =>부하직원
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력");
        int a = sc.nextInt();
        System.out.println("두번째 숫자 입력");
        int b = sc.nextInt();
        System.out.println("세번째 숫자 입력");
        int c = sc.nextInt();

        System.out.println("----------------------");

        ThreeTest tt = new ThreeTest();
        tt.getMaxPrint(a,b,c);


    }

    void getMaxPrint(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println("최대값은 " + a + "입니다");
        } else if (b>=a && b>=c) {
            System.out.println("최대값은 " + b + "입니다");
        }else {
            System.out.println("최대값은 " + c + "입니다");
        }
    }
}
