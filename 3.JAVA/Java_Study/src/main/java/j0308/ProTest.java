package j0308;

import java.io.*;
import java.util.*;

/*
* Properties : Hashtable 을 상속받아 구현한 것으로, (String, String)형태로 저장하는 보다 단순화된 컬렉션 클래스이다.
*               주로 애플리케이션의 환경설정과 관련된 속성을 저장하는데 사용되며 데이터를 파일로부터 읽고 쓰는 편리한 기능을 제공
* */
public class ProTest {


    public static void main(String[] args) {

        // 1. 파일을 읽어들이기 위해
        Properties pro = new Properties();

        // 2. FileInputStream(Properties 파일 내용은 대부분 영어기 떄문에 FileInputStream 을 씀. 만약 한글이라면 FileReader 를 씀)
        try {
            FileInputStream fis = new FileInputStream("C:/webtest/3.JAVA/Java_Study/src/main/java/j0308/test.properties");
            pro.load(fis); // 파일의 내용을 메모리에 로딩

        } catch (Exception e) {
            System.out.println("파일 불러오기 오류 발생 : " + e);
        }
        // 3. 저장된 속성값 출력하기(setProperty("저장할키명",저장할 값)) <-> getProperty("불러올키명")
        String s = pro.getProperty("a");
        System.out.println("a키의 값 = " + s);

        // 4. 저장된 속성값 변경하기
        pro.setProperty("b", "testing");
        System.out.println("pro.getProperty(\"b\") = " + pro.getProperty("b"));

        // 5. 변경할 내용을 메모리에 로딩시켜 동기화한다.(동기화를 안하면 DB 에서 commit 을 안한 상태와 동일)
        try {
            // 주석을 안달 경우는 null 이라고 적으면 됨.
            pro.store(new FileOutputStream("C:/webtest/3.JAVA/Java_Study/src/main/java/j0308/test.properties"), "jsptest");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
