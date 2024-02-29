package j0229;

/*
* 인터페이스 상속 : 자식인터페이스명 extends 부모인터페이스명
* 클래스 상속 : 자식클래스명 extends 부모클래스명
* 클래스의 인터페이스 상속 : 자식클래스명 implements 부모인터페이스명1, 부모인터페이스명2....{}
*
* */

public class TV implements AdvanceVolume{

    private int VolLevel; // 볼륨의 크기

    // 다형성 : 메소드명은 같지만 처리하는 내용(기능)은 다르다. : 장비에 따라서 기능을 다르게 할 수 있다. 티비, 라디오, 핸드폰.. 등등...
    @Override
    public void turnOn() {
        System.out.println("tv 프로그램 turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("tv 프로그램 turn off");
    }

    @Override
    public void volumeUp(int level) {
        VolLevel+=level;
        System.out.println("tv 프로그램 " + level+ "만큼 volume up ");
    }

    @Override
    public void volumeDown(int level) {
        VolLevel-=level;
        if (VolLevel < 0 ){
            VolLevel = 0;
        }
        System.out.println("tv 프로그램 " + level+ "만큼 volume down ");
        System.out.println("현재 볼륨 = "+ VolLevel);
    }
}
