package spring11;

//문자를 전송=>기간을 정하기
public class SystemMonitor {

    private long periodTime;//기간
    //has a 관계
    private SmsSender sender;//null

    //Setter Method-><property>태그
    public void setPeriodTime(long periodTime) {
        this.periodTime = periodTime;
        System.out.println("setPeriodTime() 호출됨");
    }
    public void setSender(SmsSender sender) {
        this.sender = sender;
        System.out.println("setSender() 호출됨");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "SystemMoniter[periodTim="+periodTime+",sender="+sender+"]";
    }
}