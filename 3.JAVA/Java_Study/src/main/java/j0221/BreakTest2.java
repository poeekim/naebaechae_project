package j0221;

public class BreakTest2 {
    public static void main(String[] args) {

        System.out.println("=========break문==========");

        A: // 레이블명
        for(int i = 0; i<=5; i++){
            for (int j = 0; j<=5; j++){
                if(j==2){
                    System.out.println("i = "+i+", j = " + j);
                    break A; // 가장 가까운 루프를 탈출
                }
            }
            System.out.println();
        }
    }
}
