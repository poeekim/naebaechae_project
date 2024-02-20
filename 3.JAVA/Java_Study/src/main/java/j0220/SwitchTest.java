package j0220;

public class SwitchTest {
    public static void main(String[] args) {



        int su = 50;
/*        if(su>=1 && su<=100) {
            if (su % 2 == 0) {
                System.out.println(su + "은 짝수");
            } else {
                System.out.println(su + "은 홀수");
            }
        }else {
            System.out.println("1~100 사이 숫자의 값만 입력하시오.");
        }*/

        //   위 if 문을 Switch문으로 바꾸기

        switch (su%2){ // 조건식에 따라서 case의 갯수가 정해지니 조건식 정할 때 주의.
            case 0 :
                System.out.println("짝수");
                break;
            case 1 :
                System.out.println("홀수");
                break;
        }
    }


}
