package j0308.chat;

import java.net.*; // ServerSocket, Socket
import java.io.*; // BufferedReader~
import java.util.Vector; // List계열(동적배열) -> 실시간으로 접속한 클라이언트의 수

/*
* 서버의 역할 :
* 1) 클라이언트의 접속
* 2) 접속 정보를 가지고 아이디를 구분
* 3) 실시간 통신
* */

// 실시간으로 데이터를 전송 - Thread 를 사용
class ServerThread extends Thread{

    // 클라이언트 통신
    Socket s;
    // 추가
    ChatGUIServer cg; // broadCast 메소드를 호출하기 위해  필요하여 상대방(ChatGUIServer)의 객체가 필요하다.
    // 입출력
    BufferedReader br; // 채팅의 대용량 입력을 위해 BufferedReader를 사용
    PrintWriter pw; // BurfferedWriter 를 쓰지 않음. why??
    String str; // 전달할 문자열을 저장할 변수
    String name; // 접속한 계정 이름

    // ChatGUIServer 객체를 매개변수로 전달받는 이유 : 이미 생성된 서버를 두번 생성하면 충돌이 생김.
    public ServerThread(ChatGUIServer cg, Socket s) { // 1. 서버객체 전달. 2. 접속자 정보

        this.cg = cg; // 서버정보
        this.s=s; // 접속자정보
        // 데이터를 실시간으로 전송 -> 입출력스트림 필요
        try {// socket 객체인 s를 통해서 상대방이 보내주는 데이터를 받을 수 있다. (s.getInputStream())
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //public PrintWriter( @NotNull  OutputStream out, boolean autoFlush ) : 버퍼에 일정량이 쌓인 후에 전송하지말고
            // 바로바로 전송(flush) 되도록 설정해준다.
            pw = new PrintWriter(s.getOutputStream(),true);


        } catch (Exception e) {
            System.out.println("연결실패 = " + e);
        }
    }

    // 데이터를 전송해주는 메소드(클라이언트에게)
    public void send(String str) {
        System.out.println("---" + str); // 콘솔에 띄우기
        pw.println(str);
        pw.flush(); // autoflush 기능이 없다면 해당 선언문을 적어야함.. 근데 위에서 autoflush 설정을 했는데.. 더블체크로 적어주자....
    }

    @Override
    public void run() {
        // 실시간 데이터를 전송, 받는 코딩 : 클라이언트에게 전송

        System.out.println(pw);
        System.out.println("name = " + name);
        System.out.println("--------------");
        try {
            // 그룹채팅
            pw.println("먼저 대화명을 입력하시오"); // 클라이언트의 br
            name = br.readLine(); // 상대방의 계정명
            // 각 클라이언트에게 메시지를 전달해야함
            cg.broadCast("[" + name + "]님이 접속하였습니다.");
            while ((str = br.readLine()) != null) { // 계속 채팅을 이어가는..상태일 경우
                cg.broadCast("[" + name + "]" + str); // [기며나] 이거 내용 다시 봐야겠다.. ㅎ.. 클론코딩해봐야지..
            }
        } catch (Exception e) { // 클라이언트의 접속이 해제 된 경우 채팅방을 나간 것으로 간주한다. = 접속되어 있는 접속자들에게 퇴장한 사람의 퇴장을 알림
            cg.removeThread(this); // this : 퇴장한 사람의 정보 (st = new ServerThread(this, s))
            cg.broadCast("[" + name + "]님이 퇴장하였습니다.");
            System.out.println(s.getInetAddress() + "의 연결이 종료됨"); // 상대방의 ip
        }

    }
}

public class ChatGUIServer {

    ServerSocket ss; // 서버와 클라이언트와 '접속'할 때만 필요하다.
    Socket s; // 서버와 클라이언트와 '통신' 하기 위함(문자열 전송)
    Vector v; // 실시간으로 접속한 클라이언트 정보를 저장

    // Thread 객체를 멤버변수에 선언한 이유 : ChatGUIServer 클래스는 ServerThread 클래스의 일반 메소드인 send 메소드를 사용해야 하므로,
    // ChatGUIServer 클래스 내부에 ServerThread 객체를 선언한다.
    ServerThread st;


    // 0.기본 생성자 (프로그램 실행을 위한 환경설정(초기화)을 해주는 것이라고 생각하면 됨.
    // : ServerSocket 생성 -> 포트 오픈 -> 접속 계정 저장 -> 쓰레드 연결
    public ChatGUIServer() {
        // 서버를 가동한 후, 클라이언트가 접속할 때까지 기다린다. (무한루프)
        v = new Vector(); // 생성자에서는 다른 클래스 객체명은 사용이 가능하다.
        try {
            ss = new ServerSocket(5432); // ss객체를 생성하면서 포트 5432 를 열어라!
            System.out.println("ss = " + ss);
            System.out.println("채팅 서버 가동중..");

            // 포트는 열었으니 클라이언트가 접속할떄까지 기다려야함 = 무한루프
            while (true) {
                s = ss.accept(); // 접속 승인(클라이언트의 정보들)
                System.out.println("Accepted from "+s); // 접속자 정보 출력
                // 생성자 -> ServerThread 객체를 생성(서버객체, 클라이언트객체) 정보
                st = new ServerThread(this, s);
                this.addThread(st); // 메모리에 추가한다 ->  저장 X -> 조회 X
                st.start(); // 내부적으로 run() 메소드 실행 -> broadCast() 호출하여 실행함.
            }
        } catch (Exception e) {
            System.out.println("접속 실패. 이유 : " + e);
        }
    }

    // 1. 접속한 클라이언트의 정보를 벡터에 저장하기
    public void addThread(ServerThread st) {
        v.add(st);
    }

    // 2. 퇴장(접슥이 끊긴) 한 클라이언트의 정보를 벡터에서 삭제하기
    public void removeThread(ServerThread st) {
        v.remove(st);
    }

    // 3. 각 클라이언트에게 실시간으로 메세지를 전달시켜주는 메소드 (입력 O, 클라이언트 조회 -> 출력)
    public void broadCast(String str) { // 채팅방에 입장or퇴장
        for (int i = 0; i < v.size(); i++) { // Object -> ServerThread 객체 변환
            ServerThread st = (ServerThread) v.elementAt(i);
            st.send(str);

        }
    }

    public static void main(String[] args) {

        // ChatGUIServer cg = new ChatGUIServer();
        new ChatGUIServer(); // 익명객체


    }
}

