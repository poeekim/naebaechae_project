package spring3;

public class SystemMonitor {

    private long periodTime; // 기간
    // has a 관계(의존관계)
    private SmsSender sender;

    // 값을 넣는 방법 1. setter Method : <property> 태그 이용

    public void setPeriodTime(long periodTime) {
        this.periodTime = periodTime;
        System.out.println("setPeriodTime 호출");
        System.out.println("periodTime = " + periodTime);
    }

    public void setSender(SmsSender sender) {
        this.sender = sender;
        System.out.println("setSender 호출");
        System.out.println("sender = " + sender);
    }

    @Override
    public String toString() {
        return "SystemMonitor[periodTime] = " + periodTime + " / [sender] = " + sender;
    }
}
