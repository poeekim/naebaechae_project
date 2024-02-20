package j0220;

public class ForTest2 {
    public static void main(String[] args) {


        // 이중 for 문. 별찍기

        System.out.println("=========중첩 for 문==========");

        for(int i = 1; i<=5; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
