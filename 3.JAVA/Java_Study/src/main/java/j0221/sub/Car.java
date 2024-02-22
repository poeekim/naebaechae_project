package j0221.sub;

public class Car {

    /*
    * 캡슐화
    * :관련이 있는 변수와 함수를 하나의 클래스로 묶고 외부에서 쉽게 접근하지 못하도록 은닉해 보호하는 것.
    * 엉터리 값이 저장되지 않도록 막아준다.
    *
    * 멤버변수 앞에 private 키워드를 사용하여 외부에서의 직접 접근을 제한
    * 데이터를 쓰고 읽기위해서, getter와 setter 메소드를 생성해줘야한다.
    * getter : 불러오기
    * setter : 저장
    * alt+insert
    * */

        private String name;
        private int output; // 배기량
        private int year = 0; //연식
        private String color; // 차 색깔
        private int current_speed;//차의 속도
        private boolean sidong=false;


        public void setName(String n){
            name = n;
        }

        public void setOutput(int out) {// 음수가 들어오면 X
            if (out < 0 || out > 5000) {
                System.out.println("입력받은 값은 음수 입력, 5000이상 불가");
                output = 1000; // 임의로 디폴트값을 설정해서 정상적으로 입력을 못받았을때 기본적으로 저장할값 저장시키고 종료
                return;
            } else {
                output = out;
            }
        }
        public void setYear(int y) { // 음수 X, 2024보다 크면 X
            if (y < 0 || y > 2024) {
                System.out.println("년도는 음수, 2024보다 큰 숫자는 불가하다");
                year=2024;
                return;
            }
            year = y;
        }

        public void setColor(String col){
            color=col;
        }

        public void setCurrent_speed(int speed) {
            current_speed=speed;

        }

        public void setSidong(boolean si){
            sidong=si;
        }

        // getter 메소드(저장된 데이터를 불러와서 화면에 출력)
        // 형식) public 반환형(꺼내올 자료형) getXXXX(){return 멤버번수명;}

        public String getName(){
            return name;
        }

        //

        public int getOutput(){return output;}
        public int getYear(){ return year;}
        public String getColor(){return color;}
        public int getCurrent_speed(){return current_speed;}
        public boolean getSidong(){return sidong;}





    //=========================================================


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

        // 차의 속도 증가 (jsp : function speedUp(speed){})
        // 170km 이하까지만 속도 제한
        void speedUp(int speed){
            if (sidong==true) {
                if(speed<0 || (current_speed+speed)>=170) {
                    System.out.println("0 <= 속도 <170 필수");
                    current_speed=120;
                }else{
                    current_speed += speed;
                }
            } else {
                System.out.println("시동을 먼저 걸으시오");
            }
        }

        // 차의 속도 감소
        void speedDown(int speed){
            if(sidong==true) {
                if(speed<0 || (current_speed-speed)<0) {
                    System.out.println("속도는 0일 수 없음");
                    current_speed=120;
                }else {
                    current_speed -= speed;
                }
            }else {
                System.out.println("시동을 먼저 걸으시오");
            }
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
