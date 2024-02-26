package j0226;




/*
* 1. 메소드(=생성자포함)를 작성할 떄
* 멤버변수와 매개변수가 서로 같을때 구분하는 목적으로 사용한다.
*
* */
public class ThisTest {

    private int a = 100;// (), (a) 이론적으로 생성자 2개 작성가능

    ThisTest(int a){
        //멤버변수= 매개변수
        System.out.println("a = "+ a);
        //a=a;  // 멤버변수가 뭔지, 매개변수가뭔지 정확히 구분을 하지 못하므로, main 에서 200값을 넣어 실행해도 a값에는 초기값인 100이 들어가 있음.
        this.a = a; // this 가 붙은쪽이 멤버변수라는 것을 알려줌..
    }

  public void setA(int a){
        //a=a;
      this.a=a;
  }

  public int getA(){
        return a;
  }

   public static void main(String[] args) {

    ThisTest tt = new ThisTest(200); // = ThisTest 클래스의 객체 tt를 생성하면서 정수형 매개변수 1개짜리를 호출한다
       tt.setA(400);
       System.out.println("tt.getA = "+ tt.getA());




    }
}
