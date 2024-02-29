package j0229;


/*
*  CallByValue : 값에 의한 전달방법(기본 자료형 8가지로 매개변수에 전달해서 메소드를 호출하는 것). = 원본의 값을 복사해서 전달
*
* */
public class CallByValue {

    public static void main(String[] args) {

        int r = -1, g = -1, b = -1; // csS(rgb(0~255)) -> 255*255*255
        System.out.println("[before] r = " + r+ "/  g = "+ g+"/   b = "+b);
        // 중간에 메소드를 호출해서 전달, 색이 변경
        change_color(r, g, b);
        System.out.println("[after] r = " + r+ "/  g = "+ g+"/   b = "+b);
    }

    // 값을 전달할 메소드 (work method) :값을 입력받아서 처리
    static void change_color(int r, int g, int b) {
        System.out.println("--------------------------");
        System.out.println();
        r += 10; // r= r+10
        g += 50;
        b += 100;
        System.out.println("메소드 내부의 r = " + r + " / g = " + g + "/ b = " + b);
    }
}
