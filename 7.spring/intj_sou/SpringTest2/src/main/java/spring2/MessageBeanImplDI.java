package spring2;

// 인터페이스를 상속 받은 자식 클래스
public class MessageBeanImplDI implements MessageBeanDI2 {

    // DI를 이용하여 객체를 가져오는 방법 : 멤버변수에 저장한다
    private String name1, name2; // 생성자(Constructor Injection)
    private String greeting; // Setter Injection : 메소드를 통해서 객체를 넣어준다
//------------------------------------- has a 관계(의존관계)----------------------------------------------------------

    private OutFile outF;
    // 인터페이스인 OutFile 객체를 사용한 이유 : 수정하더라도 연결된 다른 클래스를 가능한 적게 수정할 수 있도록 설계해야한다.

    public void setOutF(OutFile outF) {
        this.outF = outF;
        System.out.println("setOuf 호출완료.  outF = " + outF);
    }

    // 1. 생성자는 <constructor-agr>  태그를 이용하여 값을 임의로 지정해서 값을 전달한다(생성자 호출)
    public MessageBeanImplDI(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
        System.out.println("MessageBeanImpleDI 생성자 호출완료");
    }

    // 2. <property> 태그를 이용해서 Setter Method 호출
    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("setGreeting() 호출완료" + greeting);
    }

    @Override
    public void sayHello() {
        String message = greeting + name1 +", "+ name2;
        System.out.println("message = " + message);

        // outF객체를 이용해서 out(message)를 호출
        try {
            outF.out(message);
        } catch (Exception e) {

        }

    }
}
