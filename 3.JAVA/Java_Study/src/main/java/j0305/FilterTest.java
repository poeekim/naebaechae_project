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
public class FilterTest {
    public static void main(String[] args) throws IOException {
        /*
        * System.in : InputStream 객체의 멤버변수
        * System.out : PrintStream 의 객체(표준출력객체)
        * InputStreamReader : 중간에 관여하여 한글이 깨지지 않도록 설정해 주는 클래스
        * BufferedReader : Scanner 보다 속도 측면에서 훨씬 빠르기 때문에, 대량 데이터를 처리할 때 유리(입력된 데이터가 바로 전달되지 않고
        *                   버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임)
        *                   한글 데이터가 깨지지 않으며, 빠른 속도로 읽어들여라 = BufferedReader 사용
        * */

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 로도 쓸 수 있음


        // Scanner 이용
        String name;
        int kor, eng, tot;

        System.out.println("이름 입력");
        name = br.readLine();

        System.out.println("국어 점수 입력");
        kor = Integer.parseInt(br.readLine());

        System.out.println("영어 점수 입력");
        eng = Integer.parseInt(br.readLine());

        tot = kor + eng;
        System.out.println("합계 :  "+ tot);

        // 모든 작업이 끝난 후에는 close나 flush 로 버퍼에 있는 모든 내용이 출력소스에 출력되도록 해야한다.(자바에서는 자동 메모리 해제 기능이 있지만, 해당 구문을 해주는게 좋다).
        isr.close();
        br.close();


    }
}
