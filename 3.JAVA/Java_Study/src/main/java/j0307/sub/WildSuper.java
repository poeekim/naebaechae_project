package j0307.sub;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;

/*
*  3. <? extend T> : T(자식클래스)를 고정으로 하고 
* */


class Person{
    String name;
    Person() {}

    Person(String name) {
            this.name=name;
        }
    @Override
    public String toString() {
        return this.name;
        }
}


class Man extends Person{
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
class Woman extends Person{
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

public class WildSuper {
    public static void main(String[] args) {

        // 1. Man
        List<Man> list = new ArrayList<>();

        list.add(new Man("임시1"));
        list.add(new Man("임시2"));
        printData(list);

        // 2. Woman
        List<Woman> list2 = new ArrayList<>();

        list2.add(new Woman("임시3"));
        list2.add(new Woman("임시4"));
        printData(list2);

        // 3. Person
        List<Person> list3 = new ArrayList<>();

        list3.add(new Person("이준혁"));
        list3.add(new Person("강영현"));
        printData(list3);

        // 4. Test
        List<Double> list4 = new ArrayList<>();
        list4.add(12.6);
        list4.add(45.6);
        printData(list4);

    }
         //public static void printData(List<? super Man> list){ // Man, Person 가능
        public static void printData(List<?> list){ // 모든 클래스 가능
            for (Object obj : list) {
                System.out.println(obj);
            }
        }
}
