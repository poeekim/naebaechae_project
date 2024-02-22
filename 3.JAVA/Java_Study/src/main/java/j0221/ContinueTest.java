package j0221;

public class ContinueTest {
    public static void main(String[] args) {


        // 이중 for 문. 별찍기

        System.out.println("=========continue 테스트==========");

        for(int i = 0; i<=5; i++){
            for (int j = 0; j<=5; j++){
                if(j==2) continue;
                    System.out.println("i = "+i+", j = " + j);


            }
            System.out.println();
        }
    }
}
