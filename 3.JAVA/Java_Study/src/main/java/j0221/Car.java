package j0221;

public class Car {

        /*
        * 추상화
        * 새롭게 저장할 대상자(자동차, 학생, 건물,,)
        * 를 저장할 목적으로 새롭게 만들어진 설계도(클래스'*/

        // Car(객체) : 기본적으로 가지고 있는 특징,
        // 메소드 : 행위, 기능

        String name;
        int output; // 배기량
        int year = 0; //년식
        String color; // 차 색깔


        int current_speed;//차의 속도
        //int sidong=1 or 0 메모리 낭비
        boolean sidong=false;

        // 시동걸기
        void startEnginee(){
            sidong=true;
            System.out.println("시동걸림");
        }

        // 차의 주차기능
        void stop(){
            sidong=false;
            current_speed=0;
            System.out.println("정상 주차완료");
        }

        // 차의 속도 증가(데이터 입력 -> 저장, 계산, 출력) 매개변수 O , 반환값X
        void speedUp(int speed){
            // jsp : function speedUp(speed){}
            current_speed+=speed;
            System.out.println(speed+"만큼 속도 증가");
        }

        // 차의 속도 감소
        void speedDown(int speed){
            current_speed-=speed;
            System.out.println(speed+"만큼 속도 감소");
        }

        // 차의 정보 출력
        void  carInfoPrint(){
            System.out.println("=="+ name +" 차의 정보 출력==");
            System.out.println("차의 시동 유무 : " + sidong);
            System.out.println("차 이름 : "+name);
            System.out.println("차의 배기량 : "+output);
            System.out.println("차의 색깔 : "+color);
            System.out.println("차의 속도 : "+current_speed);
        }

    }
