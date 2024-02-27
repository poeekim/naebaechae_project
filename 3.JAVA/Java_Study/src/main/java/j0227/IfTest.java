package j0227;

public class IfTest {

    public static void main(String[] args) {
/*
        int su = 31;
        if(su%2 == 0){
            System.out.println(su+"은 짝수");
            System.out.println("블럭처리 연습1");

        }else{
            System.out.println(su+"은 홀수");
            System.out.println("블럭처리 연습2");

        }

        // 삼항연산자 -> if문 대체 -> 조건식?참일경우:거짓일경우

        System.out.println("삼항연산자로 변경");
        String su2 = (su % 2 == 0) ? "짝수" : "홀수*/

        System.out.println("-----------------------");


        // 직접 코딩 할 시
        int abs = -500;
        abs=(abs<0)?-abs:abs;
        System.out.println("abs의 절대값 : " +abs);


        // math 메소드를 이용할 시
        abs = Math.abs(-2500);
        System.out.println("abs의 절대값 : " +abs);
        int max = Math.max(12, 789);
        System.out.println("최대값 : " + max);

        int min = Math.min(46, 78);
        System.out.println("최소값 " + min);

    }
}
