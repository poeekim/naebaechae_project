package j0306;

import java.util.*;

public class ThreeTest2 {
    public static void main(String[] args) {
   /*
1)Scanner 객체를 생성해서 입력을 받을 수 있도록 소스코드를 변경할것
2)Scanner 클래스 객체를 생성,얻어오는 다음과 같은 2개의 메서드를
  작성하시오.

improt java.util Scanner
Scanner Scanner=new Scanner(system.in)

   =>getScan(), setScan()로 변경해서 작업할것.(소스를 수정할것)
   */

    ThreeTest2 tt2 = new ThreeTest2();
    Scanner sc=tt2.getScan();
    tt2.setScan(sc);

    }


    // 1. Scanner 객체를 생성해서 반환해주는 메소드
    // 형식) 객체의 자료형(Scanner) getXXX() { return 생성된 객체명;}
    public Scanner getScan(){
        Scanner sc = new Scanner(System.in);
        return sc;

    }
    // 2. public void setXXX(전달받을 객체자료형 객체명){처리 구문}
    public void setScan(Scanner sc) {
        System.out.print("x값을 입력해주세요 : ");
        int x=sc.nextInt();
        System.out.print("y값을 입력해주세요 : ");
        int y=sc.nextInt();
        System.out.print("z값을 입력해주세요 : ");
        int z=sc.nextInt();

        int result = 0;
        result = (x > y && x > z) ? x : (y > x && y > z) ? y : z;
        System.out.println("최대값은 "+result+"입니다");
    }


    }




