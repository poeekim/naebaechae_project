package j0229;

/*
* 메소드의 반환형을 통해서 객체를 얻어오는 법
* (자바의 메모리 사용량 확인=자바의 메모리 자동해제)
*
*
*
* */
public class GCCollector {
    public static void main(String[] args) {

        //Runtime r = new Runtime(); // 오류 발생 why? : runtime은 getRuntime() 메소드로 반환받아야한다.
        Runtime r = Runtime.getRuntime();
        System.out.println("r = " + r);

        byte test[] = new byte[1024]; // 1024개의 정수값을 저장할 수 있는 공간
        test[0] = 20;
        test[1] = 34; // ....~ test[1023]=100;
        System.out.println("test = " + test); //참조형 : 클래스, 배열, 인터페이스 // test의 주소값이 출력됨

        // 전체 메모리 사용량 - 남은 양 = 현재 사용하고 있는 메모리 양 (totalMemory : 전체메모리   /  freeMemory : 남은메모리)
        System.out.println("before 사용량 = " + (r.totalMemory() - r.freeMemory()) / 1024 + "K");

        // JAVA 는 불필요한 메모리가 발생할 시 자동으로 메모리를 해제? 하는 기능이 있다 : Garbage Collector
        test = null; // 임의로 주소값을 지움.
        
    }
}
