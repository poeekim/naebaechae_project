package j0229;

import java.util.Date;

// 오늘날짜를 구하시오
// Date class |  Calendar class
public class SimpleTest {
    public static void main(String[] args) {

        Date d = new Date(); // 객체 만드는 방법 ⅰ : new 연산자로 만들기
        System.out.println(d); // Thu Feb 29 11:37:40 KST 2024
        System.out.println("------------------------------------");
        SimpleTest st = new SimpleTest(); // 일반 메소드인 getDate 를 호출하기 위함.
        Date t = st.getDate();
        System.out.println("t = " + t);
        System.out.println("------------------------------------");
        st.setDate(d);

    }
    // 객체 만드는 방법 ⅱ :  메소드 매개변수로 전달받아서 출력하기
    //   ★★★ 표현식) 접근지정자 반환형(=객체형)     getXXX() { return 생성한 객체명;}
    public Date getDate() {
        Date d = new Date(); // return new Date(); 로 적어도 됨. (익명객체라고 불림)
        return d;

    }

    // 객체 만드는 방법 ⅲ : 메소드의 반환형으로 전달받아서 출력하기
    // 표현식) pulbic void setXXXX(전달받을 클래스명 객체명(임의로 작성가능){처리구문}

    public void setDate(Date d2) {
        System.out.println("d2 = " + d2);
    }
    

}
