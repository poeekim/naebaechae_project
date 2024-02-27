package j0227;

public class ArrayTest {
    public static void main(String[] args) {

        // 자료형 배열명 [] = new 자료현[갯수]
        int su[]= new int[3];
        System.out.println("su : "+su);

        su[0]=10;
        su[1]=20;
        su[2]=30;
//        System.out.println("su[0] : "+su[0] );

        for (int i = 0; i < su.length; i++) {
            System.out.println("su["+i+"] = "+su[i]);
        }

        int c[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};

        int c1[] = new int[13];
        for (int i = 0; i < c1.length; i++) {
            c1[i]=10*(i+1);

        }
        System.out.println("================================");
        for (int i = 0; i < c1.length; i++) {
            System.out.println("c1["+i+"] = "+c1[i]);
        }
        System.out.println("================================");
        // for(배열의 자료형 출력변수명:출력대상자(배열or컬렉션객체) - 단순히 배열값을 확인하고 싶을 때
        for (int num : c1) {
            System.out.print("num : "+num +'\t');
        }
    }
}
