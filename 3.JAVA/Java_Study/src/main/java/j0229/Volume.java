package j0229;

/*
* 인터페이스를 만드는 이유
* : 전체 프로그램에서 공통적으로 사용되는 기능을 인터페이스로 구현하여 추상메소드를 선언해, 수정 및 관리를 용이하게 함.
* 누구나 접근이 가능하도록 public interface 로 선언.
*
* */
public interface Volume {

    // 선언만 하고, 필요한 곳에서 메소드를 호출하여 메소드 내용을 채워주면됨.

    // 1. 볼륨 올리기
    public void volumeUp(int level);

    // 2. 볼륨 내리기
    public void volumeDown(int level);


}
