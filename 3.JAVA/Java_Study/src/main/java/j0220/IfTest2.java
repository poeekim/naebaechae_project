package j0220;

public class IfTest2 {

    public static void main(String[] args) {
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


    }
}
