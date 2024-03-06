package j0306;

import java.util.ArrayList;

/*
*  add() 메소드로 요소 삽입
get() 메소드로 요소 검색
* 
* ArrayList : 리스트 내부에 배열이 들어가 있는 구조. 동적배열
*
* */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();
        li.add("들어가냐");
        li.add("호이잇");
        li.add("배가고픈건가");
        li.add("집에가고프네");
        li.remove(2);

        System.out.println(li); // [들어가냐, 호이잇, 배가고픈건가, 집에가고프네]

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}
