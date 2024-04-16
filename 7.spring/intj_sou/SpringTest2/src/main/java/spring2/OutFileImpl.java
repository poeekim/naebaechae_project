package spring2;

import java.io.FileWriter;
import java.io.IOException;

// 파일을 생성해서 파일 내부에 문자열을 출력시켜주는 프로그램
public class OutFileImpl implements OutFile {

    private String filePath; // 경로명 및 만들어질 파일명을 저장할 변수

    // <property> 태그를 사용하자

    public void setFilePath(String filePath) {
        this.filePath = filePath;
        System.out.println("setFilePath 호출됨. filePath = " + filePath); // c:/webtest/good.txt
        System.out.println("----------------------");
    }
    // MessageBeanImplDI -> sayHello() => out(message) 를 사용해야하므로 해지??를 해야한다고.. ???

    @Override
    public void out(String message) throws IOException {
        // 한글데이터 :  FileWriter / 영어 : FileOutputStream
        FileWriter fw = new FileWriter(filePath);
        fw.write(message);
        fw.close(); // 메모리 해제
    }
}
