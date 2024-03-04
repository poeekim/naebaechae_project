package j0304;

public class HelloTest2 {
    public static void main(String[] args) throws Exception {
/*
        int i = 0;
        String greetings[] = {"객체형변환", "예외처리", "예외처리방법"};

        while (i < greetings.length) {
            System.out.println(greetings[i]);
            i++;*/
        try {
            HelloTest2 ht = new HelloTest2();
            ht.go();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 첨자 계산이 잘못되었다.");
            System.out.println(e.getMessage()); // 간단한 에러 메시지
            System.out.println(e.toString());
            e.printStackTrace(); // 에러에 관련된 모든 클래스를 추적해서 에러메시지를 띄운다.
    }
}

    //workd method
    public void go() throws ArrayIndexOutOfBoundsException{
        int i = 0;
        String greetings[] = {"객체형변환", "예외처리", "예외처리방법"};

        while (i < greetings.length) {
            System.out.println(greetings[i]);
            i++;

        }


    }
}