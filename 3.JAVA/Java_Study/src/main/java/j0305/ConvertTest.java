package j0305;


// 사용자로부터 값을 입력받아 대문자를 입력할 시 소문자로 . 소문자로 입력할 시 대문자로 바꾸시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConvertTest {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열을 입력하시오");
        String s = br.readLine();

        // 문자(Character)인 경우 : isUpperCase(), isLowerCase() 사용
        // 문자열(String) 인 경우 : toUpperCase() , toLowerCase() 사용

        char ch;
        if (s.length()==1){
            ch = s.charAt(0);

            boolean upperCase = Character.isUpperCase(ch);
            if (upperCase) {
                System.out.println(Character.toLowerCase(ch));
            } else{
                System.out.println(Character.toUpperCase(ch));
            }


        }

    }
}
