package j0227;


/*
*   성적처리 프로그램을 만들어라
*    국, 영, 수 의 합계 / 평균 / 등급 / 모든 정보를 출력하는 메소드
*
*   일반메소드, 정적메소드를 이용할 예정.
*
* */


import java.util.Scanner;

public class MethodEx2 {
    /*
    * 요구 분석에 따라서 필요로 하는 메소드를 생각.
    * > 메소드를 작성할 때 매개변수 유무 판단 방법
    *   : 멤버변수로 선언 -> 매개변수가 없는 메소드 작성이 가능
    *   : 멤버변수로 선언 X -> 지역변수로 선언. 매개변수가 있는 메소드 작성이 가능
    *   : 반환값이 있을 경우 -> caller가 처리
    *             없을 경우 -> 호출한 메소드가 처리.
    * */


    //int kor, eng, mat, total;
    double aveg;
    char grade;

    // 1. 합계(calcSum) - 매개변수 O : 25 row 주석처리, calSum 메소드의  매개변수에 변수들을 넣어준다.
    int calSum(int kor, int eng, int mat){
        int sum = kor+eng+mat;
        return sum;
    }
    // 2. 평균
    // 3. 등급




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수 입력");
        int kor = sc.nextInt();
        System.out.println("영어 점수 입력");
        int eng = sc.nextInt();
        System.out.println("수학 점수 입력");
        int mat = sc.nextInt();

        System.out.println("----------------------");
        MethodEx2 me = new MethodEx2();

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
