package j0221;

public class TV {
    /*
    *  1. 공통으로 저장할 특성 및 특징(멤버변수)
    *  2. 메소드(기능)
    * */
    // ================1. 멤버변수 ====================
    String maker; // 제조사
    String name; // 모델명
    String color; // 색깔
    int size; // 크기
    int channel; // 채널
    boolean power=false; // 전원

    // ================2. 메소드 ====================

    // 전원 on
    void turnOn(){
        // javascript -> function turnOn(){};
        power=true;
        System.out.println("전원 on");
    }

    // 전원 off
    void turnOff(){
        power=false;
        System.out.println("전원 off");
    }

    // 채널 change - up
    void changeUp(int ch){
        channel+=ch; // channel++;
        System.out.println("채널 up. 현재 채널은 " + channel + " 입니다.");
    }

    // 채널 change - down
    void changeDown(int ch){
        channel-=ch; // channel--;
        System.out.println("채널 down.  현재 채널은 " + channel + " 입니다.");
    }

    // 채널 전체편성표
    void tvDisplay(){
        System.out.println("====TV 정보 출력====");
        System.out.println("모델명 = "+name);
        System.out.println("색상 = "+color);
        System.out.println("현재채널 = "+channel);
        System.out.println("전원상태 = "+power);
        System.out.println("===================");
    }

    // 말하면 채널 변경
    void speakChannel(String ch){
        if (ch.equals("ocn")) {
            channel=35;
        } else if (ch.contentEquals("sports")) {
            channel=211;
        } else if (ch.equals("tvn")) {
            channel = 3;
        }
        System.out.println(ch+" 채널 요청했습니다. 현재채널 = "+channel+" 입니다.");
    }



}
