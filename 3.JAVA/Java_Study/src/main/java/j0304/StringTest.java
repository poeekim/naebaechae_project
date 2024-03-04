package j0304;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력바람");
        String input = sc.nextLine();
       // System.out.println("입력된 문자열 = "+ input);
        /*
        * static 에서 static 을 부르니까 아래와 같이 작성할 수 있다.
        * */
        stringPrint(input);
    }

    // 매개변수가 O(String s) 반환값 X
    // String s는 hello 로 정하고 테스트함
    public static void stringPrint(String s) {
        // 1. 문자열 합치기 : concat
        System.out.println("s.concat('test') : " + s.concat("test")); // hellotest
        // 2. 문자열 출력하기 : substring (시작인덱스, 종료인덱스-1)
        System.out.println("s.substring(1,4) : " + s.substring(1,4)); // hello -> ell
        // 3. 시작인덱스번호부터 끝까지 출력
        System.out.println("s.substring(1) : " + s.substring(1)); // hello -> ello
        // 4. 대문자로 변환 : toUpperCase /  소문자로 변환 : toLowerCase
        System.out.println("s.toUpperCase : " + s.toUpperCase()); // HELLO
        System.out.println("s.toLowerCase : "+s.toLowerCase()); // hello
        // 5. 특정문자열을 변경 : replace(변경전단어, 변경후단어)
        System.out.println("s.replace() : "+s.replace('e','a')); // hallo
        // 6. 문자열의 길이 : length
        System.out.println("s.length : "+s.length()); // 5
        // 7. 문자열중에 특정위치에 있는 문자출력 -> charAt(인덱스 번호)
        System.out.println("s.charAt : "+ s.charAt(1)); // e
        // 8. 문자열내 특정문자의 위치를 앞에서부터 알아내기 : indexOf('찾는문자') -> 인덱스번호 출력
        System.out.println("s.indexOf : "+s.indexOf('o')); // 4
        // 9. 문자열내 특정문자의 위치를 뒤에서부터 알아내기 : lastIndexOf('찾는문자') -> 인덱스번호는 앞에서 0부터 계산되어 출력
        System.out.println("s.lastIndexOf : "+ s.lastIndexOf('o')); // 4
        // 10. 공백제거 : trim
        System.out.println("s.trim : " + s.trim()); // hello
    }
}


