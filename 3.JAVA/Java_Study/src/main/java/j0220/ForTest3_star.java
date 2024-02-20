package j0220;

public class ForTest3_star {
    public static void main(String[] args) {


        // 이중 for 문. 별찍기

        System.out.println("================");


        for (int a = 1; a<=5; a++){
            for(int b = 1; b<=5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========별찍기==========");

        for(int i = 1; i<=5; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("========별찍기==========");
    }
}
