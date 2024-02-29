package j0229;


/*
*  CallByRef : 참조(주소)에 의한 전달방법(객체를 전달해서 메소드를 호출하는 것). = 참조를 직접 넘기기 때문에 호출자의 변수와 수신자의 파라미터는 완전히 동일한 변수.
메서드 내에서 파라미터를 수정하면 그대로 원본 변수에도 반영됨.
* 여기에서 주소란, 저장된 위치에 대한 것으로 C언어에서는 포인터로 표현.
*
* */
class RGBColor{
    int r, g, b;

    public RGBColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

}
public class CallByRef {

    public static void main(String[] args) {

        RGBColor color = new RGBColor(-1, -1, -1);
        System.out.println("color = " + color); // 객체 출력시, 주소가 나옴.

        System.out.println("[before] r = " + color.r+ "/  g = "+ color.g+"/   b = "+color.b);



        // 중간에 메소드를 호출해서 전달, 색이 변경
        change_color(color);
        System.out.println("[after] r = " + color.r+ "/  g = "+ color.g+"/   b = "+color.b);
    }



    // 값을 전달할 메소드 (work method) :값을 입력받아서 처리
    static void change_color(RGBColor color2) {
        System.out.println("color2 = " + color2); // color 주소값과 color2 주소값이 같은지 확인. 같음.
        System.out.println("--------------------------");
        System.out.println();
        color2.r += 10;
        color2.g += 50;
        color2.b += 100;
        System.out.println("메소드 내부의 r = " + color2.r + " / g = " + color2.g + "/ b = " + color2.b);
    }
}
