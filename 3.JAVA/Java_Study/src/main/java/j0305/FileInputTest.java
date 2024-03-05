package j0305;

// 외부의 파일을 연결할 시 (txt, image, 영상, exe 등) 일 경우 FileInputStream 계열을 사용한다.(파일이름이 영어일 경우 추천)
// 외부의 파일 이름이 한글일 경우 FileReader 계열을 사용한다(한글깨짐 이슈 예방)

import java.io.FileInputStream;

public class FileInputTest {
    public static void main(String[] args) throws Exception {
        // 자바 내에선 역슬러시가 인식이 안되므로 \\ 대신 / 로 변경하면 됨
        FileInputStream fis = new FileInputStream("C:/webtest/3.JAVA/과제/example.txt");
        int read = 0; // 파일의 내용을 저장할 변수

        // 첫번째 방법
/*        while (read != -1) {
            read = fis.read();
            System.out.println(read);
        }*/

        // 두번째 방법
        while (true) {
            read = fis.read(); // System.in.read() 대신 사용
            if(read==-1){
                break; // 출력하기 전에 내용의 유무를 판단하여 읽을 것이 없다면 break 문으로 while 문을 빠져나온다.
            }
            System.out.println(read);
        }
    }
}
