package j0221;

public class StarTest4 {
    public static void main(String[] args) {

/*
 *****
  ****
   ***
    **
     * 
     출력하기

* */
        for(int i = 1; i<=5; i++){
            for (int k=1;k<i; k++)
                System.out.print(" ");
            for (int j=5; j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
            }
        }
    }

