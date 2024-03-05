package j0305;

/*
 * sawon.txt 의 기본값은 String임.
 * data.txt 는 자료형에 맞게 저장함(DataOutputTest.java)
 * ------> ????  그럼 객체를 파일로 저장이 가능하냐 (usb / 메일로 전송 가능) ???? -----> 물논
 *
 *  참고) https://zeroco.tistory.com/17
 * 객체의 직렬화,  ObjectOutputStream, ObjectInputStream
 *  직렬화란?  자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술
 *  역직렬화란? byte로 변환된 Data를 원래대로 Object나 Data로 변환하는 기술
 *
 * but! 모든 클래스의 객체가 전부 파일로 저장되는 것은 아님 -> 객체 직렬화가 가능한 클래스로 만들어줘야 한다.(일반클래스 X)
 *
 *
 * */

import java.io.*;

class Person implements Serializable{ // Serializable 인터페이스를 이용

    String name;
    int age;
    String addr;
}
public class ObjectTest {
    public static void main(String[] args) throws Exception{

        Person p = new Person();

        p.name = "홍길동";
        p.age = 24;
        p.addr = "경기도 광명시";

        // 1. 파일로 저장하기
        FileOutputStream fos = new FileOutputStream("C:/webtest/3.JAVA/과제/object.txt");

        // 2. 객체를 통째로 저장하기
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 3. 저장하는 형식 : ~.writeObject (저장할 객체명) <->   .readObject()
        oos.writeObject(p);
        oos.close();
        fos.close();

        // 4. 저장된 데이터 확인하기(역직렬화) : 만들어진 파일의 내용을 다시 메모리상으로 로딩
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/webtest/3.JAVA/과제/object.txt"));
        //
        Person p2 = (Person) ois.readObject();
        System.out.println(p2);
        System.out.println("p = "+p + "/  p2 = " + p2); //  p = j0305.Person@736e9adb/  p2 = j0305.Person@f2a0b8e
        System.out.println("p == p2 : " + (p == p2)); // false
        System.out.println("이름 : " + p2.name + " 나이 : " + p2.age + " 주소 : " + p2.addr);
    }
}
