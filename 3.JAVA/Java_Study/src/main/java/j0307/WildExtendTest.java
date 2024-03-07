package j0307;

import java.util.ArrayList;
import java.util.List;

/*
*  2. <? extend T> : 상속관계로 이루어진 클래스만 메소드의 매개변수로 전달 받겠다는 표시
*   부모클래스 = Test, Person
*   자식클래스 = Woman, Man
* */

class Test{
    String name;
}
class Person{
    String name;
}

class Man extends j0307.Person {
    Man(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Woman extends j0307.Person {
    Woman(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class WildExtendTest {
    public static void main(String[] args) {

        // 1. Man
        List<j0307.Man> list = new ArrayList<>();
        /*
        * Man m = new Man("임시")
        * list.add(m);
        * */
        list.add(new j0307.Man("임시1"));
        list.add(new j0307.Man("임시2"));
        printData(list);

        // 2. Woman
        List<j0307.Woman> list2 = new ArrayList<>();

        list2.add(new j0307.Woman("임시3"));
        list2.add(new j0307.Woman("임시4"));
        printData(list2);

        // 3. Person
        List<j0307.Person> list3 = new ArrayList<>();

        list3.add(new j0307.Person());
        printData(list3);

        // 4. Test
        List<j0307.Test> list4 = new ArrayList<>();

        list4.add(new j0307.Test());
        // printData(list4); = Test 는 printData 메소드 호출 불가.


    }

        public static void printData(List<? extends j0307.Person> list){ // <? extends 부모클래스>
        // 부모클래스인 Person 의 매개변수와, Person 을 상속받은 Man, Woman 도 가능하다.
            for (Object obj : list) {
                System.out.println(obj);
            }
        }
}
