package spring10;

import spring3.SmsSender;

public class SystemMonitor {
    /*
     * 1. byType(Xml)
     *   -> @Autowired -> @Inject
     * 타입을 이용해 원하는 객체를 찾는다. PhoneCall 과 같은 자료형의 객체를 찾아서 멤버변수에 자동으로 저장시켜라.    *
     *
     * 2. byName
     *   -> @Resource 와 같은 개념
     * Type 으로 객체를 찾는 것이 아닌, 객체이름으로 찾아서 자동으로 객체를 저장시켜라.
     *
     * */

    private PhoneCall call;

    public void setCall(PhoneCall call) {
        this.call = call;
        System.out.println("setCall 호출 : " + call);
    }



    //private PhoneCall phonecall; // bean 태그의 name 과 일치하는 이름을 찾아야 하니 해당 변수명의 이름과 일치해야 한다.
    //
    // <bean name="phonecall" class="spring10.PhoneCall" />  // 멤버변수명과 해당 내용과 일치하는 이름을 찾아라.
/*    public void setPhonecall(PhoneCall phonecall) {
        this.phonecall = phonecall;
        System.out.println("setPhonecall 호출 - phonecall = " + phonecall);
    }*/


    @Override
    public String toString() {
        return "setCall[call] = "+ call;
    }
}
