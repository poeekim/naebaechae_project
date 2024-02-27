package j0227;

import java.util.Scanner;

public class MethodEx {
    /*
    * 요구 분석에 따라서 필요로 하는 메소드를 생각.
    * > 메소드를 작성할 때 매개변수 유무 판단 방법
    *   : 멤버변수로 선언 -> 매개변수가 없는 메소드 작성이 가능
    *   : 멤버변수로 선언 X -> 지역변수로 선언. 매개변수가 있는 메소드 작성이 가능
    *   : 반환값이 있을 경우 -> caller가 처리
    *             없을 경우 -> 호출한 메소드가 처리.
    * */
    int kor, eng, mat, total;
    double aveg;
    char grade;

    // 1. 합계(calcSum) - 반환값이 O
    int calSum(){
        int sum = kor+eng+mat;
        return sum;
    }

    // 2. 평균(calcAveg)(총점/과목수) - 반환값이 O
    double calcAveg(){
        return (double)(total/3);
    }

    // 메소드 오버로딩 : 비슷한 기능을 가진 메소드명은 하나의 메소드명으로 통합하는 것.(int su : 과목수)
    double calcAveg(int su){
        return (double)(total / su);
    }

    // 3. 등급 - 반환값이 O (평균 점수에 따라 A~F)
    char calcGrde(){

        if(aveg>90){
            return 'A';
        } else if (aveg>80) {
            return 'B';
        } else if (aveg>70) {
            return 'C';
        }else if (aveg>60){
            return 'D';
        }else{
            return 'F';
        }
    }

    void dispaly(){
        System.out.println("합계 " + total);
        System.out.println("평균 " + aveg);
        System.out.println("등급 " + grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodEx me = new MethodEx();
        System.out.println("국어 점수 입력");
        me.kor  = sc.nextInt();
        System.out.println("영어 점수 입력");
        me.eng = sc.nextInt();
        System.out.println("수학 점수 입력");
        me.mat = sc.nextInt();

        // 1. 합계
        me.total = me.calSum();
        // 2. 평균
        me.aveg = me.calcAveg();
        // 3. 등급
        me.grade = me.calcGrde();
        // 4. 출력
        me.dispaly();

    }

    }

