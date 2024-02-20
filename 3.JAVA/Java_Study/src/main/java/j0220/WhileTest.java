package j0220;

public class WhileTest {
    public static void main(String[] args) {

        /*
        * 반복문
        * 1) 반복할 횟수가 정해져 있는 경우 : for 문 사용
        * 2) 반복할 횟수가 정해져 있지 않는 경우 : while 문 사용
        * */

         // 5번  System.out.println("출력"); 을 써야할 때
        // System.out.println("출력"); x5 대신 while문 사용

        int i = 1; // 반복횟수를 체크할 변수
        while(i<=5)   {
            System.out.println("출력" + i);
            i+=1;
        }

        int j = 1;
//        int j = 6;

        do {
            //실행문
            System.out.println("무조건 수행");
            System.out.println("j = " + j);
            j++;
        }while(j<=5); // 조건

    }
}
