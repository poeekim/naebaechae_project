package j0227;

import java.util.Scanner;

public class ArrayTest3 {
/*
* 사용자로부터 입력받은 5과목의 점수의 합과 평균의 값을 구하라
* */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;
        double avg = 0.0;

        System.out.println("점수를 입력하시오");
        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
            sum = sum + a[i];
            System.out.println("a[" + i + "] = " + a[i]);

//            System.out.println(sum);
        }
        System.out.println("================================");

        avg = (double) (sum / a.length);
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + (avg));


    }
}
