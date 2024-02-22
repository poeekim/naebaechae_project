package j0221;

public class TVHandling{
    public static void main(String[] args) {

        TV t = new TV(); // 객체 생성


        // 2. 객체명.멤버변수 = 값(Setter) -> 객체명.멤버변수(Getter)
        t.color = "white";
        t.maker = "LG";
        t.name = "Gram";
        t.size=1290;
        t.channel = 0;
        t.power=false;


        t.turnOn();
        t.changeUp(45); // channelUp 메소드로 매개변수 전달
        t.speakChannel("sports");
        t.changeDown(3);
        t.tvDisplay();
        t.turnOff();


    }
}
