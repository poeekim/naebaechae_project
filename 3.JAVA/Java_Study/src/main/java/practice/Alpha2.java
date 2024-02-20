package practice;

public class Alpha2 {
    public static void main(String[] args) {

//        char c = 'A';
        int re = 65;
/*        System.out.println((int)c); //65
        System.out.println((char)re); //A*/

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)re);
                re+=1;

            }
            System.out.println();
        }
    }
}
