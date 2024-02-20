package j0220;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class ForTest {
    public static void main(String[] args) {

        // For 문

        /*
         * for(초기식; 조건식; 증감식){
         *   실행문;
         *   }
         * */


        System.out.println("for 문");

/*
        for (int i = 0; i <= 5; i++) {
            System.out.println("출력 " + i);
        }
*/

/*

        System.out.println("==============구구단 출력하기==============");
        for (int a = 2; a <= 9; a++) {
//            System.out.println("a = " +a);
            System.out.println(a + "단 시작");
            for (int j = 1; j <= 9; j++) {
//                System.out.println("j = "+j);
                System.out.println("a * j =" + a * j);
            }
        }
*/

        System.out.println("============================");
/*

        for (int k = 10; k > 5; k--) {
            System.out.println(k);
        }
*/

        System.out.println("===========최소한의 for 문구(증감식)============");
/*
        int c = 1; // 초기식은 바깥에서 선언하되 for 문 조건식에 빈칸으로 두고 ; 세미콜론으로 
        for (; c <= 20; ) {
            System.out.println("C = " + c);
            c++; // 증감식은 무조건 for문 내에 있어야함.

        }*/


        // 1~100 까지의 합
        // 1~5 까지의 곱

        int sum = 0;
        int mul = 1;
        BigInteger big = new BigInteger("1"); // int 의 범위를 넘기 때문에 BigInteger 형식의 변수를 선언함.
        for(int i = 1; i<=100;i++){
            sum= sum+i;
//            mul = mul * i;
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println("sum ="+sum);
        System.out.println("big = " + big);


        System.out.println("===========1~100 까지의 짝, 홀수의 합============");

        // 짝수의 합

        int sum1=0;
        for(int j = 0;j <=100; j++){
            if(j%2==0) {
                sum1 = sum1 + j;
            }
        }
        System.out.println("짝수의 합 sum1 = " + sum1);

        int sum2=0;
        for(int j = 0;j <=100; j++){
            if(j%2==1) {
                sum2 = sum2 + j;
            }
        }
        System.out.println("홀수의 합 sum2 = " + sum2);

        int sum3=0;
        for(int j = 0;j <=100; j+=2){

                sum3 = sum3 + j;

        }
        System.out.println("홀수의 합 sum3 = " + sum3);


    }

}
