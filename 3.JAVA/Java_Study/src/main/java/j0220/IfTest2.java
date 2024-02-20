package j0220;

public class IfTest2 {

    //중첩 if 문
    public static void main(String[] args) {
        /*
        * 입력 받은 수가 1~100 사이인 숫자만 입력받기
        * 그 수가 짝or홀수인지
        * */
        int su = 1;
        if(su>=1 && su<=100) {
            if (su % 2 == 0) { // 하나의 조건식에 처리할 구문이 한문장 이상일 경우 {} 로 블럭을 만들어야 함.
                System.out.println(su + "은 짝수");
                System.out.println("블럭처리 연습1");

            } else {
                System.out.println(su + "은 홀수");
                System.out.println("블럭처리 연습2");

            }
        }else {
            System.out.println("1~100 사이 숫자의 값만 입력하시오.");
            
        }
    }
}
