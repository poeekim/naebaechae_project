package j0307;


/*
클래스 내부에서 객체의 인스턴스가 단 하나만을 생성하도록 만드는 디자인 패턴.
이유? : 한번만 객체를 생성하기 때문에 메모리 낭비 방지
*/

class Singleton {
    //1. 객체를 한개만 생성 - 공유해서 사용할 수 있도록 정적 멤버 변수로 선언한다.
    private static Singleton instance = null; // 공유객체

    // 2. 객체를 생성할 때 외부에서 호출할 수 없도록 한다.(
    private Singleton() { //private 생성자() {} -> 외부에서 객체 생성 불가
        System.out.println("인스턴스(=레퍼런스=참조) === 객체라고 말하자.. ");
    }

    // 3. 공유객체를 다른 모든사람들에게 공유되도록 정적 메소드를 선언
    public static Singleton getInstance() {
        if (instance == null) {
            // 만들고자하는 객체를 공유 객체로 등록
            // 표현식) synchronized(클래스명.class) {처리구문;}
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
public class SingletonTest { //실행
    public static void main(String[] args) {

       // Singleton st = new Singleton(); //private 으로 선언했기 때문에 외부에서 객체 생성 X
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        Singleton ob3 = Singleton.getInstance();

        System.out.println("ob1 = " + ob1); // ob1 = j0307.Singleton@682a0b20
        System.out.println("ob2 = " + ob2); // ob2 = j0307.Singleton@682a0b20
        System.out.println("ob3 = " + ob3); // ob3 = j0307.Singleton@682a0b20

    }
}
