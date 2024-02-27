package j0227;

public class ArrayDynamic {

    /*
    *   1. 고정 배열 : 배열의 크기가 정해져 있음. 추후 중간 배열 크기 변경 어려움
    *   2. 동적 배열 : 배열에 값을 저장시키면 자동으로 배열의 크기가 증감함.(colleciton 객체)
    *
    * */

    public static void main(String x[]) { // 동적배열

        int sum = 0;
        String str1 = x[0];
        String str2 = x[1];
        String str3 = x[2];

        // str1 ~ str3 은 문자열이므로, 합계를 구할 수 없다. 그럼 어떻게 해야할까 -> Integer.valueof(변수) 로 형변환하기



        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        sum = Integer.valueOf(str1) + Integer.valueOf(str2) + Integer.valueOf(str3);
        System.out.println("sum = " + sum); // 60
    }
}
