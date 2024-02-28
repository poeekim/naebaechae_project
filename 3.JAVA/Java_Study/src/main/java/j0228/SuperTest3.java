package j0228;

// super <-> this
// 자식 클래스에 super(); 생략되어 있는거 기억해라!!!!!!!!!!!!!!!!!!!!!!!!!!

class Person{
    String name;
    int age = 20;

    void print() {
        System.out.println("Person 메서드 : "+ name);
    }

}

class Man extends Person{
    // 상속을 받은 멤버변수와 이름이 같은 변수를 자식클래스에 또 선언이 가능하다. 허나 보통은 잘 안함.
    int age = 40;
// !!!!!!! 자식 클래스에 부모와 동일한 멤버변수가 있다면 어떻게 구분하는가 ?? -> 부모 : super.메소드명  / super.멤버변수명 으로 호출.
    void print() { // 오버라이딩
        System.out.println("자식 클래스의 age : "+ age); // age = this.age 임 : 40
        System.out.println("부모 클래스의 age : "+ age); // 부모클래스의 age 값을 불러오려면 super.age 로 바꿔야함.
        System.out.println("부모 클래스의 super.age : "+ super.age);
        super.print(); // 부모클래스의 print 메소드를 호출
    }
}


public class SuperTest3 {
    public static void main(String[] args) {

        Man m = new Man();
        m.name = "홍길동";
        m.print();


    }
}
