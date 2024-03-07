package j0307;

import java.util.ArrayList;
import java.util.List;

/*
*  1. <?> : 와일드 카드를 이용한 제네릭 방법
*   메소드 호출 시 매개변수를 전달할 때 사용
*
*
* */
public class WildTest {
    public static void main(String[] args) {
        // 1. 문자열
        List<String> list = new ArrayList<>();
        list.add("테스트1");
        list.add("테스트2");
        list.add("테스트3");
        printData(list);

        // 2. 정수형
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        printData(list2);

        // 3. 실수형(소수)
        List<Double> list3 = new ArrayList<>();
        list3.add(10.5);
        list3.add(20.5);
        list3.add(30.5);
        printData(list3);
    }

/*    public static void printData(List<String> list) {
        // 오버로딩으로(printData(List<Integer> list) 설정 불가 : 제네릭만 바꿀게 아니라, List 타입을 바꿔야하므로 좋은 방법이 아님.
        for (String obj : list) {
            System.out.println(obj); // .toString() 이 생략되어 있음.
        }
    }*/
        public static void printData(List<?> list){ // 매개변수를 전달 받을 때 자료형을 바꿔서 전달 받을시 <?>로 제네릭을 변경한다.
            for (Object obj : list) { // Object로 변경하여 전달 받은 매개변수 타입에 따라 알아서 객체 형변환이 된다고 생각하면 될듯.
                System.out.println(obj);
            }
        }
}
