package spring5;

public class SmsSender {

    boolean flag ; // 문자가 제대로 전달되었는지 여부

    // constructor-agr 태그   또는  c:flag = "true"
    public SmsSender(boolean flag) {
        this.flag = flag;
        System.out.println("SmsSender(flag) 생성자 호출 " + flag);
    }

    public String toString() {
        return "SmsSender 호출";

    }
}
