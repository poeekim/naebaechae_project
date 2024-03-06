package j0306;

/*
* Vector
*
*
* */


import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) throws Exception{
        Vector <String> v = new Vector(); // 동적 배열
        v.add("테스트");
        v.addElement("엘리먼트 테스트"); // addElement 는 잘 안쓰고 add 로 통합되어 사용하고 있음.
        v.add("테스트2");
        v.add("100");
        System.out.println("v의 크기 = " + v.size()); // 4

        for (int i = 0; i < v.size(); i++) {
            String temp =(String)v.elementAt(i);
            System.out.println("------------------");
            System.out.println(v.get(i));

        }
        // 다양한값 저장
        Vector <Object>v2 = new Vector();
        v2.add('a');
        v2.add(100);
        v2.insertElementAt(3.141592, 1);
      //  System.out.println(v2,.O);u
        v2.setElementAt("Set", 2);

        for(int i =0; i<v2.size(); i++){
            System.out.println("v2 = " + v2.elementAt(i));
        }

    }
}
