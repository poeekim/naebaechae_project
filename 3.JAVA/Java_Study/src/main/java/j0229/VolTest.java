package j0229;

public class VolTest{
    public static void main(String[] args) {

        System.out.println("설계된대로 실행체크 (단위 테스트)");
        
        
        // 객체는 다르지만, 공통적으로 사용하는 메소드는 같다 = 다형성
        TV t = new TV();
        Radio r = new Radio();

        // 비슷한 기능을 가진 메소드명을 통일하게 작성(= 오버로딩의 확장판이라고 봐도 됨..)
        t.turnOn();
        t.turnOff();
        t.volumeDown(4);
        t.volumeUp(10);
        System.out.println("-----------------");
        r.turnOn();
        r.volumeUp(100);
        r.volumeDown(900);

        r.turnOff();
    }
}
