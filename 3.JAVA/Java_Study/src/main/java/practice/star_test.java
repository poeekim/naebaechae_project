package practice;

public class star_test {
    public static void main(String[] args) {

        
        /* https://public-void.tistory.com/9
        출력
        *****
        ****
        ***
        **
        *
        */

        for(int i = 5; i>=1; i--){
            for (int j = 1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for (int j=5;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
