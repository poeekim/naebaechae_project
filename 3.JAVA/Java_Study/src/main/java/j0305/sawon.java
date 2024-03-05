package j0305;


import java.io.*;

/*
* 키보드로 값을 입력 : 한글 데이터 출력 가능
* 이름이 뭐고, 국어점수는 뭐고, 영어 점수는 뭐고? => 총점구하기
*
* ---------------------------------------------------------
*
*
* */
public class sawon {
    public static void main(String[] args) throws IOException {
        /*
        * System.in : InputStream 객체의 멤버변수
        * System.out : PrintStream 의 객체(표준출력객체)
        * InputStreamReader : 중간에 관여하여 한글이 깨지지 않도록 설정해 주는 클래스
        * BufferedReader : Scanner 보다 속도 측면에서 훨씬 빠르기 때문에, 대량 데이터를 처리할 때 유리(입력된 데이터가 바로 전달되지 않고
        *                   버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임)
        *                   한글 데이터가 깨지지 않으며, 빠른 속도로 읽어들여라 = BufferedReader 사용
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한글 데이터를 파일로 저장
        File f = new File("C:/webtest/3.JAVA/과제/sawon.txt");
        FileWriter fw = new FileWriter(f,true);

        String mem_name, mem_id, mem_pwd, mem_gender, mem_age, mem_phone;

        System.out.println("-------회원정보 입력-------");
        System.out.println("이름은?");
        mem_name = br.readLine();

        System.out.println("아이디?");
        mem_id= br.readLine();

        System.out.println("비밀번호?");
        mem_pwd= br.readLine();

        System.out.println("성별?");
        mem_gender= br.readLine();

        System.out.println("나이?");
        mem_age= br.readLine();

        System.out.println("전화번호?");
        mem_phone = br.readLine();

        // 파일을 생성해서 그 파일에 출력
        fw.write(mem_name);
        fw.write("\r\n");

        fw.write(mem_id);
        fw.write("\r\n");

        fw.write(mem_pwd);
        fw.write("\r\n");

        fw.write(mem_gender);
        fw.write("\r\n");

        fw.write(mem_age);
        fw.write("\r\n");

        fw.write(mem_phone);
        fw.write("\r\n");
        fw.write("\r\n");
        // 입출력 끝
        fw.close();
        br.close();
    }
}
