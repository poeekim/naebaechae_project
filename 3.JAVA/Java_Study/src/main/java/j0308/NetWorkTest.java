package j0308;

// InetAddress, URL(원격접속), Socket, ServerSocket(채팅)
// Checked 계열 : 예외처리 필수(입출력, DB 연동, 네트워크 통신, 쓰레드 등)
import java.net.*;

public class NetWorkTest {

    public static void main(String[] args) throws Exception{

        InetAddress ia = null; // ip 주소 정보
        InetAddress ia2[]; // 서버 컴퓨터가 한대 이상일 경우 (대용량 데이터를 처리하는 naver 나 daum 등)

        // www.naver.com 의 ip 는 뭘까
        ia = InetAddress.getByName("www.naver.com");
        System.out.println("ia = " + ia.getHostAddress()); // 223.130.195.200

        // 서버가 한대 이상일 경우 -> getAllByName
        System.out.println("---------------------");
        ia2 = InetAddress.getAllByName("www.naver.com");
        for (int i = 0; i < ia2.length; i++) {
            System.out.println(ia2[i].getHostAddress()); // 223.130.192.247 , 223.130.192.248
        }
        System.out.println("--------로컬 컴퓨터 ip 주소-------------");
        InetAddress host = InetAddress.getLocalHost();
        System.out.println("host.getHostName() = " + host.getHostName());
        System.out.println("host = " + host.getHostAddress());
    }
}
