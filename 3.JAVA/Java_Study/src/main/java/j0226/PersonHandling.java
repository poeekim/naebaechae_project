package j0226;

// 아파트에 거주하는 사람들의 정보 저장(추상화, 캡슐화, 생성자 오버로딩 + this)
class Person {

    // 1. 멤버변수 생성하기
    private String name;
    private int age;

    // 기본생성자
    Person(){ // 매개변수 없는 생성자
        this.name = "ddd"; // p.name 와 동일한 의미. 기본 생성자에서는 객체이름을 쓸 수 없어 this 를 쓴다.
        this.age=60; // p.age 와 동일한 의미.
        System.out.println("난 person 클래스의 기본생성자 호출.");
    }

    Person(String name){
        this.name = name;
        this.age=25;
        System.out.printf("String n이라는 매개변수를 가진 생성자 : name = %s  age = %d \n",name,age);
    }

    Person(int age){
        this.name = "홍길동";
        this.age=age;
        System.out.printf("int a이라는 매개변수를 가진 생성자 : name = %s  age = %d \n",name,age);
    }


    Person(String name,int age){
        this.name = name;
        this.age=age;
        System.out.printf("String n, int a 이라는 매개변수 2개를 가진 생성자 : name = %s  age = %d \n",name,age);
    }

    public void setName(String name) {
        this.name = name; //
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("나이는 음수 불가");
            this.age = 20;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    void print(){ // 단순 반복
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
    }
}

public class PersonHandling {
    public static void main(String[] args) {

        Person p = new Person(); // 자동으로 생성자가 호출된다.

        p.setAge(15);
        p.setName("기면");
        p.print();
        System.out.println("============================");


        // P2는 생성자 1개짜리 ( 클래스명 객체명 = new 생성자명(매개변수1,, 매개변수2.. 매개변수3..)
        // Person 클래스의 p2객체를 생성하면서, 인수 1개 짜리 문자열에 대한 생성자를 호출한다.
        Person p2 = new Person("스트링스트링");
        p2.print();
        System.out.println("============================");
        

        // p3 은 생성자 2개짜리
        Person p3 = new Person("배고파",30);
        p3.print();
        System.out.println("============================");


        p3.setAge(100); // 30 살을 100살로 수정
        p3.setName("이름바꿔용"); // 배고파 이름을 수정
        p3.print(); // 수정한 값으로 출력됨



    }
}
