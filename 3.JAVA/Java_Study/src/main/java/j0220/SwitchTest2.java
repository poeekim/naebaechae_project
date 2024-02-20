package j0220;

public class SwitchTest2 {
    public static void main(String[] args) {


        System.out.println("Switch 구문 내 범위를 지정하기");

        int su = 50;
        switch (su){
            case 2: case 4:
            case 6:
            case 8:
            case 10 :
                System.out.println(su);
                break;
            case 1 :
                System.out.println(su);
                break;
        }
    }


}
