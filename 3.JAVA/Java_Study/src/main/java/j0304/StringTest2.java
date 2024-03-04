package j0304;

public class StringTest2 {
    public static void main(String[] args) {
    // 1. String 문자열객체명 = "저장할 문자열";
        String str1 = "abc";
        String str2 = "abc"; // str1 이랑 주소도 같음.

        System.out.println(System.identityHashCode(str1)); //1324119927
        System.out.println(System.identityHashCode(str1)); // 1324119927

        String str3 = new String("abc");
        String str4 = new String("abc"); // str3 과 내용은 같지만 주소는 다름.

        System.out.println(System.identityHashCode(str3)); // 990368553
        System.out.println(System.identityHashCode(str4)); // 1096979270


        /*
        *  String vs StringBuffer
        *  > String : 불변 문자열   /   StringBuffer : 가변 문자열(저장된 문자열이 변경됨)
        * */

        if (str1 == str2) {
            System.out.println(" == 는 주소값 비교연산자임. str1 과 str2 의 주소값은 같다");
        }else {
            System.out.println(" == 는 주소값 비교연산자임. str1 과 str2 의 주소값은 다르다");
        }

        if (str3 == str4) {
            System.out.println(" == 는 주소값 비교연산자임. str3 과 str4 의 주소값은 같다");
        }else {
            System.out.println(" == 는 주소값 비교연산자임. str3 과 str4 의 주소값은 다르다");
        }

        // 문자열 비교는 equals() 또는 contentEquals() 를 사용
        System.out.println(str1.equals(str2)); // true
        System.out.println(str3.equals(str4)); // true
        System.out.println("------------------");
        System.out.println(str1.contentEquals(str2));// true
        System.out.println(str3.contentEquals(str4));// true
    }
}
