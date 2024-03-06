package j0306;

// Set, Map 사용법

import java.util.*;

/*
 클래스에서 제공하는 size()를 사용해서 for문으로 데이터를 가져오는 방법도 있지만 
 순환 인터페이스인 iterator와 Enumeration을 사용하는 방법도 있다.
    :  스레드(thread)의 지원 여부 차이.
 iterator - 스레드에 안전하지 않음.


!!!!!
스레드 안전(Thread Safe)이란 멀티 스레드 프로그래밍에서 일반적으로 어떤 함수나 변수,
혹은 객체가 여러 스레드로부터 동시에 접근이 이루어져도 프로그램의 실행에 문제가 없음을 의미한다. 
ex) 공유 자원에 대한 동시접근ㅇ르 막지 않았다면 N명이 동시에 100만원을 출금할 시,
100만원이 100 * N 만원이 되어버리는 상황을 빗대어 '스레드 안전하지 않은 상황' 이라고 한다.
== 하나의 함수가 한 스레드로부터 호출되어 실행 중일 때,
    다른 스레드가 그 함수를 호출하여 동시에 함께 실행되더라도
    각 스레드에서의 함수의 수행 결과가 올바르게 나오는 것으로 정의함.
!!!!!





* */
public class EnumTest {

    public static void main(String[] args) throws Exception{
        System.out.println("Set(중복 허용 X, 저장순서 X");
        HashSet hs = new HashSet<>();
        hs.add("abc");
        hs.add("abc");
        hs.add("abc1");
        hs.add("abc1");
        hs.remove("abc");
        hs.clear(); // 전부삭제

        System.out.println(hs.size()); // 2
        System.out.println(hs); // index 구분X , 순서 X
        System.out.println("===============");

        // 검색
        Vector<String> v = new Vector<>();
        v.add("test1");
        v.add("test2");
        v.add("test3");

        // Map<k,v> 표 형태로 저장 : 세션처리(회원로그인 등) 30분 이후부터 로그인 세션 만료 같은..
        Hashtable<Integer, String> h = new Hashtable<>(); // 키의 경우는 중복을 허용하지 않으며 Value 의 경우는 중복을 허용.
        h.put(1, "1번이지롱"); // put : 값 집어넣기
        h.put(2, "홍길동");
        h.put(3, "010-123-4567");
        h.put(4, "메밀차");
        h.put(5, "value");

        h.get(1); // get : 값 꺼내기
        System.out.println(h.get(1));
        System.out.println("================enumeration=======================");

        // 검색하기 (enumeration, iteator)
        // 1. Enumeration. 저장된 순서 그대로 가져올 때
        Enumeration<String> eu = v.elements(); // vector 클래스를 사용해서 enumeration 인터페이스의 eu 객체를 elements()메소드를 통해 생성.
        while (eu.hasMoreElements()) {
            System.out.println(eu.nextElement());
        }

        System.out.println("================Iterator=======================");

        // 2. Iterator. 저장된 순서대로 가져오지 못함.
        // Collection -> Iterator 객체를 얻어올 수 있다.(2번 거쳐서 실행) ..? HashTable 이라서 collection 을 한번 거쳐야하는건가?
        Iterator<String> ite = v.iterator();

        while (ite.hasNext()) {
            String s = ite.next();
            System.out.println(s);
            //ite.remove(); // next에 나온 값을 list에서 삭제함
        }


        

    }
}
