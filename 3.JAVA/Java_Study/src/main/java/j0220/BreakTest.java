package j0220;

public class BreakTest {
    public static void main(String[] args) {


        // 이중 for 문. 별찍기

        System.out.println("=========break문==========");

        for(int i = 0; i<=5; i++){
            for (int j = 0; j<=5; j++){
                if(j==2){
//                    System.out.println("!");
                    System.out.println("i = "+i+", j = " + j);
                    break;
                }


            }
            System.out.println();
        }
    }
}
