package j0227;

public class DoubleTest {

    // 2차원 배열

    public static void main(String[] args) {

        System.out.println("2차원 배열 생성 및 가변배율");
        // 표현식) 배열명[][] = new 자료형[행의 개수][열의개수]
        int c[][] = new int[3][3];
        // 배열명[][]={{값1, 값2},{..,..},{..,..}}
        int b[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i<b.length; i++) {
//            System.out.println("b[" + i + "] = " + b[i]);
            for(int j=0;j<b[i].length;j++){
                System.out.println("b["+i+"]["+j+"] = " + b[i][j]);
            }
        }

        System.out.println("================================");

        int sum = 0;
        for (int temp[] : b) { // temp[] = {10,20,30}, temp[]={40,50}
            for(int su:temp){
                System.out.print(su + "\t");
                sum += su;
            }
            System.out.println();
        }
        System.out.println("누적 sum =" + sum);

    }
}
