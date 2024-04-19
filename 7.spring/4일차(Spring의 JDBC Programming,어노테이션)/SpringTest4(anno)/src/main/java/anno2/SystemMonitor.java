package anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.inject.Inject;

public class SystemMonitor {

    private long periodTime; // 기간
// has a 관계(의존관계)
    /*
    * 생성된 객체가 있으면 자동으로 객체를 가지고 와서 멤버변수에 넣어준다.(강제로 가져오는 개념)
    * 어노테이션에서는 객체가 없으면 안넣고/있으면 자동으로 가져오는 추가적인 옵션기능이 있다. = required=false
    * */

    // 어노테이션 선언
    /*@Autowired(required=false)*/
    @Inject
    private SmsSender sender; // byType으로 찾아서 넣어주는 역할을 함.


    // 값을 넣는 방법 1. setter Method : <property> 태그 이용

    public void setPeriodTime(long periodTime) {
        this.periodTime = periodTime;
        System.out.println("setPeriodTime 호출");
        System.out.println("periodTime = " + periodTime);
    }

/*    @Required
    @Autowired
    public void setSender(SmsSender sender) {
        this.sender = sender;
        System.out.println("setSender 호출");
        System.out.println("sender = " + sender);
    }*/

    @Override
    public String toString() {
        return "SystemMonitor[periodTime] = " + periodTime + " / [sender] = " + sender;
    }
}
