package j0308;

import java.io.*;
import java.net.*;
import java.util.Scanner;

// 특정사이트에 접속 -> 정보를 가져오는 클래스(URL(PC), URLConnection)
public class URLTest {


    public URLTest(String s) throws Exception{
        URL url = new URL(s);
        System.out.println("url = " + url);
        // 사이트에서 직접 가져오기( 로컬은 데이터를 받아 입력하는 것이니까 Input임. 원격은 데이터를 로컬에게 출력하는 것이므로 Output임)
        InputStream in = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 원격 연결
        String ss;
        while ((ss = br.readLine()) != null) {
            System.out.println("ss = " + ss);
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("접속할 사이트 주소입력 ");
        String domain = sc.next();
        new URLTest(domain);



    }
}
