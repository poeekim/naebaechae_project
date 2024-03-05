package j0305;

import java.util.Scanner;

// 키보드를 통해 값을 입력받아서 그대로 출력(콘솔)
public class SimpleIn {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int charRead; // System.in.read() : 아스키 코드값으로 변환해서 저장하므로 int 형식으로 저장해야함.
        // 더이상 읽어들일 수 없을 경우 -1 로 리턴 -> 강제종료
        // 제어문에서 for 문을 쓰지 않고 while 구문을 사용한다

        System.out.println("입력하고자 하는 문자열을 아무거나 입력하시오");
        while ((charRead = System.in.read()) >= 0) {
            System.out.write(charRead);
        }

    }
}
