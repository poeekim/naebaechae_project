package j0221;

public class SumBreak {
    public static void main(String[] args) {

        //
        /*
        1~100 사이의 수 중 3의 배수 또는 5의 배수의 합을 구한 값중에서 합계가 200 을 넘어가는 최소의 값을 구하라.

        1) 1~100까지의 합
        2) 3의 배수 , 5의 배수 필터링
        3)
        * */

        int sum=0;
        int result=0;
        for(int i =0; i<=100; i++){
            if(i%3==0 || i%5==0){
                sum= sum+i;
                System.out.println("sum = " + sum);
                if(sum >= 200){
                    result = sum;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
