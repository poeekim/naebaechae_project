package j0306;
/*
* 회원가입 -> 회원로그인 (관리자만 회원 리스트 목록을 볼 수 있다.)

* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Person{ // DTO : Data Transfer Object
    private String name;
    private int age;

    public Person(String name, int age) { // 기본 생성자(default constructor)
        this.name = name;
        this.age = age;
    }

    public Person() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ArrayListTest2 {
    public static void main(String[] args) throws Exception {

        //값을 입력받아서 한번 저장 한 후에 수동으로 여러개의 데이터를 저장한다


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int age;
        
        System.out.println("이름 입력");
        name = br.readLine();

        System.out.println("나이?");
        age = Integer.parseInt(br.readLine());

        Person p = new Person(name, age);

        Person p2 = new Person();
        p2.setName("p2 의 이름"); // 웹상에서는 inputbox 입력한 값
        p2.setAge(13); // 웹상에서는 inputbox 에 입력한 값

        Person p3 = new Person();
        p2.setName("p3 의 이름"); // 웹상에서는 inputbox 입력한 값
        p2.setAge(33); // 웹상에서는 inputbox 에 입력한 값
        
        // ArrayList를 이용하여 저장
        ArrayList<Person> li = new ArrayList<>(); // 객체배열이면서 동적배열인 상태
        li.add(p);
        li.add(p2);
        li.add(p3);

        // 출력
        ArrayListTest2 alt = new ArrayListTest2();
        alt.setPersonList(li);

    }

    // ArrayList<Person> 를 매개변수로 전달받아서 출력
    // 1. 회원리스트 객체를 받아서 출력하는 메소드
    public void setPersonList(ArrayList<Person> li) {
       for (int i = 0; i < li.size(); i++) {
            Person st = li.get(i);
            System.out.println("이름 : " + st.getName());
            System.out.println("age = " + st.getAge());

        }


    }


    // 2. 웹상에서 어떻게 출력시켜주는 보여주는 메소드 (테이블 >  ArrayList > jsp 에 전달)
    public ArrayList<Person> getPersonList() {
        // DB에 접속해서 덷이터를 가져온다는 전제(JDBC)
        ArrayList<Person> li2 = new ArrayList<>();
        li2.add(new Person("hong", 56));
        li2.add(new Person("kim", 78));
        li2.add(new Person("park", 20));
        li2.add(new Person("lee", 56));
        return li2;
    }
}
