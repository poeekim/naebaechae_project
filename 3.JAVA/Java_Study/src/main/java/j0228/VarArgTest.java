package j0228;

public class VarArgTest {


/*    public void print(String a) {
        System.out.println("a = " + a);
    }

    public void print(String a, String b) {
        System.out.println("a = " + a+ "b= "+b);
    }

    public void print(String a, String b, String c) {
        System.out.println("a = " + a+ "b= "+b+ "c ="+c);
    }*/

    static void print(String ...names){ // 동적배열을 매개변수로 갖는 메소드

        /*
        * String names[]={"홍길동"}
        * String names[]={"홍길동","테스트"}
        * String names[]={"홍길동","테스트","임시"}
        * ...
        * */
        for (String str : names) {
            System.out.print("str = " + str+"\t");
            System.out.println();
        }
    }
    public void print2(String[] names) { // 정적배열을 매개변수로 갖는 메소드
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VarArgTest vat = new VarArgTest();
        //추가
        String str[] = {"배열의 활용", "동적배열", "상속",};
        vat.print2(str);

        vat.print("홍길동");
        vat.print("홍길동", "테스트");
        vat.print("홍길동", "테스트", "임시");

    }


}
