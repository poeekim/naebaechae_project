package j0226;

/*
*   성적처리 프로그램을 만들어라
*    국, 영, 수 의 합계 / 평균 / 등급 / 모든 정보를 출력하는 메소드
*
* */


import java.util.Scanner;

public class MethodEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 입력");
        int kor = sc.nextInt();
        System.out.println("영어 점수 입력");
        int eng = sc.nextInt();
        System.out.println("수학 점수 입력");
        int mat = sc.nextInt();
        // 숫자입력 : nextInt()   , 문자열입력 : next()  ,  소수점입력 : nextDouble()

        System.out.println("----------------------");
        MethodEx me = new MethodEx();

//        int kor = 86;
//        int eng = 76;
//        int mat = 65;
        me.sum(70,80,70);
        me.avg(70, 60, 20);
        me.lev(50,70,56);
        System.out.println("----------------------");

        me.sum(kor, eng, mat);
        me.avg(kor, eng, mat);
        me.lev(kor, eng, mat);
        System.out.println("----------------------");
    }


    void sum(int a, int b, int c){
        System.out.println("국 영 수의 합계는 "+ (a+b+c));
    }

    void avg(int a, int b, int c){
        System.out.println("국 영 수의 평균은 "+ (a+b+c)/3);
    }

    void lev(int a, int b, int c){
        if((a+b+c)/3>90){
            System.out.println("1등급");
        } else if ((a+b+c)/3>80) {
            System.out.println("2등급");
        } else if ((a+b+c)/3>70) {
            System.out.println("3등급");
        }else if ((a+b+c)/3>60){
            System.out.println("4등급");
        }
    }
}
