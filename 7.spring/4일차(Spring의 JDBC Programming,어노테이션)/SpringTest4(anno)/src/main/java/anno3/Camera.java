package anno3;

import org.springframework.beans.factory.annotation.Required;

public class Camera extends Object {

    private int number; // 카메라 수 0. null(String), 기본값 0.0

    @Required // @Required : 필수라는 의미. 반드시 프로퍼티를 이용하여 값을 주입받도록 정의. 값이 안들어오면 에러나게 한다.
    public void setNumber(int number) {
        this.number = number;
        System.out.println("setNumber 의 number = " + number);
    }

    // 메소드 위에 @ 어노테이션 기술 : 메소드명이 오버라이딩이 된 메소드인지 아닌지를 체크해주는 기능
    @Override
    public String toString() {
        return "Camera number = "+number;
    }
}
