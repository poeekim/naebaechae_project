package j0307;

public interface Calc {

double  PI=3.141592; // == static final double PI = 3.141592;
    
    public void go();
    //인터페이스에서 일반메서드 기능사용할려면 메서드명 앞에 default써준다.(디폴트 메서드)
    // 인터페이스에서 일반 메소드 사용이 가능하다.
    public  default void test() {
    	System.out.println("일반메서드 연습");
    } 
}
